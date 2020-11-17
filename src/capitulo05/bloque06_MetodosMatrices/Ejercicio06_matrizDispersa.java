package capitulo05.bloque06_MetodosMatrices;

public class Ejercicio06_matrizDispersa {

	public static void main(String[] args) {
		int matriz[][] = {{0,7,3,4},
						{4,5,0,2},
						{0,0,1,2},
						{0,3,9,0}};
		
		verificar(matrizDispersa(matriz));
		}
	
	public static boolean matrizDispersa(int matriz[][]) {
		boolean arrayCol[] = {false,false,false,false};	// Inicializo un array para saber si hay cero en la columna
		
		for(int i = 0; i < matriz.length; i++) {
			boolean hayCeroFila=false;	// en principio no hay 0 en la fila
			for (int j = 0; j <matriz[i].length; j++) {
				if(matriz[i][j] == 0) {	//Si existe 0, lo verificamos en las dos dimensiones
					hayCeroFila = true;
					arrayCol[j] = true;
				}
			}
			if (!hayCeroFila)
				return false;
		}		
		
		for(int ite = 0; ite < arrayCol.length; ite++) // recorro el vector para saber si las columnas tienen ceros.
			if(!arrayCol[ite])
				return false;
		
		return true;
	}
	
	/**
	 * Muestra si la matriz es o no positiva.
	 * @param wanda
	 */
	public static void verificar(boolean wanda) {
		if(wanda)
			System.out.println("La matriz es dispersa");
		else
			System.out.println("La matriz no es dispersa");
	}

}
