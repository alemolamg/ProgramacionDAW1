package Cap2_Bloque3;

import javax.swing.JOptionPane;

//import com.sun.tools.classfile.Dependencies.ClassFileError;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numMenu = 0;
		do {
		numMenu = menuCalculadora();
		
		if (numMenu > 0)
		
			switch(numMenu) {
			
			case 1:
				calcularRaiz();
				break;	
				
			case 2:
				calcularPotencia();
				break;		
				
			case 3:
				calcularModuloDivision();
				break;		
			}
		
		else
			System.out.println("Saliendo del programa");
		
		} while (numMenu > 0);

		System.out.println("CASIO");
	}
	
	
	/**
	 * Programa que muestra un menú y devuelve el menú elegido.
	 * 
	 * @return (int) numMenu elegido.
	 */
	public static int menuCalculadora() {
		mostrarMenu();
		return lectorInt();		
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
	
	
	/**
	 * Programa que muestra un menú.
	 */
	public static void mostrarMenu() {
		System.out.println("*Menú de selector de calculadora*.\n "
				+ "Elige una de las siguientes opciones:\n\n");
		System.out.println("1ª Operación: Calcular raiz cuadrada.");
		System.out.println("2ª Operación: Calcular potencias");
		System.out.println("3ª Operación: Calcular módulo de división");
		System.out.println("Número negativo para salir.");
		
	}
	
	/**
	 * Método para calcular una potencia.
	 */
	private static void calcularPotencia() {
		float base, exponente;
		
		System.out.println("Introduce la base: ");
		base = lectorInt();
		System.out.println("Introduce el exponente: ");
		exponente = lectorInt();
		
		System.out.println("La potencia de base " + base + " con exponente " 
				+ exponente + " es: " + Math.pow(base, exponente) );
		
	}
	
	/**
	 * Método para calcular una raiz cuadrada.
	 */
	private static void calcularRaiz() {
		float base, indice;
		
		System.out.println("Introduce la base: ");
		base = lectorInt();
		System.out.println("Introduce el exponente: ");
		indice = lectorInt();
		
		System.out.println("La raiz de base " + base + " con indice " 
				+ indice + " es: " + Math.pow(base, 1 / indice) ); 
		
	}
	
	
	private static void calcularModuloDivision () {
		float dividendo, divisor;
		
		System.out.println("Introduce el dividendo: ");
		dividendo = lectorInt();
		System.out.println("Introduce el divisor: ");
		divisor = lectorInt();
		
		System.out.println("La división con dividendo " + dividendo + " con divisor " 
				+ divisor + " es: " + dividendo % divisor ); 
		
	}

}
