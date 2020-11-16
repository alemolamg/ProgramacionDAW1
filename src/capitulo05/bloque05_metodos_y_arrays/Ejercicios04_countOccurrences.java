package capitulo05.bloque05_metodos_y_arrays;

import alemol.UtilsAlemol;

public class Ejercicios04_countOccurrences {

	public static void main(String[] args) {
		System.out.println("\n------- Ejercicio 04 ------");
		int array2 [] = new int [] {8,60,2,55,20,8,2,44};
		UtilsAlemol.imprimirArray(array2);
		int num = 8, cantidadNumero = countOccurrences(array2, num);
		UtilsAlemol.mostrarTexto("El número " + num + " aparece " + cantidadNumero 
				+ " veces en el array2.");
	}
	
	
	/**
	 * 4.- Realiza un método llamado "countOccurrences", que reciba:
	 * - Un array de números enteros.
	 * - Un valor entero.
	 * El método debe devolver un valor entero, que corresponda con el número de 
	 * veces que el valor entero recibido como segundo parámetro exista dentro 
	 * del array recibido como primer parámetro.
	 * @param array
	 * @param numBuscar
	 * @return
	 */
	public static int countOccurrences (int array[], int numBuscar) {
		int contador = 0;
		for (int i = 0; i < array.length; i++)
			if(array[i] == numBuscar)
				contador++;
		return contador;
	}

}
