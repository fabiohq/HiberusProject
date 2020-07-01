package co.com.micropago.DTO;

import java.io.Serializable;
import java.util.List;

import co.com.micropago.vo.DetallePagoVO;

public class ResponseRegistroPagoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String estado;
	private String descripcion;
	private String fechaPago;
	private String horaPago;	
	private List<DetallePagoVO> detallePagos;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}
	public String getHoraPago() {
		return horaPago;
	}
	public void setHoraPago(String horaPago) {
		this.horaPago = horaPago;
	}
	public List<DetallePagoVO> getDetallePagos() {
		return detallePagos;
	}
	public void setDetallePagos(List<DetallePagoVO> detallePagos) {
		this.detallePagos = detallePagos;
	}
}
