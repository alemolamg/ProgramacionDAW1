package capitulo05.Bloque01;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int limite = 150, numBuscar;
		int array [] = new int [limite];
		boolean encontrado = false;
		
		System.out.println("Introduce el número a buscar: ");
		numBuscar = lectorInt();
		
		
		for (int i = 0; i < limite; i++) {
			array [i] = generadorRandomInt();
			
		}
		
		for (int i = 0; i < array.length; i++)
			if (array[i] == numBuscar) {
				System.out.println("El número " + numBuscar + " aparece en la posición " + i);
				encontrado = true;
			}
		
		if (!encontrado)
			System.out.println("El número " + numBuscar + " no se ha podido encontrar en el array.");

	}
	
	/**
	 * Genera un entero Random y lo devuelve.
	 * @return
	 */
	private static int generadorRandomInt() {
		Random r1 = new Random();
		return r1.nextInt(101);
	}
	
	
	/**
	 * Lee por pantalla los números
	 * 
	 * @return (int) número leido
	 */
	public static int  lectorInt () {		
		String lector = JOptionPane.showInputDialog("Introduzca el número entero: ");
		return Integer.parseInt(lector);			
	}

}
