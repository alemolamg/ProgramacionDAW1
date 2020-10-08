package capitulo05.Bloque01;

import java.util.Random;


public class Ejercicio00 {

	public static void main(String[] args) {
		int limite = 150;
		int array [] = new int [limite];
		int suma = 0, numMayor = Integer.MIN_VALUE, numMenor = Integer.MAX_VALUE;
		float media = (float) 0.0;
		
		for (int i = 0; i < limite; i++) {
			array [i] = generadorRandomInt();
			suma += array[i];
			
			if (numMayor < array[i])	//Verificar número mayor
				numMayor = array[i];
			
			if (numMenor > array[i])	//Verificar número menor
				numMenor = array [i];
		}
		
		media = suma / (float) limite;
		
		System.out.println("La suma total de elementos es: " + suma);
		System.out.println("El número mayor es : " + numMayor);
		System.out.println("El número menor es : " + numMenor);
		System.out.println("La media es " + media);
		

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
