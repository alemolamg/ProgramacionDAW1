package Bloque1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int     num1;
        float   num2;
        double  num3;

        Scanner leer = new Scanner (System.in);

        System.out.println ("Introduce Número entero");
        num1 = leer.nextInt();
        System.out.println ("El número entero es: "+ num1);
        
        System.out.println ("Introduce Número Flotante");
        num2 = leer.nextFloat();
        System.out.println ("El número flotante es: "+ num2);

        System.out.println ("Introduce Número Double");
        num3 = leer.nextDouble();
        System.out.println ("El número double es: "+ num3);

	}

}
