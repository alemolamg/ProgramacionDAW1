package capitulo03.bloque02;

import java.util.Vector;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		Vector<Integer> vectorInt = new Vector<Integer>();
		int limite = 10, cantidad = 4, total = 0;
		int numMayor = Integer.MIN_VALUE, numMenor = Integer.MAX_VALUE;	
		//Integer.MAX_VALUE y Integer.MIN_VALUE indican el mayor y el menor valor que se le asigna a un Integer (int)
		
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
			if (vectorInt.elementAt(i) < numMenor)
				numMenor = vectorInt.elementAt(i);
			if (vectorInt.elementAt(i) > numMayor)
				numMayor = vectorInt.elementAt(i);
		}
		
		System.out.println("El número más grande es: " + numMayor + " y el menor es: " + numMenor);

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
