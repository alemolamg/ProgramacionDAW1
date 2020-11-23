package capitulo05.optativo01;

import alemol.UtilsAlemol;

public class Ejercicio05_MatrizLlena {

	public static void main(String[] args) {
		char matriz[][] = new char [20][10];
		prepararMatriz(matriz);
		rellenarMatriz(matriz);
		UtilsAlemol.imprimirMatriz(matriz);
		
		
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
	
	
	public static void rellenarMatriz(char matriz[][]) {
		for (int i = 1; i < matriz.length -1; i++)
			for (int j = 1; j < matriz[i].length -1; j++) {
				
				matriz[i][j] = Character.forDigit(UtilsAlemol.obtenerBinarioAleatorio(), 2);
				
			}
	}
	
}
