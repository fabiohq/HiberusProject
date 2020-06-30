package co.com.micropago.services;

import co.com.micropago.DTO.RequestRegistroPagoDTO;
import co.com.micropago.entity.ConsolidadoVendedorEntity;

public interface IConsolidadoVendedorServ {

	public ConsolidadoVendedorEntity registroConsolidado(RequestRegistroPagoDTO request) throws Exception;
}
