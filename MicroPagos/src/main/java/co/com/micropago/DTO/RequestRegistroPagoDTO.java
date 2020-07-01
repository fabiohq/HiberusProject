package co.com.micropago.DTO;

import java.io.Serializable;
import java.util.List;

import co.com.micropago.vo.ConsolidadoVendedorVO;
import co.com.micropago.vo.DetallePagoVO;

public class RequestRegistroPagoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String docVendedor;
	private List<DetallePagoVO> detallePagos;
	private ConsolidadoVendedorVO consolidadoVendedor;
		
	public String getDocVendedor() {
		return docVendedor;
	}
	public void setDocVendedor(String docVendedor) {
		this.docVendedor = docVendedor;
	}
	public ConsolidadoVendedorVO getConsolidadoVendedor() {
		return consolidadoVendedor;
	}
	public void setConsolidadoVendedor(ConsolidadoVendedorVO consolidadoVendedor) {
		this.consolidadoVendedor = consolidadoVendedor;
	}
	public List<DetallePagoVO> getDetallePagos() {
		return detallePagos;
	}
	public void setDetallePagos(List<DetallePagoVO> detallePagos) {
		this.detallePagos = detallePagos;
	}		
}