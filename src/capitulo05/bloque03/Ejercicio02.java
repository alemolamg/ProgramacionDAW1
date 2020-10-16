package capitulo05.bloque03;

import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {

		System.out.println("Programa de ordenación por Inserción directa");
		
		int iterator = 0, limite = 150;
	    boolean continuar = true;				//sirve para seguir en el buble.
	    int [] array = new int [limite];
	    
	    for (int i = 0; i < limite; i++) {		//Inicializa array con números aleatorios
			array [i] = generadorRandomInt();			
		}
	   
	    
	    
		
	    //Mostramos el vector
		for (int i = 0; i < array.length; i++)
			System.out.println("Array1: Posición " + i + ", valor = " + array[i]);
	    
	}
	
	
	/**
	 * Genera un entero Random entre 0 y 100, y lo devuelve.
	 * @return	(int) Random entre 0 y 100.
	 */
	private static int generadorRandomInt() {
		Random r1 = new Random();
		return r1.nextInt(1001);
	}

}
