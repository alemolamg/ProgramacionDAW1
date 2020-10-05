package Cap1_Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio7 {
	
	public static void main (String [] args ) {
		
		int numUno = 1, numLeido = 0;
//		System.out.print(" operación &: " + (lectorInt() & numUno) );
		

		numLeido = lectorInt();
		
		numLeido = ~numLeido + 1;
		System.out.println("Complemento es: " + numLeido);
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
