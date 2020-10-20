package utilidades;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Clase creada para añadir los métodos más 
 * @author Alemol
 */
public class UtilsAlemol {
	
	/**
	 * Muestra un array por pantalla.
	 * @param array	objeto a mostrar.
	 */
	public static void imprimirArray(int array[]) {
		for (int i = 0; i < array.length; i++) // mostrar array por pantalla
			System.out.print(array[i] + " ");
		System.out.println();
	}
	
	
	/**
	 * obtienes un número al azar entre 0 y 100
	 * @return	num (int) entre 0 y 100
	 */
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 101);
	}
	
	
	/**
	 * Leer número con método Buffered
	 * @return	(int)
	 */
	public static int obtenerEnteroBuffered () {
		int numero = 0;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader (isr);
			numero = Integer.parseInt (br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return numero;
	}

	
	
	public static int obtenerEnteroScanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	
	public static int obtenerEnteroJO() {
		String str = JOptionPane.showInputDialog("Introduce un número");
		return Integer.parseInt(str);
	}

	
	/**
	 * Genera un entero Random entre 0 y 100, y lo devuelve.
	 * @return	(int) Random entre 0 y 100.
	 */
	public static int generadorRandomInt() {
		Random r1 = new Random();
		return r1.nextInt(1001);
	}
	
}
