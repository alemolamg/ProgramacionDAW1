package capitulo05.optativo01;

import alemol.UtilsAlemol;
public class Ejercicio02_DibujarOndaAsteriscos {

	public static void main(String[] args) {
		char matriz[][] = new char [10][30];
		rellenarConAst(matriz);
		UtilsAlemol.imprimirMatriz(matriz);
	}
	
	
	public static void rellenarConAst (char matriz[][]) {
		int numAlea = 2;
		for(int i = 0; i < matriz.length; i++) {
			numAlea = numeroAleatorio();
			for (int j = 0; j < numAlea; j++)
				matriz[i][j] = '*';
		}
		
	}
	
	
	/**
	 * obtienes un número al azar entre 0 y 30
	 * @return	num (int) entre 0 y 30
	 */
	public static int numeroAleatorio () {
		 return (int) Math.round(Math.random() * 30);
	}

}
