package co.com.micropago.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.micropago.entity.PagoPendienteEntity;

public interface IPagoPendienteRepo extends JpaRepository<PagoPendienteEntity, Integer>{
	
	public PagoPendienteEntity findByReferencia(String referencia);
	
}
