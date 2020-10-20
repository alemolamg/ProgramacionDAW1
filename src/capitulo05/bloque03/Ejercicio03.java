package capitulo05.bloque03;

import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {
		int limite = 150;
		int[] array = new int[limite];

		System.out.println("Programa de ordenación por shell");

		for (int i = 0; i < limite; i++) { // Inicializa array con números aleatorios
			array[i] = generadorRandomInt();
		}

		imprimirArray(array);		
		
		algoritmoShell(array);

		imprimirArray(array);
	}
	
	
	/**
	 * Genera un entero Random entre 0 y 100, y lo devuelve.
	 * @return	(int) Random entre 0 y 100.
	 */
	private static int generadorRandomInt() {
		Random r1 = new Random();
		return r1.nextInt(1001);
	}
	
	
	/**
	 * Muestra un array por pantalla.
	 * @param array	objeto a mostrar.
	 */
	private static void imprimirArray(int array[]) {
		for (int i = 0; i < array.length; i++) // mostrar array por pantalla
			System.out.print(array[i] + " ");
		System.out.println();
	}
	
	/**
	 * 
	 * @param array
	 */
	private static void algoritmoShell(int array []) {
		int division = array.length;
		boolean hayIntercambios;
		do {
			hayIntercambios = true;
			division = division / 2;
//			System.out.println("Division: " + division);
//			imprimirArray(array);
			while (hayIntercambios) {
				hayIntercambios = false;
				for (int i = division; i < array.length; i++) {
					int aux;
					if (array[i] < array[i-division]) {
						aux = array[i];
						array[i] =  array[i-division];
						array[i-division] = aux;
						hayIntercambios = true;
//						System.out.print("Cambio ");
//						imprimirArray(array);
					}
				}
			}
			
		}while (division - 1 != 0);
	}
	
}
