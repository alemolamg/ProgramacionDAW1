package capitulo06_Recursos.math;

import java.util.Scanner;

public class Ejercicio01_Ecuacion2Grado {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); // se crea objeto tipo scanner
		
		System.out.println("Ingrese valores ax,bx,c : ");
		
		String valores = leer.nextLine(); // obtiene los valores a,b,c separados por ','
		
		String[] numeros = valores.split(","); // separa los numeros
		int a = Integer.parseInt(numeros[0]); // variable a almacenada es trasformada a int
		int b = Integer.parseInt(numeros[1]); // variable b almacenada es trasformada a int
		int c = Integer.parseInt(numeros[2]); // variable v almacenada es trasformada a int
		// Obtien los valores x1,x2 de la ecuacion
		double x1 = -3;
		double x2 = -3;
		if(a != 0 && b!= 0 && c!= 0) {
			x1 = (double) (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
			x2 = (double) (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		} else {
			if(a == 0) {
				x1 = (double) ((-1 * c)/b);
				x2 = (double) ((-1 * c)/b);
			}
			
			if (b == 0) {
				x1 = (double) (Math.sqrt((-c)/a));
				x2 = (double) -1 * (Math.sqrt((-c)/a));
			}
			
			if(c == 0) {
				x1 = (double) 0;
				x2 = (double) (-c/b);
 			}
		}
		
		// imprime los valores
		System.out.println("La solucion de x1: " + x1);
		System.out.println("La solucion de x2: " + x2);

	}

}
