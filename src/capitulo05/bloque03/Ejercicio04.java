package capitulo05.bloque03;

import alemol.UtilsAlemol;


public class Ejercicio04 {

	public static void main(String[] args) {
		int limite = 150;
		int[] array = new int [limite];
		
		for (int i = 0; i < limite; i++) { // Inicializa array con números aleatorios
			array[i] = UtilsAlemol.obtenerNumeroAzar100();
		}
		
		UtilsAlemol.imprimirArray(array);
		
		algoritmoSeleccion(array);
		
		System.out.println("El array ordenado es: ");
		UtilsAlemol.imprimirArray(array);
		
	}
	
	
	/**
	 * Algoritmo que ordena el vector de menor a mayor
	 * @param array (int[]) vector a ordenar
	 */
	private static void algoritmoSeleccion (int array []) {
		int valor = 0, pos = 0, i,j;
		
		for (i = 0; i < array.length; i++) {
			valor = array[i];
			pos = i;
			for (j = i; j < array.length; j++) {
				if(array[j] < valor) {
					valor = array[j];
					pos = j;							
				}
			}
			int aux = array[i];
			array[i] = valor;
			array[pos] = aux;
		}
		
		System.out.println("Algoritmo terminado");
	}

}
