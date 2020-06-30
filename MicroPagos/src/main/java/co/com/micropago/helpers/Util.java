package co.com.micropago.helpers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;


@Component
public class Util {
	private static final String COD_OK="0";
	private static final String DESCRIPCION_OK="Transaccion Exitosa";
	private StringBuilder sb  = new StringBuilder();
	
	public String getFechaActual() {		
		return new SimpleDateFormat("YYYY/MM/dd").format(new Date());
	}
	public String getHoraActual() {	
		Calendar calendario = Calendar.getInstance();
		sb.setLength(0);
		int hora =calendario.get(Calendar.HOUR_OF_DAY);
		int minutos = calendario.get(Calendar.MINUTE);
		int segundos = calendario.get(Calendar.SECOND);
		
		sb.append(hora);
		sb.append(":");
		sb.append(minutos);
		sb.append(":");
		sb.append(segundos);
		
		return sb.toString();
	}
	
	public String getCodOk() {		
		return COD_OK;
	}
	
	public String getDescripcionOk() {		
		return DESCRIPCION_OK;
	}
	
	
}
