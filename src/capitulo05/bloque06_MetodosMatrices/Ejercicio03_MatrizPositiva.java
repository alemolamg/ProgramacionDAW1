package capitulo05.bloque06_MetodosMatrices;

public class Ejercicio03_MatrizPositiva {

	public static void main(String[] args) {
		int matriz1[][] = {{5,2},{8,6},{3,5}};
		int matriz2[][] = {{8,-4},{6,0},{-2,-7}};
		
		boolean esPositiva = matrizEsPositiva(matriz1);	//Ejemplo 1
		verificar(esPositiva);	//Función que sirve para mostrar texto.
		
		esPositiva = matrizEsPositiva(matriz2);	//Ejemplo 2
		verificar(esPositiva);
	}


	public static boolean matrizEsPositiva(int matriz[][]) {
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j <matriz[i].length; j++)
				if(matriz[i][j] < 0)
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
			System.out.println("La matriz es positiva");
		else
			System.out.println("La matriz es negativa");
	}

}
