package co.com.micropago.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.micropago.entity.PagoPendienteEntity;
import co.com.micropago.repository.IPagoPendienteRepo;


@Service
public class PagoPendienteServImpl implements IPagoPendienteServ{

	@Autowired
	private IPagoPendienteRepo repository;
	@Override
	public PagoPendienteEntity findByReferencia(String referencia) {
		return repository.findByReferencia(referencia);
	}
	
	@Override
	public PagoPendienteEntity actualizarIdDetalle(PagoPendienteEntity pagoPendiente) throws Exception {
		return repository.save(pagoPendiente);
	}

}
