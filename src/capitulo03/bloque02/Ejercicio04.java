package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		int numero = 33, numMaximo = 100;
		System.out.println("Introduce el número y te mostraré sus múltiplos: ");
		numero = lectorInt();
		System.out.println("Introduce el límite de múltiplos: ");
		numMaximo = lectorInt();		
		
		for (int i = 1; i < numMaximo; i++) {
			muestraMultiplo(numero, i);
		}
	}
	
	
	/**
	 * Muestra los múltiplos por pantalla.
	 * @param num1	número elegido usuario
	 * @param numi	multiplicador elegido
	 */
	private static void muestraMultiplo (int num1, int numi) {
		System.out.println(num1 + " * " + numi + " = " + (num1 * numi));
	}
	
	
	/**
	 * Lee por pantalla los números
	 * 
	 * @return (int) número leido
	 */
	public static int  lectorInt () {		
		String lector = JOptionPane.showInputDialog("Introduzca número entero: ");
		return Integer.parseInt(lector);			
	}
}
