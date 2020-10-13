package capitulo05.bloque02;

import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		int limite = 150, sumaPares = 0;
		int array [] = new int [limite];
		
		for (int i = 0; i < limite; i++) {
			array [i] = generadorRandomInt();
			if (array[i] % 2 == 0 || array[i] < 0)
				array[i] = ~array[i] + 1;		
		}
		for (int i = 0; i < array.length; i++)
		System.out.println("Posición " + (i+1) + ", valor = " + array[i]);
	}
		
	
	/**
	 * Genera un entero Random entre -100 y 100, y lo devuelve.
	 * @return	(int) Random entre -100 y 100
	 */
	private static int generadorRandomInt() {
		Random r1 = new Random();
		return  100 - r1.nextInt(201);
	}

}
