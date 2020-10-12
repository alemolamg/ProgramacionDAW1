package capitulo05.Bloque01;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		int limite = 150;
		int array [] = new int [limite];
//		float media = (float) 0.0;
		
		
		for (int i = 0; i < limite; i++) {
			array [i] = generadorRandomInt();
			
		}
		
		for (int i = array.length-1; i >= 0; i--)
			System.out.println("Posición " + (array.length-i) + ", número: " + array[i]);
		
//		media = suma / (float) limite;
//		
//		System.out.println("La suma total de elementos es: " + suma);
//		System.out.println("El número mayor es : " + numMayor);
//		System.out.println("El número menor es : " + numMenor);
//		System.out.println("La media es " + media);
		

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
