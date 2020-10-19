package capitulo05.bloque03;

import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {
		int iterator = 0, limite = 10, valorAux = 0;
		int[] array = new int[limite];

		System.out.println("Programa de ordenación por shell");

		for (int i = 0; i < limite; i++) { // Inicializa array con números aleatorios
			array[i] = generadorRandomInt();
		}

		algoritmoShell(array, limite);

		for (int i = 0; i < array.length; i++) // mostrar array por pantalla
			System.out.println("Posición " + (i) + ", número: " + array[i]);
	    
	}
	
	
	/**
	 * Genera un entero Random entre 0 y 100, y lo devuelve.
	 * @return	(int) Random entre 0 y 100.
	 */
	private static int generadorRandomInt() {
		Random r1 = new Random();
		return r1.nextInt(1001);
	}
	
	
	private static void algoritmoShell(int array [], int limite) {
		int division = array.length;
		
		do {
			division = division / 2;
			for (int i = division; i < array.length; i++) {
				int aux;
				if (array[i] < array[i-division]) {
					aux = array[i];
					array[i] =  array[i-division];
					array[i-division] = aux;					
				}
			}
			
		}while (division - 1 != 0);
		
		
		
	}
	
}
