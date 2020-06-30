package co.com.micropago.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.micropago.entity.DetallePagoEntity;

public interface IDetallePagoRepo extends JpaRepository<DetallePagoEntity, Integer>{

}
