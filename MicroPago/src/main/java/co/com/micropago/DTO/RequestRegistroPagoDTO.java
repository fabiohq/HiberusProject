package co.com.micropago.DTO;

import java.io.Serializable;

import co.com.micropago.vo.ConsolidadoVendedorVO;
import co.com.micropago.vo.DetallePagoVO;

public class RequestRegistroPagoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private DetallePagoVO detallePago;
	private ConsolidadoVendedorVO consolidadoVendedor;
	
	public ConsolidadoVendedorVO getConsolidadoVendedor() {
		return consolidadoVendedor;
	}
	public void setConsolidadoVendedor(ConsolidadoVendedorVO consolidadoVendedor) {
		this.consolidadoVendedor = consolidadoVendedor;
	}
	public DetallePagoVO getDetallePago() {
		return detallePago;
	}
	public void setDetallePago(DetallePagoVO detallePago) {
		this.detallePago = detallePago;
	}
	
}
