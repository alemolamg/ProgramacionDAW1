package capitulo05.optativo01;

public class Ejercicio01_loteriaPrimitiva {

	public static void main(String[] args) {
		System.out.println("Creando tu primitiva Aleatoria.");
		 
		int primitiva[] = crearArrayPrimitiva();
		mostrarPrimitiva(primitiva);
	}
	
	
	public static void mostrarPrimitiva(int primitiva[]) {
		System.out.print("Números primitiva: ");
		for (int i = 0; i < primitiva.length - 1; i++) {
			System.out.print(primitiva[i] + " ");
		}
		
		System.out.println("\nComplementario: " + primitiva[primitiva.length-1]);
	}
	
	
	/**
	 * Metodo que crea un array de primitivas.
	 * @return miPrimitiva (int[])
	 */
	public static int[] crearArrayPrimitiva () {	//Crea la primitiva con números aleatorios.
		int numAleatorio, i = 0, miPrimitiva[] = new int [7];
		
		do {
			boolean wanda = true;
			numAleatorio = numeroAleatorioPrimitiva();
			for (int j = 0; j < i; j++) 
				if ( miPrimitiva[j] == numAleatorio) 
					wanda = false;
			
			if(wanda) {
				miPrimitiva[i] = numAleatorio;
				i++;
			}
		}while (i < miPrimitiva.length);
		
		return miPrimitiva;		
	}
	
	
	/**
	 * obtienes un número al azar entre 0 y 49
	 * @return	num (int) entre 0 y 49
	 */
	public static int numeroAleatorioPrimitiva () {
		 return (int) Math.round(Math.random() * 49);
	}
	

}
