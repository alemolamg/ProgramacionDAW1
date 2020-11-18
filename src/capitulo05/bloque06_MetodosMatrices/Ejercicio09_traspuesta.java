package capitulo05.bloque06_MetodosMatrices;

import alemol.UtilsAlemol;

public class Ejercicio09_traspuesta {

	public static void main(String[] args) {
		int matriz[][]={{0,7,3,4},
						{4,5,0,2},
						{8,0,1,2},
						{0,3,9,0}};
		
		UtilsAlemol.imprimirMatriz(matriz);	//imprimimos la matriz original
		
		UtilsAlemol.imprimirMatriz(matrizTranspuesta(matriz));	//imprimimos la traspuesta
	}
	
	/**
	 * 
	 * @param matriz
	 * @return matrizTraspuesta (int[][])
	 */
	public static int[][] matrizTranspuesta (int matriz[][]){
		int traspuesta[][] = new int [matriz.length][matriz[0].length];
		for(int i = 0; i < traspuesta.length; i++)
			for (int j = 0; j < traspuesta[i].length; j++)
				traspuesta[j][i] = matriz[i][j];
		return traspuesta;		
	}

}
