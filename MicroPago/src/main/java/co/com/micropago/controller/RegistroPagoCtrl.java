package co.com.micropago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.micropago.DTO.RequestRegistroPagoDTO;
import co.com.micropago.DTO.ResponseRegistroPagoDTO;
import co.com.micropago.services.IRegistroPagoServ;

@RestController
@RequestMapping("/registro")
public class RegistroPagoCtrl {

	@Autowired
	private IRegistroPagoServ servicio;
	
	@RequestMapping("/pago")
	public ResponseRegistroPagoDTO registrarpago(@RequestBody RequestRegistroPagoDTO request) throws Exception{
		return servicio.registroPago(request);
	}
}
