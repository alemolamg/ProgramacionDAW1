package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		int numero = 0, numMenor = Integer.MAX_VALUE, numMayor = Integer.MIN_VALUE;
		System.out.println("Programa que calcula el menor de los números leidos (0 para salir)");
		
		do {
			numero = lectorInt();
			if (numero != 0 && numero < numMenor) {		//Saber si no es 0 y es mayor que el anterior número
				numMenor = numero;
			}
			if (numero != 0 && numero > numMayor) {		//Saber si no es 0 y es mayor que el anterior número
				numMayor = numero;
			}
			
		} while (numero != 0);
		
		System.out.println("El número menor es: " + numMenor + ", y el número mayor es: " + numMayor);
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
