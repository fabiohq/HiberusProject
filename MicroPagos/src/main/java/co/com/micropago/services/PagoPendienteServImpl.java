package co.com.micropago.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.micropago.entity.PagoPendienteEntity;
import co.com.micropago.repository.IPagoPendienteRepo;


@Service
public class PagoPendienteServImpl implements IPagoPendienteServ{

	@Autowired
	private IPagoPendienteRepo repository;
	@Override
	public List<PagoPendienteEntity> findByDocumento(String documento) {
		return repository.findByDocumento(documento);
	}
	
	@Override
	public List<PagoPendienteEntity> actualizarIdDetalle(List<PagoPendienteEntity> pagosPendientesEntity) throws Exception {
		return repository.saveAll(pagosPendientesEntity);
	}

}
