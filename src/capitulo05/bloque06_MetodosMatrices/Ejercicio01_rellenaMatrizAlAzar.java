package capitulo05.bloque06_MetodosMatrices;

import alemol.UtilsAlemol;

public class Ejercicio01_rellenaMatrizAlAzar {

	public static void main(String[] args) {
		
		int tamanioCol = 3, tamanioFila = 3;
		int matriz[][] = crearMatrizAlAzar(tamanioFila, tamanioCol);
		UtilsAlemol.imprimirMatriz(matriz);
		
	}
	
	public static int[][] crearMatrizAlAzar(int fila, int col) {
		int matriz[][] = new int [fila][col];
		for(int i = 0; i < matriz.length; i++) 
			for (int j = 0; j < matriz[i].length; j++) 
				matriz[i][j] = UtilsAlemol.generadorRandomInt();
		return matriz;
	}
	
}
