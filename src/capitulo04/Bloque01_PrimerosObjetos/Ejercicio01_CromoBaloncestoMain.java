package capitulo04.Bloque01_PrimerosObjetos;

import java.util.ArrayList;
import java.util.List;
import capitulo04.Bloque01_PrimerosObjetos.CromoBaloncesto;

public class Ejercicio01_CromoBaloncestoMain {

	public static void main(String[] args) {
		// Crear una lista con 5 valores creados por mí (paso 1 y 2 juntos).
		
		List<CromoBaloncesto> listaCromos = new ArrayList<CromoBaloncesto>();
		
		listaCromos.add(new CromoBaloncesto("Larry Bird",206,98,(float) 23.3));
		listaCromos.add(new CromoBaloncesto("Kareem Abdul-Jabbar",218,106,(float) 40));
		listaCromos.add(new CromoBaloncesto("LeBron 'King' James",203,113,(float) 36.7));
		listaCromos.add(new CromoBaloncesto("Jason 'White Chocolate' Williams",185,86,(float) 18.5));
		listaCromos.add(new CromoBaloncesto("James 'The Beard' Harden",196,100,(float) 21.3));
		
		System.out.println("\nMostramos jugadores");
		for (int ite = 0; ite < listaCromos.size(); ite++) 		// Apartado 3
			System.out.println(listaCromos.get(ite).toString());// Mostrar valores a traves de toString();
		
		ordenaJugadores(listaCromos);
		
		System.out.println("\nMostramos jugadores tras ordenar");		
		for (int ite = 0; ite < listaCromos.size(); ite++) 		// mostramos solución tras ordenar
			System.out.println(listaCromos.get(ite).toString());// Mostrar valores a traves de toString();

	}
	
	/**
	 * Ordena Jugadores a través del método burbuja.
	 * @param lista
	 */
	public static void ordenaJugadores(List<CromoBaloncesto> lista) {
		CromoBaloncesto aux = new CromoBaloncesto();
		boolean burbujaActiva = false;
		
		do {
			burbujaActiva = false;
			for (int i = 0; i < lista.size() - 1; i++)  // recorremos la lista en busca del valor menor.
				if (lista.get(i).getPuntosMedioPorPartido() > lista.get(i + 1).getPuntosMedioPorPartido()) {
					aux = lista.get(i); // guardamos el número en una variable
					
					lista.remove(i);		// eliminamos el valor que tenemos en el aux
					lista.add(i+1, aux);	// Añadimos en la posición
					burbujaActiva = true;
				}
			
		} while (burbujaActiva); // Repetimos bucle hasta que no haya intercambios
	}

}
