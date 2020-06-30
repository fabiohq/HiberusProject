package co.com.micropago.services;

import co.com.micropago.DTO.RequestRegistroPagoDTO;
import co.com.micropago.entity.DetallePagoEntity;

public interface IDetallePagoServ {

	public DetallePagoEntity registroDetalle(RequestRegistroPagoDTO request) throws Exception;
}
