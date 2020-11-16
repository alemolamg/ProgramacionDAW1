package capitulo05.bloque05_metodos_y_arrays;

import alemol.UtilsAlemol;

public class Ejercicio02_findAndReplace {

	public static void main(String[] args) {
		System.out.println("\n------- Ejercicio 02 ------");
		int arrayInt [] = new int [] {3,8,2,36,87,-3};
		int array2 [] = new int [] {8,60,2,55,20,8,2,44};
		UtilsAlemol.imprimirArray(array2);
		findAndReplace(arrayInt, 2, 99);
		UtilsAlemol.imprimirArray(array2);
		
	}
	
	/**
	 * 2.- Un método llamado "findAndReplace", que reciba: 
	 *	- Un array de números enteros.
   	 *	- Un valor entero que debe buscarse en el array.
   	 *	- Un valor entero que debe servir para reemplazar.
   	 * El método buscará todas las ocasiones en las que el segundo parámetro aparezca
   	 * dentro del array y reemplazará ese valor con el valor del tercer parámetro.
   	 * El método main debe crear un array, imprimirlo en consola, llamar al método 
   	 * "findAndReplace" y volver a imprimir el array en consola.
   	 * 
	 * @param array
	 * @param valorBuscar
	 * @param numReempazo
	 */
	public static  void findAndReplace(int array [], int valorBuscar, int numReempazo) {
			for (int i = 0; i < array.length; i++)
				if(array[i] == valorBuscar)
					array[i] = numReempazo;		
	}

}
