package capitulo05.bloque03;

import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int iterator = 0, limite = 150, valorAux = 0, j = 0;
	    int [] array = new int [limite];

	    System.out.println("Programa de ordenación por Inserción directa");
	    
	    for (int i = 0; i < limite; i++) {		//Inicializa array con números aleatorios
			array[i] = generadorRandomInt();			
		}
	   
	    
	    for( iterator = 0; iterator < array.length; iterator++) {
	    	valorAux = array[iterator];
	    	for ( j = iterator; j > 0 && array[j - 1] > valorAux; j--) {
	            array[j] = array[j - 1];
	    	}
	    	array[j] = valorAux;
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
