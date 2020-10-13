package capitulo05.bloque02;

import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {
		int limite = 150, sumaPares = 0;
		int array1 [] = new int [limite];
		int array2 [] = new int [limite];
		int array3 [] = new int [limite];
		
		for (int i = 0; i < limite; i++) {		//Inicializa dos array con números aleatorios
			array1 [i] = generadorRandomInt();
			array2 [i] = generadorRandomInt();
			
			if ( i % 2 == 0 || i == 0)
				array3[i] = array2[i];
			else 
				array3[i] = array1[i];
			
		}
		
		for (int i = 0; i < array1.length; i++)
			System.out.println("Posición " + i + ", valor = " + array3[i]);
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
