package Cap2_Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		System.out.println("Programa que verifica si un número es par o impar\n");
		int numero = lectorInt();
		
		if (numero % 2 != 0)
			System.out.println("El número es IMPAR");
		else
			System.out.println("El número es PAR");
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
