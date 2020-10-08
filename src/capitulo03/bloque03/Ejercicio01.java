package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		int numero, total = 0;
		
		do {
			numero = lectorInt();
			if (numero != 0)
				total += numero;
			
		} while (numero != 0);
		
		System.out.println("La suma total es: " + total);
		
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
