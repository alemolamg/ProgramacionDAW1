package capitulo06_Recursos.math;

public class Ejercicio02_CorteFunciones {

	public static void main(String[] args) {
		double x = 0.00001, y = 0;
		for (double equis = 0.00001; equis < 10; equis +=x) {
			double y1 = Math.round(Math.sqrt(equis));
			double y2 = Math.round(-1 *Math.log(equis));
			
			if(y1 == y2) {
				System.out.println("entro");
				y = Math.sqrt(equis);
				x = equis;
				break;
			}
		}
		
		if (y != 0)
			System.out.println("El cruce de las dos funciones ocurre con la "
					+ "x: "+ x + " y: " + y);
		else
			System.out.println("No se ha encontrado ningún punto donde se corten.");
		System.out.println("x: " + x + " y: " + y);
	}
	
}
