package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		int numero = 0, total = 0, numLeidos = 0;
		do {
			numero = lectorInt();
			if (numero != 0) {
				total += numero;
				numLeidos++;
			}
		} while (numero != 0);
		
		System.out.println("La media total es: " + (total / numLeidos));

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
