package capitulo05.bloque05_metodos_y_arrays;

import alemol.UtilsAlemol;

public class Ejercicio01_stringFromArray {

	public static void main(String[] args) {
		
		System.out.println("\n------- Ejercicio 01 ------");
		int arrayInt [] = new int [] {3,8,2,36,87,-3};
		UtilsAlemol.mostrarTexto(stringFromArray(arrayInt));

	}
	
	/**
	 * 1.- Un método llamado "stringFromArray", que reciba un array de números enteros y 
	 * devuelva una cadena de caracteres. El método debe recorrer el array, de la misma forma 
	 * en la que harías para mostrarlo en consola, pero en lugar de imprimir en consola debes construir un objeto String. 
	 * Finalmente debes devolver el String e imprimirlo en el método "main".
	 * @param array (int [])
	 * @return	(String)
	 */
	public static String stringFromArray(int array []) {
		String cadena = " ";
		for (int i = 0; i < array.length; i++) {
			cadena = cadena + Integer.toString(array[i]) + " ";
		}
		return cadena;	
	}

}
