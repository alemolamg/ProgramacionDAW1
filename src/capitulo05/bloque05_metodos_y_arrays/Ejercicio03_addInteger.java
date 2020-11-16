package capitulo05.bloque05_metodos_y_arrays;

import alemol.UtilsAlemol;

public class Ejercicio03_addInteger {

	public static void main(String[] args) {
		System.out.println("\n------- Ejercicio 03 ------");
		int array2 [] = new int [] {8,60,2,55,20,8,2,44};
		UtilsAlemol.imprimirArray(array2);
		array2 = addInteger(array2, 8);
		UtilsAlemol.imprimirArray(array2);

	}
	
	
	/**
	 * 3.- Realiza un método llamado "addInteger", que reciba:
	 *	- Un array de números enteros.
	 *	- Un valor entero.
	 *	Dentro del método debes:
	 *	- Crear un nuevo array, cuya longitud sea la del array recibido como primer parámetro + 1.
	 *	- Copiar el array del primer parámetro en el array creado dentro del método, elemento tras elemento.
	 *	- Agregar el nuevo elemento al final del nuevo array.
	 *	- Asignar, al array recibido mediante el primer parámetro, el puntero al nuevo array creado en el interior del método.
	 *	- El método debe devolver un array de tipo entero. Main debe recoger el array devuelto e imprimirlo en consola.
	 * @param array
	 * @param valor
	 * @return (int[])
	 */
	public static int[] addInteger (int array[], int valorNuevo) {
		int nuevoVector[] = new int [array.length + 1], i=0;
		do {
			if(i < array.length)
				nuevoVector[i] = array[i];
			else
				nuevoVector[i] = valorNuevo;
			i++;
		}while (i <= array.length);
		return nuevoVector;
	}

}
