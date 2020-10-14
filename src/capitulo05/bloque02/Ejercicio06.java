package capitulo05.bloque02;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		int limite = 5, sumaPares = 0, limiteUsuario = 0;
		int array1 [] = new int [limite];
		int array2 [] = new int [limite];
		boolean desDerecha = true;
		
		for (int i = 0; i < limite; i++) {		//Inicializa array con números aleatorios
			array1 [i] = generadorRandomInt();			
		}
		
		do {
			System.out.println("Elige dirección desplazamiento, 0 derecha, 1 izquierda:");
			limiteUsuario = scannerInt();
			
			if (limiteUsuario == 1)
				desDerecha = false;
			else if (limiteUsuario  == 0)
				desDerecha = true;
				else
					System.out.println("Valor introducido incorrecto\n");
			
		}while (limiteUsuario != 0 && limiteUsuario != 1);
		
		System.out.println("Introduce las veces que quieras desplazar,"
				+ "0 o negativos para no cambiar:");
		limiteUsuario = scannerInt();
			
		if(!desDerecha)
			for (int j = 1; j <= limiteUsuario; j++) {
				for (int i = array1.length - 1; i >= 0; i--) {		//cambia los valores de un array a otro
					if ( i != 0)			// puedes cambiar sin problemas
						array2[i-1] = array1[i];
					else					// paso a la última posición
						array2[array2.length - 1] = array1[i];
				}
			}
		else
			for (int j = 1; j <= limiteUsuario; j++) {
				for (int i = 0; i < array1.length; i++) {		//cambia los valores de un array a otro
					if ( i == array1.length - 1)			// puedes cambiar sin problemas
						array2[0] = array1[i];
					else					// paso a la última posición
						array2[i + 1] = array1[i];
				}
			}
			
		
		//Mostramos el vector
		for (int i = 0; i < array1.length; i++)
			System.out.println("Array1: Posición " + i + ", valor = " + array1[i]);
		
		//Mostramos el vector
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
	
	
	/**
	 * Lee en terminal los números enteros.
	 * @return	(int) número leido.
	 */
	public static int scannerInt () {
		Scanner leer = new Scanner (System.in);
		return leer.nextInt();
	}

}
