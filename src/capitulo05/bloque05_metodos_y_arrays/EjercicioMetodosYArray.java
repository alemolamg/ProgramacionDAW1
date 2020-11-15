package capitulo05.bloque05_metodos_y_arrays;


import alemol.UtilsAlemol;

public class EjercicioMetodosYArray {

	public static void main(String[] args) {
		
		System.out.println("\n------- Ejercicio 01 ------");
		int arrayInt [] = new int [] {3,8,2,36,87,-3};
		UtilsAlemol.mostrarTexto(stringFromArray(arrayInt));
		
		
		System.out.println("\n------- Ejercicio 02 ------");
		int array2 [] = new int [] {8,60,2,55,20,8,2,44};
		UtilsAlemol.imprimirArray(array2);
		findAndReplace(arrayInt, 2, 99);
		UtilsAlemol.imprimirArray(array2);
		
		
		System.out.println("\n------- Ejercicio 03 ------");
		UtilsAlemol.imprimirArray(array2);
		array2 = addInteger(array2, 8);
		UtilsAlemol.imprimirArray(array2);

		
		System.out.println("\n------- Ejercicio 04 ------");
		UtilsAlemol.imprimirArray(array2);
		int num = 8, cantidadNumero = countOccurrences(array2, num);
		UtilsAlemol.mostrarTexto("El número " + num + " aparece " + cantidadNumero 
				+ " veces en el array2.");

		
		System.out.println("\n------- Ejercicio 05 ------");
		UtilsAlemol.imprimirArray(array2);
		int array5 [] = removeInteger(array2, 8);
		UtilsAlemol.imprimirArray(array5);
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
	 
	
	/**
	 * Ejercicio 05
	 * @param vector
	 * @param valor
	 * @return
	 */
	public static int[] removeInteger(int vector[], int valor) {
		int tamArrayNuevo = countOccurrences(vector, valor);
		int newArray[] = new int [vector.length - tamArrayNuevo];
		int cont = 0;
		for (int i= 0; i < vector.length; i++) {
			if(vector[i] != valor) {
				newArray[cont] = vector[i];
				cont++;
			}
		}
		return newArray;
	}
	
	
	
}
