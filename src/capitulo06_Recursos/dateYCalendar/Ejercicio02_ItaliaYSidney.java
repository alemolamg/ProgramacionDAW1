package capitulo06_Recursos.dateYCalendar;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio02_ItaliaYSidney {
	
	public static Calendar ahoraEnItalia = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
	public static Calendar ahoraEnAustralia = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
	
	public static void main(String[] args) {
		
		System.out.println("Hora Italia: " + ahoraEnItalia.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora Australia: " + ahoraEnAustralia.get(Calendar.HOUR_OF_DAY));
		
		calcularDiferenciaEntreFechas();
//		ejemploZonasHorarias();
		
	}
	
	public static void calcularDiferenciaEntreFechas() {
		short horaAustralia = (short) ahoraEnAustralia.getInstance().HOUR_OF_DAY;
		short horaItalia = (short) ahoraEnItalia.getInstance().HOUR_OF_DAY;
		
		short diferencia = (short) Math.abs(horaAustralia - horaItalia);
	 
		System.out.println("La diferencia en horas es: " + diferencia);
	}

	private static void ejemploZonasHorarias () {
		Calendar ahoraEnEspania = Calendar.getInstance(TimeZone.getDefault());
		Calendar ahoraEnCanada = Calendar.getInstance(TimeZone.getTimeZone("Canada/Central"));
		Calendar ahoraEnNewYork = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		
		System.out.println("Hora española: " + ahoraEnEspania.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora canadiense: " + ahoraEnCanada.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora en New York: " + ahoraEnNewYork.get(Calendar.HOUR_OF_DAY));
		
		// Podemos obtener todos las zonas horarias disponibles
		String zonasHorarias[] = TimeZone.getAvailableIDs();
		for (String str : zonasHorarias)
			System.out.println("Zona horaria: " + str);
//		System.out.println("Zona horaria disponible: " + Arrays.toString(zonasHorarias));
		
		// Tambi�n podemos fabricarnos una zona horaria determinada, si no hallamos la que buscamos
		// Cuidado con los horarios de verano!!!
		Calendar unaZona= Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
		Calendar otraZona= Calendar.getInstance(TimeZone.getTimeZone("GMT-4:00"));
		System.out.println("GMT+8:00: " + unaZona.get(Calendar.HOUR_OF_DAY));
		System.out.println("GMT-4:00: " + otraZona.get(Calendar.HOUR_OF_DAY));
	}
	
}
