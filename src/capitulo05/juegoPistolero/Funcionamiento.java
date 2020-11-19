package capitulo05.juegoPistolero;

public class Funcionamiento {
	
	public static void menu() {
		
	}
	
	
	/**
	 * Muestra un array por pantalla.
	 * @param array	objeto a mostrar.
	 */
	public static void imprimirArray(int array[]) {
		for (int i = 0; i < array.length; i++) // mostrar array por pantalla
			System.out.print(array[i] + " ");
		System.out.println();
	}
	
	
	public static int binarioAleatorio () {
		return (int) Math.round(Math.random() * 1);
	}
	
	
	public static boolean compararJugada(int arrayOriginal[], int arrayJugador[] ) {
		for(int i = 0; i < arrayOriginal.length; i++)
			if(arrayJugador[i] != arrayOriginal[i])
				return false;
		return true;
	}
	
}
