package Cap2_Bloque3;

import javax.swing.JOptionPane;

import java.math.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		
		

	}
	
	
	/**
	 * Programa que muestra un menú.
	 */
	public static void mostrarMenu() {
		System.out.println("\n\n *Menú de selección* \n "
				+ "Elige una de las siguientes opciones:\n\n");
		System.out.println("1ª Cálculo hipotenusa de un triangulo.");
		System.out.println("2ª Cálculo superficie de un círculo.");
		System.out.println("3ª Cálculo perímetro de una circuferencia.");
		System.out.println("4ª Cálculo del área de un rectángulo.");
		System.out.println("5ª Cálculo del área de un triángulo.");
		System.out.println("0ª o Número negativo para salir.");
		
	}
	
	/**
	 * Método que calcula la distancia de una hipotenusa
	 * dados los dos catetos.
	 */
	private static void hipotenusaTriangulo() {
		float cateto1, cateto2;
		double hipotenusaAl2;
		
		System.out.println("\nCálculo de la hipotenusa de un triángulo rectángulo en cm dado los dos catetos.");
		System.out.println("Introduce el primer cateto: ");
		cateto1 = lectorFloat();
		System.out.println("Introduce el segundo cateto: ");
		cateto2 = lectorFloat();
		
		hipotenusaAl2 = Math.pow(cateto1,2) + Math.pow(cateto2,2);
		
		System.out.println("La hipotenusa mide : " + Math.pow(hipotenusaAl2, 1/2) + "cm.");		
	}
	
	
	/**
	 * Lee por pantalla números enteros
	 * 
	 * @return (int) número leido
	 */
	public static int  lectorInt () {		
		String lector = JOptionPane.showInputDialog("Introduzca el número entero: ");
		return Integer.parseInt(lector);			
	}
	
	/**
	 * Lee por pantalla números float
	 * 
	 * @return (float) número leido
	 */
	public static float  lectorFloat () {		
		String lector = JOptionPane.showInputDialog("Introduzca el número float: ");
		return Float.parseFloat(lector);			
	}

}
