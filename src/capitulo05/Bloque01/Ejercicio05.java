package capitulo05.Bloque01;

import java.util.Random;

public class Ejercicio05 {

	public static void main(String[] args) {
		int limite = 150, sumaPares = 0;
		int array [] = new int [limite];
		
		for (int i = 0; i < limite; i++) {
			array [i] = generadorRandomInt();
			if (i % 2 == 0 || i == 0)
				sumaPares += array[i];			
		}
	
		System.out.println("La suma de todos los números con índice par es: " + sumaPares);
	}
		
	
	/**
	 * Genera un entero Random y lo devuelve.
	 * @return
	 */
	private static int generadorRandomInt() {
		Random r1 = new Random();
		return r1.nextInt(101);
	}

}
