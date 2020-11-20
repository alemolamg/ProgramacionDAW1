package capitulo05.bloque06_MetodosMatrices;

import alemol.UtilsAlemol;

public class Ejercicio11_eliminarFilas {

	public static void main(String[] args) {
		int matriz[][]={{-3,7,-3,4},
						{4,5,0,2},
						{-7,0,0,2},
						{-8,3,9,2}};

		UtilsAlemol.imprimirMatriz(matriz);	//imprimimos la matriz original

		UtilsAlemol.imprimirMatriz(eliminarUnaFilaMatriz(matriz, 2));	//imprimimos la matriz sin la fila

	}
	
	/**
	 * Elimina una fila con el número que le mandamos
	 * @param matriz
	 * @param filaEliminar
	 * @return	matriz sin la fila elegida.
	 */
	public static int[][] eliminarUnaFilaMatriz (int matriz[][], int filaEliminar){
		int nuevaMatriz[][] = new int [matriz.length -1][matriz[0].length];
		
		for(int i = 0, k = 0; i < matriz.length; i++) {	
			if(i != filaEliminar) {	//condición para no copiar la fila que no queremos
				for (int j = 0; j < matriz[i].length; j++) {
					nuevaMatriz[k][j] = matriz[i][j];  //copiamos la matriz
				}
			k++;
			}
		}
		return nuevaMatriz;		//Devolvemos la matriz sin la fila
	}

}
