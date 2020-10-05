package Bloque1;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		double numeros = 0, resultado=0;
		int totalNums = 3;		//Usado para calcular la media
		
		Scanner leer = new Scanner (System.in);
		System.out.println("Programa que calcula la media de " + totalNums + " números");
		
		for (int vez=1; vez <= totalNums; vez++) {
			System.out.println ("Introduce el " + vez + "º número.\n");
        	numeros = numeros + leer.nextDouble();
		}
		
		resultado = numeros / totalNums;
		
		System.out.println("La media total es: " + resultado);
		
		
	}

}
