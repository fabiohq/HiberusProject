package co.com.micropago.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.micropago.DTO.RequestRegistroPagoDTO;
import co.com.micropago.entity.DetallePagoEntity;
import co.com.micropago.repository.IDetallePagoRepo;

@Service
public class DetallePagoServImpl implements IDetallePagoServ{

	@Autowired
	private IDetallePagoRepo repository;
	@Override
	public DetallePagoEntity registroDetalle(RequestRegistroPagoDTO request) throws Exception {
		DetallePagoEntity entity = new DetallePagoEntity();
		entity.setDoccliente(request.getDetallePago().getDocCliente());
		entity.setDocvendedor(request.getDetallePago().getDocVendedor());
		entity.setFechaPago(request.getDetallePago().getFechaPago());
		entity.setHoraVenta(request.getDetallePago().getHoraVenta());
		entity.setIdConsolidadoVendedor(request.getDetallePago().getIdConsolidadoVendedor());
		entity.setNombrecliente(request.getDetallePago().getNombreCliente());
		entity.setReferencia(request.getDetallePago().getReferencia());
		entity.setValor(request.getDetallePago().getValor());
		return repository.save(entity);
	}

}
