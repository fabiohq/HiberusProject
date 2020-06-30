package co.com.micropago.vo;

import java.io.Serializable;
import java.util.Date;

public class ConsolidadoVendedorVO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idConsolidadoVendedor;
	private Date fecha;
	private Double valor;
	private String docVendedor;

	public Integer getIdConsolidadoVendedor() {
		return idConsolidadoVendedor;
	}

	public void setIdConsolidadoVendedor(Integer idConsolidadoVendedor) {
		this.idConsolidadoVendedor = idConsolidadoVendedor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDocVendedor() {
		return docVendedor;
	}

	public void setDocVendedor(String docVendedor) {
		this.docVendedor = docVendedor;
	}	
}
