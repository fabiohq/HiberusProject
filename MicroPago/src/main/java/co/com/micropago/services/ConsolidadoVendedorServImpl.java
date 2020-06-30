package co.com.micropago.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.micropago.DTO.RequestRegistroPagoDTO;
import co.com.micropago.DTO.ResponseRegistroPagoDTO;
import co.com.micropago.entity.ConsolidadoVendedorEntity;
import co.com.micropago.repository.IConsolidadoVendedorRepo;

@Service
public class ConsolidadoVendedorServImpl implements IConsolidadoVendedorServ{

	@Autowired
	private IConsolidadoVendedorRepo repository;
	@Override
	public ConsolidadoVendedorEntity registroConsolidado(RequestRegistroPagoDTO request) throws Exception {
		ConsolidadoVendedorEntity entity = new ConsolidadoVendedorEntity();
		entity.setDocVendedor(request.getConsolidadoVendedor().getDocVendedor());
		entity.setFecha(request.getConsolidadoVendedor().getFecha());
		entity.setValor(request.getConsolidadoVendedor().getValor());
		return repository.save(entity);
	}

}
