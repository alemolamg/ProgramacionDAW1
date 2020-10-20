package capitulo05.bloque04;

import utilidades.UtilsAlemol;

public class Ejercicio01 {

	public static void main(String[] args) {
		int tamanio = UtilsAlemol.obtenerNumeroAzar10();
		int array [] = new int [tamanio];
		
		for (int i = 0; i < tamanio; i++) { // Inicializa array con números aleatorios
			array[i] = UtilsAlemol.obtenerNumeroAzar100();
		}

	}

	/**
	 * Recibe un vector y devuelve un valor diferente dependiendo
	 * del tamaño del vector es par o impar.
	 * @param array (int)
	 * @return -1 si par, valor si impar.
	 */
	private static int examinarArrayInt (int array []) {
		if (array.length % 2 == 0) 
			return -1;
		else {
			return array[array.length / 2];
		}
		
	}
}
