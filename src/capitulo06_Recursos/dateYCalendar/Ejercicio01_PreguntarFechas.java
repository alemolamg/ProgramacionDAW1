package capitulo06_Recursos.dateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import alemol.UtilsAlemol;

public class Ejercicio01_PreguntarFechas {

	public static void main(String[] args) {
//		String stringFecha = UtilsAlemol.obtenerTexto("Añade una fecha en el formato \n"
//				+ "dd/MM/yyyy");
		String stringFecha = "5/08/2019";
		
		SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy");
		Date fechaParseada = null;
		
		try {
			fechaParseada = sdf1.parse(stringFecha);
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		
		System.out.println("Fecha parseada: " + sdf1.format(fechaParseada));
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(fechaParseada);
		
		mostrarConsola(calendario, fechaParseada);
	}
	
	
	public static void mostrarConsola(Calendar calendario, Date fecha) {
		System.out.println("Año desde fecha " + new SimpleDateFormat("yyyy").format(fecha));
		System.out.println("Año desde calendar " + calendario.get(Calendar.YEAR));
		
		System.out.println("Mes desde fecha " + new SimpleDateFormat("MM").format(fecha));
		System.out.println("Mes desde calendar " + calendario.get(Calendar.MONTH + 1));
		
		System.out.println("Dia desde fecha " + new SimpleDateFormat("dd").format(fecha));
		System.out.println("Dia desde calendar " + calendario.get(Calendar.DAY_OF_MONTH));
	}
	
}
