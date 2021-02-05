package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ejercicio_Almacen {
	
	public HashMap<Integer, Articulo> almacen = new HashMap<Integer, Articulo>();
	
	public static void main(String[] args) {
		
	}
	
	
	
	public void mostrarMensajeMenu() {
		System.out.println("***  Menu de artículos  ***");
		System.out.println("Elige una opción: \n" + 
					"1. Añadir artículo al almacen\n"
					+ "2. Borrar un artículo del almacen\n"
					+ "3. Actualizar estante de un artículo\n"
					+ "4. Imprimir lista de artículos");
	}
	
	
	public void menu(boolean wanda) {
		int num = 0;
		
		switch(num) {
		case 0:
			aniadirArticulos();
			break;
		case 1:
			borrarArticulos();
			break;
		case 2:
			actualizarEstante();
			break;
		case 3:
			imprimirArticulos();
			break;
		default:
				wanda = false;
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
		listaArticulos.add(new Articulo(012, 3));
		listaArticulos.add(new Articulo(007, 2));
		listaArticulos.add(new Articulo(011, 1));
		listaArticulos.add(new Articulo(022, 4));
		
		return listaArticulos;
	}

}
