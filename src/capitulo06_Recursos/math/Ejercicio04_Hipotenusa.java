package capitulo06_Recursos.math;

import alemol.*;

public class Ejercicio04_Hipotenusa {

	public static void main(String[] args) {
		double hipotenusa = 0;
		double cateto1, cateto2;
		
		System.out.println("Introduce el primer cateto");
		cateto1 = UtilsAlemol.obtenerEnteroScanner();
		
		System.out.println("Introduce el segundo cateto");
		cateto2 = UtilsAlemol.obtenerEnteroScanner();
		
		hipotenusa = Math.hypot(cateto1, cateto2);
		
		System.out.println("La longitud de la hipotenusa es: " + hipotenusa
				+ " ,dados los catetos " + cateto1 + " y " + cateto2);

	}
}