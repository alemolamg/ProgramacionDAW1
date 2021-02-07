package hashMap;

import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


import alemol.UtilsAlemol;

public class Ejercicio_Almacen {
	
	public HashMap<Integer, Articulo> almacen = new HashMap<Integer, Articulo>();
	
	private static Ejercicio_Almacen instance = new Ejercicio_Almacen();
	
	
	public static Ejercicio_Almacen getInstance () {
		if (instance == null) { // Si no está inicializada, se inicializa
			instance = new Ejercicio_Almacen();
		}
		return instance;
	}
	
	public Ejercicio_Almacen() {
		aniadirArticulosHashMap(generaArticulos());
	}
	
	public static void main(String[] args) {
		boolean activo = true;
		
		do {
			Ejercicio_Almacen.getInstance().mensajeMenu();
			activo = Ejercicio_Almacen.getInstance().menu();
		} while (activo);
		
		System.out.println("\nFin del programa.");
	}
	
	
	public void mensajeMenu() {
		System.out.println("\n\n***  Menu de artículos  ***");
		System.out.println("Elige una opción: \n" + 
					"1. Añadir artículo al almacen\n"
					+ "2. Borrar un artículo del almacen\n"
					+ "3. Actualizar estante de un artículo\n"
					+ "4. Imprimir lista de artículos\n"
					+ "5. Mostrar estante de un artículo\n"
					+ "Otro Número: terminar programa.\n\n"
					+ "Introduce tu número: ");
	}
	
	
	public boolean menu() {
		int num = UtilsAlemol.obtenerEnteroScanner();
		
		switch(num) {
		case 1:
			//aniadirArticulos();
			actualizarEstante();	//Utilización de un mismo método para verificar repetidos.
			return true;
		case 2:
			borrarArticulos();
			return true;
		case 3:
			actualizarEstante();
			return true;
		case 4:
			imprimirArticulos();
			return true;
		case 5:
			mostrarUnArticulo();
		}	
		return false;
	}
	
	
	private void mostrarUnArticulo() {
		System.out.println("\n\nEscribe el código del artículo a buscar: ");
		int cod = UtilsAlemol.obtenerEnteroScanner();
		
		if(almacen.get(cod) != null) {
			System.out.println(almacen.get(cod));
		} else
			System.out.println("El artículo con el código de barras "+ cod
					+ " no está en nuestro almacén.");
		
		
	}

	private void actualizarEstante() {
		int cod = 0, estante = 0;
		boolean continuar = true;
		//Mensajes para optener los datos del artículo.
		System.out.println("\n\nEscribe el código del artículo: ");
		cod = UtilsAlemol.obtenerEnteroScanner();
		
		if (almacen.get(cod) != null) {
			System.out.println("El artículo ya existe\n" + almacen.get(cod).toString()
					+ "\n ¿quieres actualizar? (s,n)");
			String texto= UtilsAlemol.leerStringScanner();
			if(texto == "n" || texto == "N")
				continuar = false;
		}
		
		if(continuar) {
			System.out.println("\n\nEscribe el estante donde está el artículo: ");
			estante = UtilsAlemol.obtenerEnteroScanner();
			aniadirArticulosHashMap(new Articulo(cod, estante));
		}
		
	}

	private void imprimirArticulos() {
		Iterator<Articulo> art = this.almacen.values().iterator();
		while (art.hasNext()) {
			System.out.println(art.next());
		}
	}

	private void borrarArticulos() {
		System.out.println("\nIntroduce el código del artículo a borrar: ");
		int cod = UtilsAlemol.obtenerEnteroScanner();
		
		if (almacen.get(cod) != null) {		//comprobamos que existe el artículo en la HashMap
			System.out.println("\n--- Se ha eliminado el artículo cod = "+ cod + " ,estante = " + almacen.get(cod).getNumEstante() + " ---");
			this.almacen.remove(cod);
		} else
			System.out.println("Artículo con código = " + cod + " no encontrado.");
	}

	private void aniadirArticulos() {
		int cod = 0, estante = 0;
		//Mensajes para optener los datos del artículo.
		System.out.println("\n\nEscribe el código del artículo: ");
		cod = UtilsAlemol.obtenerEnteroScanner();
		System.out.println("\n\nEscribe el estante donde está el artículo: ");
		estante = UtilsAlemol.obtenerEnteroScanner();
		
		// función para añadir artículo.
		aniadirArticulosHashMap(new Articulo(cod, estante));
		
	}
	
	/**
	 * añade un artículo al HashMap.
	 * @param articulo
	 */
	public void aniadirArticulosHashMap(Articulo articulo) {
		this.almacen.put(articulo.getCodBarras(), articulo);
	}
	
	/**
	 * añade una lista de artículos al HashMap.
	 * @param listaArticulos
	 */
	public void aniadirArticulosHashMap(List<Articulo> listaArticulos) {
		for (Articulo art: listaArticulos  ){
			this.almacen.put(art.getCodBarras(), art);
		}
	}
	
	/**
	 * Crea los Artículos que vamos a añadir a la hashMap, sirve para probar.
	 * @return vector de artículos
	 */
	public List<Articulo> generaArticulos() {
		List<Articulo> listaArticulos = new ArrayList<Articulo>();
		listaArticulos.add(new Articulo(001, 1));
		listaArticulos.add(new Articulo(002, 1));
		listaArticulos.add(new Articulo(003, 2));
		listaArticulos.add(new Articulo(004, 1));
		listaArticulos.add(new Articulo(010, 3));
		listaArticulos.add(new Articulo(005, 3));
		listaArticulos.add(new Articulo(007, 2));
		listaArticulos.add(new Articulo(011, 1));
		listaArticulos.add(new Articulo(022, 4));
		
		return listaArticulos;
	}

}
