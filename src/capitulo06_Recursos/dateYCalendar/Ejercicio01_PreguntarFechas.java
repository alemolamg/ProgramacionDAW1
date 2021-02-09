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
		
		distintosDias(calendario);
		
	}
	
	
	public static void mostrarConsola(Calendar calendario, Date fecha) {
		System.out.println("Año desde fecha " + new SimpleDateFormat("yyyy").format(fecha));
		System.out.println("Año desde calendar " + calendario.get(Calendar.YEAR));
		
		System.out.println("Mes desde fecha " + new SimpleDateFormat("MM").format(fecha));
		System.out.println("Mes desde calendar " + calendario.get(Calendar.MONTH + 1));
		
		System.out.println("Dia desde fecha " + new SimpleDateFormat("dd").format(fecha));
		System.out.println("Dia desde calendar " + calendario.get(Calendar.DAY_OF_MONTH));
	}
	
	
	public static void distintosDias(Calendar calendario) {
		System.out.println("Fecha original: " + calendario.toString());
		
		calendario.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Fecha actual + 3 dias: " + calendario.getTime());

		calendario.add(Calendar.WEEK_OF_YEAR, -2);
		System.out.println("Fecha actual - 2 semanas: " + calendario.getTime());
		
		calendario.add(Calendar.DAY_OF_YEAR, 300);
		System.out.println("Fecha actual + 300 dias: " + calendario.getTime());
		
		calendario.add(Calendar.YEAR, 4);
		System.out.println("Fecha actual + 4 años: " + calendario.getTime());
		
		
	}
	
	
	private static void ejemploSumaRestaFechas () {
		Calendar ahora = Calendar.getInstance();
		ahora.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println("Ahora más 20 días : " + ahora.getTime());

		ahora = Calendar.getInstance();
		ahora.add(Calendar.DAY_OF_MONTH, -20);
		System.out.println("Ahora menos 20 días : " + ahora.getTime());
	}
	
}
