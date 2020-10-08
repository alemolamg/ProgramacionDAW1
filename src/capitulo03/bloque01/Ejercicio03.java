package capitulo03.bloque01;

import java.util.Vector;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		Vector<Integer> vectorInt = new Vector<Integer>();
		int limite = 10, cantidad = 4, numPositivos = 0, numNegativos = 0;
		
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
			if(vectorInt.elementAt(i) >= 0)
				numPositivos++;
			else
				numNegativos++;
		}
		
		System.out.println("El total de números positivos escritos son: " + numPositivos +
				" y los negativos son: " + numNegativos);

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
