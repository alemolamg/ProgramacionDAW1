package capitulo02.bloque03;

import javax.swing.JOptionPane;

import java.math.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numMenu = 0;
		do {
		numMenu = menuCentral();
		
		if (numMenu > 0)
		
			switch(numMenu) {
			
			case 1:
				hipotenusaTriangulo();
				break;	
				
			case 2:
				superficieCirculo();
				break;		
				
			case 3:
				perimetroCircunferencia();
				break;	
				
			case 4:
				areaRectangulo();
				break;
				
			case 5:
				areaTriangulo();
				break;
			}
		
		else
			System.out.println("Saliendo del programa");
		
		} while (numMenu > 0);

		System.out.println("ADIÓS");
		
		

	}
	
	public static int menuCentral() {
		mostrarMenu();
		return lectorInt();		
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
	 * Calcula la superficie de un círculo
	 * a partir de un radio dado.
	 * 
	 */
	private static void superficieCirculo() {
		System.out.println("\n Introduce el rádio del círculo en cm. ");
		float radio = lectorFloat();
		
		System.out.println("El área del circulo con radio: "
				+ radio + " es: " + Math.pow(radio, 2) * Math.PI);
	}
	
	/**
	 * Método que calcula la distancia de una hipotenusa
	 * dados los dos catetos.
	 */
	private static void hipotenusaTriangulo() {
		float cateto1, cateto2;
		double hipotenusaAl2, hipotenusa;
		
		System.out.println("\nCálculo de la hipotenusa de un triángulo rectángulo en cm dado los dos catetos.");
		System.out.println("Introduce el primer cateto: ");
		cateto1 = lectorFloat();
		System.out.println("Introduce el segundo cateto: ");
		cateto2 = lectorFloat();
		
		hipotenusaAl2 = Math.pow(cateto1,2) + Math.pow(cateto2,2);
		hipotenusa = Math.pow(hipotenusaAl2, 0.5);
		System.out.println("La hipotenusa mide : " + hipotenusa + "cm.");		
	}
	
	/**
	 * Método que calcula el perímetro de una circunferencia
	 * a partir del radio dado.
	 */
	private static void perimetroCircunferencia() {
		System.out.println("\n Introduce el rádio de la circunferencia en cm. ");
		float radio = lectorFloat();
		
		System.out.println("El perímetro de la circunferéncia con radio: "
				+ radio + " es: " + radio* 2 * Math.PI);
	}
	
	/**
	 * Calcula el área de un rectángulo
	 */
	private static void areaRectangulo () {
		float altura, base;
		
		System.out.println("\nCálculo del área de un rectángulo.");
		System.out.println("Introduce la base del rectángulo: ");
		base = lectorFloat();
		System.out.println("Introduce la altura del rectángulo: ");
		altura = lectorFloat();
		
		System.out.println("El área del rectángulo es: " + base * altura + "cm^2");
	}
	
	
	private static void areaTriangulo () {
		float altura, base;
		
		System.out.println("\nCálculo del área de un triángulo.");
		System.out.println("Introduce la base del triángulo: ");
		base = lectorFloat();
		System.out.println("Introduce la altura del triángulo: ");
		altura = lectorFloat();
		
		System.out.println("El área del triánguloes: " + (base * altura) / 2 + "cm^2");
		
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
