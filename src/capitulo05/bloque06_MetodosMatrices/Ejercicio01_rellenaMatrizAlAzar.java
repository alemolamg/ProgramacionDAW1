package capitulo05.bloque06_MetodosMatrices;

import alemol.UtilsAlemol;

public class Ejercicio01_rellenaMatrizAlAzar {

	public static void main(String[] args) {
		
		int tamanio = 3;
		int matriz[][] = new int [tamanio][tamanio];
		rellenarMatrizAlAzar(matriz);
		UtilsAlemol.imprimirMatriz(matriz);
		
	}
	
	public static void rellenarMatrizAlAzar(int matriz [][]) {
		for(int i = 0; i < matriz.length; i++) 
			for (int j = 0; j < matriz[i].length; j++) 
				matriz[i][j] = UtilsAlemol.generadorRandomInt();
		
	}
	
}
