package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println("Introduce tu nota y "
				+ "sabrás la clasificación correspondiente");
		int nota = lectorInt();
		
		
		switch (nota) {
		case 0:
		case 1:
		case 2:
			System.out.println("Muy Deficiente");
			break;
		case 3:
		case 4:
			System.out.println("Deficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		}

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

}
