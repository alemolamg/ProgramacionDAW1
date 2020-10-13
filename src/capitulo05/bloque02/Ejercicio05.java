package capitulo05.bloque02;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		int limite = 5, sumaPares = 0;
		int array1 [] = new int [limite];
		int array2 [] = new int [limite];
		
		for (int i = 0; i < limite; i++) {		//Inicializa array con números aleatorios
			array1 [i] = generadorRandomInt();			
		}
		
		System.out.println("Introduce las veces que quieras desplazar a la derecha,"
				+ "0 o negativos para no cambiar:");
		int limiteUsuario = lectorInt();
		
		for (int j = 1; j <= limiteUsuario; j++) {
		
			for (int i = array1.length - 1; i >= 0; i--) {		//cambia los valores de un array a otro
				if ( i != 0)			// puedes cambiar sin problemas
					array2[i-1] = array1[i];
				else					// paso a la última posición
					array2[array2.length - 1] = array1[i];
			}
		
		}
		
		
		for (int i = 0; i < array1.length; i++)
			System.out.println("Array1: Posición " + i + ", valor = " + array1[i]);
		
		for (int i = 0; i < array2.length; i++)
			System.out.println("Array2: Posición " + i + ", valor = " + array2[i]);
	}
		
	
	/**
	 * Genera un entero Random entre 0 y 100, y lo devuelve.
	 * @return	(int) Random entre 0 y 100.
	 */
	private static int generadorRandomInt() {
		Random r1 = new Random();
		return r1.nextInt(101);
	}
	

	/**
	 * Lee por pantalla los números
	 * @return (int) número leido
	 */
	public static int  lectorInt () {		
		String lector = JOptionPane.showInputDialog("Introduzca el número entero: ");
		return Integer.parseInt(lector);			
	}

}
