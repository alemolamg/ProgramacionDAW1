package capitulo05.bloque07_Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import alemol.UtilsAlemol;

public class Ejercicio02_listaEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int opcion = 6;
		List<Integer> listaEnteros = new ArrayList<Integer>();
		
		do {
			// Llamo a mostrar el menú y pedir una opción al usuario.
			opcion = menu();
		
			// Cada caso en función de la opción elegida por el usuario
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("Adios!");
				break;
			case 1:
				rellenarListaAlAzar(listaEnteros);
				break;
			case 2:
				multiplesFunciones(listaEnteros);
				break;
			case 3:
				rellenarListaAlAzar(listaEnteros);
				break;
			case 4:
				eliminarEntreIntervalo(listaEnteros);
				break;
			case 5: 
				// Ha elegido visualizar el fichero
				visualizaLista(listaEnteros);
				break;
			default:
				System.out.println("Opción no válida");
			}
			
			
		} while (opcion != 0);

	}
	
	
	/**
	 * Muestra un menú en pantalla y pide una opción al usuario
	 * @return
	 */
	public static int menu () {
		String strMenu = "\n\nMenú"
				+ "\n0.- Salir"
				+ "\n1.- Crear aleatoriamente la lista de valores"
				+ "\n2.- Calcular suma, media, mayor y menor"
				+ "\n3.- Agregar una cantidad de nuevos valores"
				+ "\n4.- Eliminar elementos cuyo valor esté en un intervalo"
				+ "\n5.- Imprimir la lista"
				+ "\n\nIntroduzca su opción: ";
		// Muestro el menú
		System.out.println(strMenu);
		// Pido una opción al usuario
		int opcionUsuario = UtilsAlemol.obtenerEnteroScanner();
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}

	
	/**
	 * Recorre la lista que simboliza el fichero, exponiendo las líneas en pantalla y cada una con su número de línea
	 * @param lista
	 */
	public static void visualizaLista (List<Integer> lista) {
		System.out.println("\n\nContenido de la lista");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\tPos " + i + " - " + lista.get(i));
		}
	}
	
	
	
	public static void eliminarEntreIntervalo(List<Integer> lista) {
		int longitud = 0, limiteInf = 0, limiteSup = 100, pos = 0;
		System.out.println("Elige el número mínimo: ");				// Pedimos el número mínimo
		limiteInf = leerIntScanner();
		System.out.println("Elige el número máximo: ");				// Pedimos el número máximo
		limiteSup = leerIntScanner();	
		
		if (limiteInf > limiteSup) { 	// Coloca correctamente las variables.
			int aux = limiteInf;
			limiteInf = limiteSup;
			limiteSup = aux;
		}
		
		System.out.println("Se han eliminado " + eliminarEntreNum(lista, limiteInf, limiteSup) 
							+ " números de la lista" );
	}
	
	
	private static int eliminarEntreNum(List<Integer> lista, int min, int max) {
		int cant = 0, i = 0;
		do {
			if(lista.get(i)<= max && lista.get(i) >= min) {
				cant++;
				lista.remove(i);
			} else
				i++;
			
		}while (i < lista.size());
		
		return cant;
	}
	
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void rellenarListaAlAzar(List<Integer> lista){
		int longitud = 0, limiteInf = 0, limiteSup = 100, pos = 0;
		System.out.println("¿Cuantos valores quieres generar?");	//Pedimos la longitud de la lista
		longitud = leerIntScanner();
		System.out.println("Elige el número mínimo: ");				// Pedimos el número mínimo
		limiteInf = leerIntScanner();
		System.out.println("Elige el número máximo: ");				// Pedimos el número máximo
		limiteSup = leerIntScanner();	
		
		if (limiteInf > limiteSup) { 	// Coloca correctamente las variables.
			int aux = limiteInf;
			limiteInf = limiteSup;
			limiteSup = aux;
		}
		
		if(!(lista.isEmpty() )) {		// si ya está iniciado, elegimos la posición donde empezamos a añadir los números.
			System.out.println("Introduce posición de comienzo");
			pos = leerIntScanner();
		}
			
		for (; pos < longitud; pos++) 
			lista.add(pos,obtenerNumeroAzar(limiteInf, limiteSup));		// Recorremos la lista añadiendo los elementos correspondientes
	}
	
	
	/**
	 * Realiza una suma de todos los valores de la lista.
	 * @param 	lista (list<int>)
	 * @return	suma (int) suma de todos los números.
	 */
	private static int sumaValores (List<Integer> lista) {
		int suma = 0;
		for (int i = 0; i < lista.size(); i++)
			suma += lista.get(i);	
		return suma;
	}
	
	
	/**
	 * Leemos string desde el scanner
	 * @return
	 */
	public static int leerIntScanner() {
		Scanner sc = new Scanner(System.in);
//		sc.useDelimiter("\n");
		return sc.nextInt();
	}
	
	
	/**
	 * Método que llama a varias acciones como la suma, media, menor y mayor.
	 * @param lista
	 */
	public static void multiplesFunciones (List<Integer> lista) {
		System.out.println("Suma total de los valores de la lista: " + sumaValores(lista));
		System.out.println("Media de los valores de la lista: " + mediaValoresLista(lista));
		System.out.println("El menor número de la lista es: " + menorValorLista(lista));
		System.out.println("El mayor número de la lista es: " + mayorValorLista(lista));
	}
	
	
	/**
	 * Función que calcula la média de tres enteros y un float.	
	 * @param 	lista	(List<int>) lista con los valores.
	 * @return	media	(int) media de los cuatro números.
	 */
	private static float mediaValoresLista(List<Integer> lista) {
		float media = 0; 
		int contador = 0;
		for (contador = 0; contador < lista.size(); contador++ )
			media = (media * (contador-1) + lista.get(contador) ) / contador;
		return media;
	}
	
	
	/**
	 * Calcula el menor de la lista y la devuelve.
	 * @param lista
	 * @return
	 */
	private static int menorValorLista (List<Integer> lista) {
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < lista.size(); i++)
			menor = Integer.min(menor, lista.get(i));
		return menor;
	}
		
	
	/**
	 * Calcula el menor de la lista y la devuelve.
	 * @param lista
	 * @return
	 */
	private static int mayorValorLista (List<Integer> lista) {
		int mayor = Integer.MIN_VALUE;
		for (int i = 0; i < lista.size(); i++)
			mayor = Integer.max(mayor, lista.get(i));
		return mayor;
	}
	
	/**
	 * Dados dos números, obtenemos un número entre ellos dos.
	 * @param min Límite inferior de generación del número al azar
	 * @param max Límite superior de generación del número al azar
	 * @return Número generado al azar entre dos límites.
	 */
	public static int obtenerNumeroAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;
	}
	
	
}
