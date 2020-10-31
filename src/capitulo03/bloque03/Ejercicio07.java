package capitulo03.bloque03;

import alemol.UtilsAlemol;

public class Ejercicio07 {

	public static void main(String[] args) {
		int numero = 0, cantPositivos = 0, cantNegativos = 0;
		System.out.println("Programa que calcula cuantos números leidos "
				+ "son positivos y cuantos negativos (0 para salir)");
		
		do {
			numero = UtilsAlemol.obtenerEnteroScanner();
			if (numero != 0 && numero > 0) 		//Saber si no es 0 y es mayor que el anterior número
				cantPositivos++;
			if (numero != 0 && numero < 0) 		//Saber si no es 0 y es mayor que el anterior número
				cantNegativos++;
			
		} while (numero != 0);
		
		System.out.println("Se han leido " + cantNegativos + " números negativos y  " + cantPositivos + " números positivos.");
		System.out.println("Fin del programa");
	}

}
