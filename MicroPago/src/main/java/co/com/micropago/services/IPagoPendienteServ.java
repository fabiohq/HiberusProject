package co.com.micropago.services;

import co.com.micropago.entity.PagoPendienteEntity;

public interface IPagoPendienteServ {
	PagoPendienteEntity findByReferencia(String referencia);
	public PagoPendienteEntity actualizarIdDetalle(PagoPendienteEntity pagoPendienteEntity) throws Exception;
}
