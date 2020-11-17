package capitulo05.bloque06_MetodosMatrices;

public class Ejercicio04_MatrizDiagonal {

	public static void main(String[] args) {
		int matriz1[][] = {{5,0,0},{0,-6,0},{0,0,7}};
		int matriz2[][] = {{1,1,2},{3,5,8},{13,21,34}};
		
		boolean esDiagonal = matrizDiagonal(matriz1);	//Ejemplo 1
		verificar(esDiagonal);	//Función que sirve para mostrar texto.
		
		esDiagonal = matrizDiagonal(matriz2);	//Ejemplo 2
		verificar(esDiagonal);

	}
	
	
	public static boolean matrizDiagonal(int matriz[][]) {
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j <matriz[i].length; j++)
				if(matriz[i][j] != 0 && i == j)
					return false;
		}
		return true;
		
	}
	
	/**
	 * Muestra si la matriz es o no positiva.
	 * @param wanda
	 */
	public static void verificar(boolean wanda) {
		if(wanda)
			System.out.println("La matriz es diagonal");
		else
			System.out.println("La matriz no es diagonal");
	}

}
