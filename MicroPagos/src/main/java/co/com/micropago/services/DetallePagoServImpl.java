package co.com.micropago.services;

import java.util.List;

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
	public List<DetallePagoEntity> registroDetalle(List<DetallePagoEntity> listRequest) throws Exception {

		return repository.saveAll(listRequest);
	}

}
