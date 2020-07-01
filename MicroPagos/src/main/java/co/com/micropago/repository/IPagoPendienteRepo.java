package co.com.micropago.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.micropago.entity.PagoPendienteEntity;

public interface IPagoPendienteRepo extends JpaRepository<PagoPendienteEntity, Integer>{
	
	List<PagoPendienteEntity> findByDocumento(String documento);
	
}
