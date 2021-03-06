package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int numero = 0, numMayor = Integer.MIN_VALUE;
		System.out.println("Programa que calcula el mayor de los números leidos (0 para salir)");
		
		do {
			numero = lectorInt();
			if (numero != 0 && numero > numMayor) {		//Saber si no es 0 y es mayor que el anterior número
				numMayor = numero;
			}
		} while (numero != 0);
		
		System.out.println("El número mayor es: " + numMayor);

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
