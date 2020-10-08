package capitulo03.bloque01;

import java.util.Vector;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		Vector<Integer> vectorInt = new Vector<Integer>();
		int limite = 10, cantidad = 4, total = 0;
		
		System.out.println("Programa que lee por pantalla números y suma aquellos que sean mayores de 10");
		System.out.println("introduce la cantidad de números a leer: ");
		cantidad = lectorInt();
		
		System.out.println("\n\nLectura de números: ");
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introducir el " + (i+1) + "º número");
			vectorInt.add(lectorInt());
		}
		
		for (int i = 0; i < vectorInt.size(); i++) {
			if(vectorInt.elementAt(i) > limite)
				total += vectorInt.elementAt(i);
		}
		
		System.out.println("La suma total de los " + cantidad
				+ " números mayores de " + limite + " es: " + total);

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
