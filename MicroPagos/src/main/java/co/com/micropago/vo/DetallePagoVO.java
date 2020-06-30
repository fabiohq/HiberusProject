package co.com.micropago.vo;

import java.io.Serializable;
import java.util.Date;

public class DetallePagoVO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idDetallePago;
	private Integer idConsolidadoVendedor;
	private Date fechaPago;
	
	private Double valor;
	private String referencia;
	private String docVendedor;
	private String docCliente;
	private String nombreCliente;	
	private String horaVenta;
	
	public Integer getIdDetallePago() {
		return idDetallePago;
	}
	public void setIdDetallePago(Integer idDetallePago) {
		this.idDetallePago = idDetallePago;
	}

	public Integer getIdConsolidadoVendedor() {
		return idConsolidadoVendedor;
	}
	public void setIdConsolidadoVendedor(Integer idConsolidadoVendedor) {
		this.idConsolidadoVendedor = idConsolidadoVendedor;
	}
	public Date getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getDocVendedor() {
		return docVendedor;
	}
	public void setDocVendedor(String docVendedor) {
		this.docVendedor = docVendedor;
	}
	public String getDocCliente() {
		return docCliente;
	}
	public void setDocCliente(String docCliente) {
		this.docCliente = docCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getHoraVenta() {
		return horaVenta;
	}
	public void setHoraVenta(String horaVenta) {
		this.horaVenta = horaVenta;
	}
}
