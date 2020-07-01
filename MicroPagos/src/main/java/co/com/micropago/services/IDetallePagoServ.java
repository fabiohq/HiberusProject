package co.com.micropago.services;

import java.util.List;

import co.com.micropago.entity.DetallePagoEntity;

public interface IDetallePagoServ {

	public List<DetallePagoEntity> registroDetalle(List<DetallePagoEntity> listRequest) throws Exception;
}
