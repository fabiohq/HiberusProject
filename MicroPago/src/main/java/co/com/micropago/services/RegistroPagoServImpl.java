package co.com.micropago.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.micropago.DTO.RequestRegistroPagoDTO;
import co.com.micropago.DTO.ResponseRegistroPagoDTO;
import co.com.micropago.entity.ConsolidadoVendedorEntity;
import co.com.micropago.entity.DetallePagoEntity;
import co.com.micropago.entity.PagoPendienteEntity;
import co.com.micropago.helpers.Util;

@Service
public class RegistroPagoServImpl implements IRegistroPagoServ{

	@Autowired
	private IConsolidadoVendedorServ consolidadoService;
	@Autowired
	private IDetallePagoServ detallePagoService;
	@Autowired
	private IPagoPendienteServ pagoPendienteService;
	@Autowired
	private Util util;
	@Override
	public ResponseRegistroPagoDTO registroPago(RequestRegistroPagoDTO request) throws Exception {
		String fechaPago = util.getFechaActual();
		request.getConsolidadoVendedor().setFecha(new Date(fechaPago));
		request.getDetallePago().setFechaPago(request.getConsolidadoVendedor().getFecha());
		request.getDetallePago().setHoraVenta(util.getHoraActual());
		
		ConsolidadoVendedorEntity consolidado = consolidadoService.registroConsolidado(request);
		request.getDetallePago().setIdConsolidadoVendedor(consolidado.getIdConsolidadoVendedor());
		DetallePagoEntity detalle = detallePagoService.registroDetalle(request);
		PagoPendienteEntity pagoPendiente = pagoPendienteService.findByReferencia(request.getDetallePago().getReferencia());
		pagoPendiente.setIdDetallePago(detalle.getIdDetallePago());
		pagoPendienteService.actualizarIdDetalle(pagoPendiente);
		
		ResponseRegistroPagoDTO response = new ResponseRegistroPagoDTO();
		response.setEstado(util.getCodOk());
		response.setDescripcion(util.getDescripcionOk());
		response.setFechaPago(fechaPago);
		response.setHoraPago(request.getDetallePago().getHoraVenta());
		response.setDetallePago(request.getDetallePago());
		
		return response;
	}
}