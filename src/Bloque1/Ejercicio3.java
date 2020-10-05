package Bloque1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		double resultado = 0;
		
		Scanner leer = new Scanner (System.in);
		System.out.println("Programa de sumar 3 números");
		
		for (int vez=1; vez <= 3; vez++) {
			System.out.println ("Introduce el "+ vez +"º número.\n");
			resultado = resultado + leer.nextDouble();
		}
		
		System.out.println("La suma total es: "+ resultado);
	}

}
