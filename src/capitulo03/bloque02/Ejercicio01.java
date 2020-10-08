package capitulo03.bloque02;

import java.util.Vector;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		Vector<Integer> vectorInt = new Vector<Integer>();
		int limite = 10, cantidad = 4, total = 0;
		float media;
		
		System.out.println("Programa que lee por pantalla números y detecta cuantos"
				+ " son positivos y cuantos negativos");
		System.out.println("introduce la cantidad de números a leer: ");
		cantidad = lectorInt();
		
		
		System.out.println("\n\nLectura de números: ");
		for (int i = 0; i < cantidad; i++) {			//Añade los números a una estructura Vector
			System.out.println("Introducir el " + (i+1) + "º número");
			vectorInt.add(lectorInt());
		}
		
		
		for (int i = 0; i < cantidad; i++) {
			total = total + vectorInt.elementAt(i);			
		}
		
		media = (float)(total / cantidad);
		System.out.println("La media de todos los números es: " + media);

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
