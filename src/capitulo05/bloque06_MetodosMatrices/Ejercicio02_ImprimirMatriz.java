package capitulo05.bloque06_MetodosMatrices;

public class Ejercicio02_ImprimirMatriz {

	public static void main(String[] args) {
		int matriz[][] = {{2,5,3,9}, {0,6,8,9}, {1,7,6,0}};
		imprimirMatriz(matriz);		

	}
	
	/**
	 * Recibe una matriz de enteros y la imprime por pantalla.
	 * @param matriz
	 */
	public static void imprimirMatriz (int matriz [][]) {
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j <matriz[i].length; j++)
				System.out.print(matriz[i][j] + " ");
		System.out.println("");
		}
	}

}
