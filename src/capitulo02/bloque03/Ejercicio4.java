package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int monedas [] = new int [] {100, 50, 25, 5, 1};
		int vuelta [] = new int [5];
		int pagado, ticket;
		
		System.out.println("\nIntroduce el precio total a pagar");
		ticket = lectorInt();
		System.out.print(ticket);
		System.out.println("\nIntroduce la cantidad con la que se paga");
		pagado = lectorInt();
		System.out.print(pagado);
		
		pagado = pagado - ticket;
		
		for (int i = 0; i < 5; i++) {
			if (monedas[i] <= pagado) {	
				vuelta[i] = pagado / monedas[i];
				pagado = pagado % monedas[i];
			}
		}
		
		System.out.println("\nLa vuelta de la compra sería: ");
		for (int i = 0; i < 5; i++) 
			System.out.println("Monedas de " + monedas[i] + "= " + vuelta [i]);		

		System.out.println("Programa terminado.");
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

}
