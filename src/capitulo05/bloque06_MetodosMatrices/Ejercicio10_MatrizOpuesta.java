package capitulo05.bloque06_MetodosMatrices;

import alemol.UtilsAlemol;

public class Ejercicio10_MatrizOpuesta {

	public static void main(String[] args) {
		int matriz[][]={{-3,7,-3,4},
						{4,5,0,2},
						{-7,0,0,2},
						{-8,3,9,2}};
		
		UtilsAlemol.imprimirMatriz(matriz);	//imprimimos la matriz original
		
		UtilsAlemol.imprimirMatriz(matrizOpuesta(matriz));	//imprimimos la traspuesta

	}
	
	/**
	 * Recibe una matriz y devuelve su matriz opuesta
	 * @param matriz
	 * @return opuesta (int[][])
	 */
	public static int[][] matrizOpuesta(int matriz[][] ) {
		int opuesta[][] = new int [matriz.length][matriz[0].length];
		
		for(int i = 0; i < opuesta.length; i++)
			for (int j = 0; j < opuesta[i].length; j++)
				opuesta[i][j] = -1 *  matriz[i][j];  //multiplicamos por -1 para conseguir la matriz opuesta
		return opuesta;	
	}

}
