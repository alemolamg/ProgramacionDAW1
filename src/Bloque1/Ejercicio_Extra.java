package Bloque1;

import java.util.Scanner;

/**
 * Aplicación que se encarga de calcular el área de un círculo dado un radio. 
 * 
 * @author alemol
 * @
 */
public class Ejercicio_Extra {

	public static void main(String[] args) {
		
		double radio = 0, area;
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Introduce el radio del círculo en cm: ");
		radio = leer.nextDouble();
		
		area = Math.PI * Math.pow(radio, 2);	//Fórmula para calcular el área
		
		System.out.println("\nEl área de un círculo de radio = " + radio + "cm es: " + area + "cm²");
		

	}

}
