package capitulo03.bloque03;

import alemol.UtilsAlemol;

public class Ejercicio06 {

	public static void main(String[] args) {
		int num = 1;
		
		System.out.println("Programa que muestra las tablas de multiplicar "
				+ "(0 para salir)");
		do {
			num = UtilsAlemol.obtenerEnteroScanner();
			if (num != 0)
				for(int i = 0; i <= 10; i++) {
					System.out.println(num + " * " + i + " = " + (num*i));
				}
		}while (num != 0);

		System.out.println("Fin del programa");
	}
}
