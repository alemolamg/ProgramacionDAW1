package capitulo05.bloque06_MetodosMatrices;

public class Ejercicio05_TriangularSuperior {

	public static void main(String[] args) {
		int matriz[][]={{0,7,3,4},
						{4,5,0,2},
						{0,0,1,2},
						{0,3,9,0}};
		
		int matriz2[][]	=  {{9,7,3,4},
							{0,5,2,2},
							{0,0,1,2},
							{0,0,0,9}};
		
		verificar(matrizTriangularSuperior(matriz));
		verificar(matrizTriangularSuperior(matriz2));

	}

	
	public static boolean matrizTriangularSuperior(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < i; j++) {
					if (matriz[i][j] != 0)
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
			System.out.println("La matriz es Triangular Superior");
		else
			System.out.println("La matriz no es Triangular Superior");
	}	
	
}
