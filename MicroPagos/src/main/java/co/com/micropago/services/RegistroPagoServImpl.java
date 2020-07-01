package co.com.micropago.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.micropago.DTO.RequestRegistroPagoDTO;
import co.com.micropago.DTO.ResponseRegistroPagoDTO;
import co.com.micropago.entity.ConsolidadoVendedorEntity;
import co.com.micropago.entity.DetallePagoEntity;
import co.com.micropago.entity.PagoPendienteEntity;
import co.com.micropago.helpers.Util;
import co.com.micropago.vo.DetallePagoVO;

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
		
		String fechaPago=util.getFechaActual();
		Date fecha = new Date(fechaPago);
		String hora = util.getHoraActual();
		Double valor=0D;
		String docCliente=null;
		for (Iterator<DetallePagoVO> iterator = request.getDetallePagos().iterator(); iterator.hasNext();) {
			DetallePagoVO detalle= iterator.next();
			detalle.setFechaPago(fecha);
			detalle.setHoraVenta(hora);
			detalle.setDocVendedor(request.getDocVendedor());
			valor+=detalle.getValor();
			if(docCliente==null) {
				docCliente=detalle.getDocCliente();
			}
		}
		ConsolidadoVendedorEntity consolidadoVendedor = new ConsolidadoVendedorEntity();
		consolidadoVendedor.setDocVendedor(request.getDocVendedor());
		consolidadoVendedor.setValor(valor);
		consolidadoVendedor.setFecha(fecha);

		consolidadoVendedor = consolidadoService.registroConsolidado(consolidadoVendedor);
		
		List<DetallePagoEntity> detallePagos = new ArrayList<DetallePagoEntity>();
		for(DetallePagoVO detalle : request.getDetallePagos()) {
			DetallePagoEntity detallePago = new DetallePagoEntity();
			detallePago.setDoccliente(detalle.getDocCliente());
			detallePago.setDocvendedor(request.getDocVendedor());
			detallePago.setFechaPago(fecha);
			detallePago.setHoraVenta(hora);			
			detallePago.setNombrecliente(detalle.getNombreCliente());
			detallePago.setReferencia(detalle.getReferencia());
			detallePago.setValor(valor);			
			detallePago.setIdConsolidadoVendedor(consolidadoVendedor.getIdConsolidadoVendedor());
			detallePagos.add(detallePago);
		}
		
		detallePagos = detallePagoService.registroDetalle(detallePagos);
		
		List<PagoPendienteEntity> pagosPendientes = pagoPendienteService.findByDocumento(docCliente);
		
		for(DetallePagoEntity detallePago:detallePagos) {
			
			for (Iterator<PagoPendienteEntity> iterator = pagosPendientes.iterator(); iterator.hasNext();) {
			
				PagoPendienteEntity pagoPendiente=iterator.next();
				if(detallePago.getReferencia().equals(pagoPendiente.getReferencia())) {
					pagoPendiente.setIdDetallePago(detallePago.getIdDetallePago());
					break;
				}
				
			}
		}

		pagoPendienteService.actualizarIdDetalle(pagosPendientes);
		
		ResponseRegistroPagoDTO response = new ResponseRegistroPagoDTO();
		response.setEstado(util.getCodOk());
		response.setDescripcion(util.getDescripcionOk());
		response.setFechaPago(fechaPago);
		response.setHoraPago(hora);
		
		response.setDetallePagos(request.getDetallePagos());
		
		return response;
	}
}