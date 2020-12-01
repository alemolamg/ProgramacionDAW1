package practicasExamenes.examen_3_11;

import java.util.Scanner;

public class ExamenBolos {

	public static void main(String[] args) {
		
		int bolos [] = new int [10];
		valorBolos(bolos, 1);
		presentacionBolos();
		
		int valor = 1, puntos = 0, puntuaje = 20;
		boolean terminado = false;
		
		do {
			
			mostrarBolosPantalla(bolos);			
			valor = miniMenu();
			
			if (valor == 1){
				puntuaje = puntuaje/2;
				puntos = lanzarBola(bolos,puntos,puntuaje);
				System.out.println("Puntos tirada = " + puntos);
				
				if (calcularBolosDerribados(bolos) == 10) {
					System.out.println("¡Ya están derribados todos los bolos!");
					terminado = true;
				}
			} else
				terminado = true;
			
		}while (!terminado);
		
		System.out.println("PUNTOS = " + puntos);
		mostrarPuntuacion(bolos, puntos);
		
	}
	
	
	public static void mostrarPuntuacion(int array[], int puntuacion) {
		System.out.println("\nHa terminado el juego");
		System.out.println("Has derribado un total de " + calcularBolosDerribados(array) + " bolos");
		System.out.println("Tu puntuación final es: " + puntuacion);
	}
	
	
	public static int  miniMenu () {
		System.out.println("¿Que quieres hacer ?");
		System.out.println("0 - Salir del juego");
		System.out.println("1 - Lanzar otra bola");
		return obtenerEnteroScanner();
	}
	
	
	/**
	 * Añade un valor a todos los valores del array
	 * @param array	(int [])
	 * @param valor (int)
	 */
	private static void valorBolos (int array [], int valor) {
		for (int i = 0; i < array.length; i++) 
			array[i] = valor;
	}
	
	
	/**
	 * Muestra por pantalla ordenados los bolos y su estado actual
	 * @param array
	 */
	public static void mostrarBolosPantalla(int array[]) {
		int posArray = 0;	// Variable para recorrer array
		
		for (int i = 0; i < 4; i++) {	// recorre las filas para imprimir
			System.out.println();
			for(int aux = 0; aux < i; aux++)	// imprime los espacios en blanco
				System.out.print(" ");
			for (int j = i; j < 4; j++ ) {		// se recorre para añadir posición
				System.out.print(array[posArray] + " ");	// imprime posición
				posArray++;
			}
		}
		System.out.println("\n");		
	}
	
	private static int calcularBolosDerribados(int array []) {
		int bolosDerribados = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 0)
				bolosDerribados++;
		}
		return bolosDerribados;
	}
	
	/**
	 * 
	 * @param array
	 * @param puntos
	 * @param puntuaje
	 * @return
	 */
	public static int lanzarBola(int array[], int puntos, int puntuaje) {
		int bolosDerribados = 0, limite = 50;
//		boolean todosDerribados = true;
		
		for (int i = 0; i < array.length; i++)
			if(array[i] != 0) { 
//				todosDerribados = false;
				if (obtenerNumeroAzar100() < limite) {
					array[i] = 0;
					bolosDerribados++;
				}
			}
		
		return puntos + (bolosDerribados * puntuaje);
	}
	
	
	public static void presentacionBolos() {
		System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_1_______1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶1111¶¶¶¶¶¶1_1________¶¶¶¶¶¶1111¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶11______¶¶¶¶1_1________¶¶¶¶1______1¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶_1______1¶¶¶¶__1______¶¶¶¶111______1¶¶¶¶\r\n"
				+ "¶¶¶¶¶_11_____1¶¶¶¶¶1_____1¶¶¶¶¶¶_1______1¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶1_____1¶¶¶¶¶¶1_1___1¶¶¶¶¶¶¶1_____1¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶____1¶¶¶¶¶¶¶_11____¶¶¶¶¶¶¶1____¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶1_1___¶¶¶¶¶¶1_11____1¶¶¶¶¶¶11___1¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶_11___1¶¶¶¶¶1_1______¶¶¶¶¶¶_1____¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶1_1_____¶¶¶¶¶_1¶______1¶¶¶¶__1____1¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶__¶_____1¶¶¶1_11_______¶¶¶¶_11_____¶¶¶¶¶\r\n"
				+ "¶¶¶¶1_11______¶¶¶__¶1_______1¶¶1_¶1______¶¶¶¶\r\n"
				+ "¶¶¶¶__¶1______1¶1_1¶_________¶¶__¶_______¶¶¶¶\r\n"
				+ "¶¶¶¶__¶_______1¶__1¶_________¶1_1¶_______1¶¶¶\r\n"
				+ "¶¶¶1_1¶________1__¶¶_________11_¶¶________¶¶¶\r\n"
				+ "¶¶¶1_1¶________1__¶¶_________11_¶¶________¶¶¶\r\n"
				+ "¶¶¶1_1¶________1__¶¶_________11_¶¶________¶¶¶\r\n"
				+ "¶¶¶¶_1¶1______11__¶¶_________11_1¶_______1¶¶¶\r\n"
				+ "¶¶¶¶__¶1______1¶__¶¶_________1¶_1¶1______1¶¶¶\r\n"
				+ "¶¶¶¶1_¶¶______¶¶__¶¶_________1¶__¶¶______¶¶¶¶\r\n"
				+ "¶¶¶¶¶__¶1_____¶¶__1¶1________¶¶1_1¶_____1¶¶¶¶\r\n"
				+ "¶¶¶¶¶1_______¶¶¶1__¶¶________¶¶¶1_______¶¶¶¶¶ \r\n"
				+ "¶¶¶¶¶¶¶1¶¶¶¶¶¶¶¶¶__¶¶1______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__1______1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11111111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶11____________111¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶¶¶¶1______________________11¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶¶¶1___________1¶¶1_____________1¶¶¶¶¶¶¶¶\r\n"
				+ "¶¶¶¶¶_____1______1¶¶¶¶¶¶¶______________1¶¶¶¶¶\r\n"
				+ "¶¶¶1___1¶1_______¶¶¶¶¶¶¶¶________________¶¶¶¶\r\n"
				+ "¶1___1¶¶__________11¶¶11__________________1¶¶\r\n"
				+ "1___¶¶1____1111____________1111_____________¶\r\n"
				+ "___¶¶1___1¶¶¶¶¶¶¶________¶¶¶¶¶¶¶1____________\r\n"
				+ "__¶¶1____¶¶¶¶¶¶¶¶________¶¶¶¶¶¶¶¶____________\r\n"
				+ "_¶¶1______1¶¶¶¶1__________1¶¶¶¶1_____________\r\n"
				+ "1¶¶__________________________________________\r\n"
				+ "¶¶1__________________________________________\r\n"
				+ "¶¶___________________________________________\r\n"
				+ "¶¶___________________________________________\r\n"
				+ "¶¶___________________________________________\r\n"
				+ "¶¶___________________________________________\r\n"
				+ "¶¶___________________________________________\r\n"
				+ "¶¶1__________________________________________\r\n"
				+ "¶¶¶__________________________________________\r\n"
				+ "¶¶¶1_________________________________________\r\n"
				+ "_¶¶¶_________________________________________\r\n"
				+ "_1¶¶¶________________________________________\r\n"
				+ "__1¶¶¶_______________________________________\r\n"
				+ "___1¶¶¶_____________________________________1\r\n"
				+ "¶____¶¶¶1__________________________________1¶\r\n"
				+ "¶¶1____¶¶¶1______________________________1¶¶¶\r\n"
				+ "1¶¶¶1____¶¶¶¶___________________________1¶¶¶ \r\n"
				+ "__¶¶¶¶1____1¶¶¶11__________________1__1¶¶¶ \r\n"
				+ "____¶¶¶¶1______111111_____________1¶¶¶¶¶¶ \r\n"
				+ "______1¶¶¶¶¶1__________________1¶¶¶¶¶¶¶ \r\n"
				+ "_________1¶¶¶¶¶¶¶1111111111¶¶¶¶¶¶¶¶¶ \r\n"
				+ "______________11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ");
	}
	
	
	/**
	 * obtienes un número al azar entre 0 y 100
	 * @return	num (int) entre 0 y 100
	 */
	public static int obtenerNumeroAzar100 () {
		 return (int) Math.round(Math.random() * 100);
	}
	
	
	/**
	 * Usa el método Scanner para obtener el entero
	 * @return int
	 */
	public static int obtenerEnteroScanner() {
		return new Scanner(System.in).nextInt();
	}
	

}
