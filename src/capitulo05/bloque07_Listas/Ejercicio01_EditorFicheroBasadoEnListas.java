package capitulo05.bloque07_Listas;

import java.util.ArrayList;
import java.util.List;
import alemol.UtilsAlemol;

public class Ejercicio01_EditorFicheroBasadoEnListas {
	/**
	 * Escribe un programa editor de textos. Debes utilizar la consola de Java. El objetivo es que se pueda editar 
	 * el contenido de un archivo ficticio. Para hacer esto utilizarás una lista de elementos de tipo String. Cada 
	 * línea del texto será representada como un String. Debes mostrar un menú en pantalla, que contenga todas las 
	 * opciones siguientes, y que funcionen adecuadamente:
      a) "Agregar una línea al texto". Pediras al usuario un String y lo agregarás al final de la lista que representa 
      	tu fichero ficticio.
      b) "Insertar una línea en cualquier posición del texto". Pedirás al usuario un String y un número. Insertarás el 
      	String en la línea pedida.
      c) "Editar una línea (reescribir su contenido)". Pedirás al usuario un número de línea para sobrescribir, 
      	mostrarás al usuario la línea actual que desea sobrescribir. Pedirás un nuevo String. Eliminarás el String 
      	actual y cambiarás con el nuevo
      d) "Borrar una línea". Pedirás un número de línea y la eliminarás de la lista.
      e) "Cortar un conjunto de líneas", (marcadas por su posición inicial y final). Pedirás un número de línea inicial 
      	y uno final. "Transportarás todas las líneas del intervalo a una nueva lista y las borrarás de la lista original.
      f) "Pegar un conjunto de líneas cortadas en una determinada posición". Pedirás un número de línea en la que insertar 
      	lo que tienes cortado con la opción anterior.
      g) "Imprimir el fichero". Mostrarás cada línea del fichero ficticio, aparecerá numerada en la consola.
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaro variables necesarias
		int opcion;
		List<String> fichero = new ArrayList<String>();
		
		// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el programa esté finalizado
		fichero.add("Primera línea"); fichero.add("Segunda línea"); fichero.add("Tercera línea");
		
		// Bucle principal de la aplicación
		do {
			// Llamo a mostrar el menú y pedir una opción al usuario.
			opcion = menu();
		
			// Cada caso en función de la opción elegida por el usuario
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("Adios!");
				break;
			case 1:
				aniadirLineaAFichero(fichero);
				break;
			case 2:
				aniadirLineaAFicheroPosicion(fichero);
				break;
			case 3:
				editarLinea(fichero);
				break;
			case 4:
				eliminarPreguntandoFila(fichero);
				break;
			case 5: 
				break;
			case 6:
				break;
			case 7: // Ha elegido visualizar el fichero
				visualizaLista(fichero);
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
				+ "\n1.- Agregar una línea"
				+ "\n2.- Insertar una línea en una posición"
				+ "\n3.- Editar una línea"
				+ "\n4.- Eliminar una línea"
				+ "\n5.- Cortar un conjunto de líneas"
				+ "\n6.- Pegar un conjunto de líneas"
				+ "\n7.- Visualizar el fichero"
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
	public static void visualizaLista (List<String> lista) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}
	
	
	/**
	 * Método que le pide al usuario un String y luego llama a otro método para guardarlo.
	 * @param fichero
	 */
	public static void aniadirLineaAFichero(List<String> fichero) {
		System.out.println("Introduce una fila de texto en el fichero: ");
		String str = UtilsAlemol.leerStringScanner();
		aniadirLinea(fichero, str);
	}
	
	
	/**
	 * Método que le pide al usuario un String y una posición, luego llama a otro método para guardarlo.
	 * @param fichero
	 * @param posicion
	 */
	public static void aniadirLineaAFicheroPosicion(List<String> fichero) {
		int pos = numeroDentroFichero(fichero);
		System.out.println("\nIntroduce una fila de texto en el fichero: ");
		String str = UtilsAlemol.leerStringScanner();
		aniadirLinea(fichero, pos, str);
	}
	
	
	
	public static void editoFila(List<String> fichero) {	//Cambiar a boolean.
		boolean conseguido = true;
		
		
		
	}
	
	
	
	/**
	 * Metodo que lee un número dentro del rango del fichero(List<String>)
	 * @param fichero
	 * @return
	 */
	public static int numeroDentroFichero(List<String> fichero) {
		int pos=0;
		do {		// se encarga de comprobar que el valor de la posición es válido
			System.out.println("Introduce la posición, máximo " + (fichero.size()-1) );
			pos = UtilsAlemol.obtenerEnteroScanner();
			if (!(pos < fichero.size()) )
					System.out.println("el valor es incorrecto, tiene que ser menor que " + fichero.size());
		}while(pos >= fichero.size());
		return pos;
	}
	
	
	/**
	 * Pregunta una fila y elimina la linea
	 * @param fichero
	 */
	private static void eliminarPreguntandoFila(List<String> fichero) {
		int posicion = numeroDentroFichero(fichero);
		fichero.remove(posicion);
	}
	
	
	/**
	 * elimina una fila a partir de la posición mandada
	 * @param fichero
	 * @param posicion
	 */
	private static void eliminarDadaFila (List<String> fichero, int posicion) {
		fichero.remove(posicion);
	}
	
	/**
	 * Añade una línea al final del fichero(list).
	 * @param linea (String)
	 */
	private static void aniadirLinea(List<String> lista, String linea) {
		lista.add(linea);
	}
	
	
	/**
	 * Añade una línea al final del fichero(list).
	 * @param linea (String)
	 */
	private static void aniadirLinea(List<String> lista,int pos, String linea) {
		lista.add(pos,linea);
	}
	
	
	private static void editarLinea(List<String> fichero) {
		System.out.println("¿Qué linea quieres modificar?: ");
		int lineaCambiar = numeroDentroFichero(fichero);
		
		System.out.println("Linea original = '" + fichero.get(lineaCambiar) + "'");
		System.out.println("Introduce la linea nueva: ");
		String textoNuevo = UtilsAlemol.leerStringScanner();
		
		eliminarDadaFila(fichero, lineaCambiar);
		aniadirLinea(fichero, lineaCambiar, textoNuevo);
		
	}
		
	
	
}
