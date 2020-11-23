package capitulo05.optativo01;

import alemol.UtilsAlemol;

public class Ejercicio04_MatrizAsteriscos {

	public static void main(String[] args) {
		char matrizAst[][] = new char [20][10];
		prepararMatriz(matrizAst);
		UtilsAlemol.imprimirMatriz(matrizAst);

	}
	
	
	/**
	 * Rellena la matriz con diferentes límetes de asteriscos
	 * @param matriz
	 */
	private static void prepararMatriz(char matriz[][]) {
		for (int i = 0; i < matriz.length;i++)
			if(i == 0 || i == matriz.length-1)
				for (int j = 0; j < matriz[i].length; j++)
					matriz[i][j] = '*';
			else
				if(i % 2 == 0) {
					matriz[i][0] = '*';
					matriz[i][matriz[i].length-1] = '*';
				}		
	}

}
