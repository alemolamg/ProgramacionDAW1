package capitulo06_Recursos.dateYCalendar;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio02_ItaliaYSidney {

	public static void main(String[] args) {
		
		Calendar ahoraEnItalia = Calendar.getInstance(TimeZone.getTimeZone("Italia/Roma"));
		Calendar ahoraEnAustralia = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sidney"));
		
		System.out.println("Hora española: " + ahoraEnItalia.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora canadiense: " + ahoraEnAustralia.get(Calendar.HOUR_OF_DAY));
		
		//Calendar diferenciaHora = ahoraEnAustralia.getInstance().getTimeInMillis() - ahoraEnItalia.getInstance().getTimeInMillis(); 
		//Calendar.time
	}

}
