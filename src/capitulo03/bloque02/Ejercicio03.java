package capitulo03.bloque02;

import java.nio.file.FileSystemNotFoundException;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int numero = 33, numMaximo = 100;
		System.out.println("Introduce el número y te mostraré sus múltiplos: ");
		numero = lectorInt();
		
		for (int i = 1; i < numMaximo; i++) {
			muestraMultiplo(numero, i);
		}
		

	}
	
	
	private static void muestraMultiplo (int num1, int numi) {
		System.out.println(num1 + " * " + numi + " = " + (num1 * numi));
	}
	
	/**
	 * Calcula si el número es primo o no.
	 * @param posiblePrimo (Integer) número candidato para ser primo
	 * @return	True si es primo, False si no lo es
	 */
	private static boolean calcularSiPrimo (int posiblePrimo) {
		/* un número primo es aquel número mayor de 1 que
		 *  solo es divisible entre el mismo y el 1 		*/
		int divisor = 2;
		boolean wanda = true;

		if (posiblePrimo > 10) {
			do {
				if (posiblePrimo % divisor != 0)
					divisor++;
				else
					wanda = false;

			} while (divisor < (posiblePrimo/2) & wanda == true);	// Uso técnica de dividir primo a la mitad para ahorrar tiempo.

			return wanda;			
			
		} else {

			do {
				if (posiblePrimo % divisor != 0)
					divisor++;
				else
					wanda = false;

			} while (divisor < posiblePrimo & wanda == true);

			return wanda;
		}
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
