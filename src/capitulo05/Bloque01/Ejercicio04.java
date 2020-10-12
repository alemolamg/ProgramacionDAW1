package capitulo05.Bloque01;

import java.util.Random;

public class Ejercicio04 {

	public static void main(String[] args) {
		int limite = 150, sumaPares = 0, sumaImpares = 0;
		int array [] = new int [limite];
		
		for (int i = 0; i < limite; i++) {
			array [i] = generadorRandomInt();
			if (array[i] % 2 == 0)
				sumaPares += array[i];
			else
				sumaImpares += array[i];
			
		}
	
		System.out.println("La suma de todos los números pares es: " + sumaPares
								+ " y la de los impares es: " + sumaImpares );
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
