package co.com.micropago.services;

import java.util.List;

import co.com.micropago.entity.PagoPendienteEntity;

public interface IPagoPendienteServ {
	
	List<PagoPendienteEntity> findByDocumento(String documento);
	
	public List<PagoPendienteEntity> actualizarIdDetalle(List<PagoPendienteEntity> pagosPendienteEntity) throws Exception;
}
