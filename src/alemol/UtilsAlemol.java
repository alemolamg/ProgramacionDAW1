package alemol;
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
	public static int obtenerNumeroAzar100 () {
		 return (int) Math.round(Math.random() * 100);
	}
	
	/**
	 * obtienes un número al azar entre 0 y 10
	 * @return	num (int) entre 0 y 100
	 */
	public static int obtenerNumeroAzar10 () {
		 return (int) Math.round(Math.random() * 10);
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

	/**
	 * Usa el método Scanner para obtener el entero
	 * @return int
	 */
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
		return r1.nextInt(100);
	}
	
	
	public static void mostrarTexto (String texto) {
		System.out.println(texto);
	}
	
	
	/**
	 * 
	 * @param min Límite inferior de generación del número al azar
	 * @param max Límite superior de generación del número al azar
	 * @return Número generado al azar entre dos límites.
	 */
	public static int obtenerNumeroAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;
	}
	
	
	/**
	 * Recibe una matriz de enteros y la imprime por pantalla.
	 * @param matriz
	 */
	public static void imprimirMatriz (int matriz [][]) {
		System.out.println();
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j <matriz[i].length; j++)
				System.out.print(matriz[i][j] + " ");
		System.out.println("");
		}
	}
	
	/**
	 * Recibe una matriz de enteros y la imprime por pantalla.
	 * @param matriz
	 */
	public static void imprimirMatriz (char matriz [][]) {
		System.out.println();
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j <matriz[i].length; j++)
				System.out.print(matriz[i][j] + " ");
		System.out.println("");
		}
	}
	
	
	/**
	 * Crea una matriz dado el número de sus dos dimensiones
	 * @param fila 	(int) número de filas
	 * @param col	(int) número columnas
	 * @return	matriz (int[][])
	 */
	public static int[][] crearMatrizAlAzar(int fila, int col) {
		int matriz[][] = new int [fila][col];
		for(int i = 0; i < matriz.length; i++) 
			for (int j = 0; j < matriz[i].length; j++) 
				matriz[i][j] = UtilsAlemol.generadorRandomInt();
		return matriz;
	}
	
	
}
