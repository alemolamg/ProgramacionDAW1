package capitulo05.bloque02;

import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {
		int limite = 150, sumaPares = 0;
		int array1 [] = new int [limite];
		
		for (int i = 0; i < limite; i++) {		//Inicializa array con números aleatorios
			array1 [i] = generadorRandomInt();			
		}
		
		for (int i = 0; i < array1.length; i++)
			System.out.println("Posición " + i + ", valor = " + array1[i]);
	}
		
	
	/**
	 * Genera un entero Random entre 0 y 100, y lo devuelve.
	 * @return	(int) Random entre 0 y 100.
	 */
	private static int generadorRandomInt() {
		Random r1 = new Random();
		return r1.nextInt(101);
	}

}
