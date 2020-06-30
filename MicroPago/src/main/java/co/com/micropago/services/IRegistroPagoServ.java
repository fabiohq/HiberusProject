package co.com.micropago.services;

import co.com.micropago.DTO.RequestRegistroPagoDTO;
import co.com.micropago.DTO.ResponseRegistroPagoDTO;

public interface IRegistroPagoServ {

	public ResponseRegistroPagoDTO registroPago(RequestRegistroPagoDTO request) throws Exception;
}
