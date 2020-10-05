package Bloque1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int a,b,aux;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println ("Introduce 1ª variable");
        a = leer.nextInt();

		System.out.println ("Introduce 2ª variable");
        b = leer.nextInt();
        
        System.out.println ("El valor de la primera variable es: " + a 
        		+ ", y el de la segunda es: "+b);
        
        System.out.println("\n ---- CAMBIANDO ---- \n");
        aux=a;
        a=b;
        b=aux;
        
        System.out.println ("El nuevo valor de la primera variable es: " + a 
        		+ ", y el de la segunda es: "+b);
        
	}

}
