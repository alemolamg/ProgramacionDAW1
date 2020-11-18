package capitulo05.bloque06_MetodosMatrices;

import alemol.UtilsAlemol;

public class Ejercicio11_eliminarFilas {

	public static void main(String[] args) {
		int matriz[][]={{-3,7,-3,4},
						{4,5,0,2},
						{-7,0,0,2},
						{-8,3,9,2}};

		UtilsAlemol.imprimirMatriz(matriz);	//imprimimos la matriz original

		UtilsAlemol.imprimirMatriz(eliminarFilaMatriz(matriz, 2));	//imprimimos la traspuesta

	}
	
	/**
	 * Elimina una fila con el número que le mandamos
	 * @param matriz
	 * @param filaEliminar
	 * @return	matriz sin la fila elegida.
	 */
	public static int[][] eliminarFilaMatriz (int matriz[][], int filaEliminar){
		int nuevaMatriz[][] = new int [matriz.length][matriz[0].length];
		
		for(int i = 0; i < nuevaMatriz.length && i != filaEliminar; i++)
			for (int j = 0; j < nuevaMatriz[i].length; j++)
				nuevaMatriz[i][j] = matriz[i][j];  //multiplicamos por -1 para conseguir la matriz opuesta
		return nuevaMatriz;	
	}

}
