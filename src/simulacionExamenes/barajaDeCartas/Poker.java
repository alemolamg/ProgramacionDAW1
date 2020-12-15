package simulacionExamenes.barajaDeCartas;

public class Poker {

	public static void main(String[] args) {
		Jugador arrayJugadores[] = new Jugador[5];
		for (int i = 0; i < arrayJugadores.length; i++)
			arrayJugadores[i] = new Jugador("Jugador " + i);
		
		// Ejercicio 1.
		Baraja barajaPartida = new Baraja();
		System.out.println("\n Ejercicio 1\n\n" + barajaPartida.toString());
		
		// Ejercicio 2.
		barajaPartida.moverCartaDesdeAbajoHastaArriba();
		System.out.println("\n Ejercicio 2\n\n"+ barajaPartida.toString());
		
		// Ejercicio 3.
		barajaPartida.moverCartaDesdeArribaHastaAbajo();
		System.out.println("\n Ejercicio 3\n\n" +barajaPartida.toString());
		
		// Ejercicio 4.
		barajaPartida.mezclar();
		System.out.println("\n Ejercicio 4\n\n" + barajaPartida.toString());
		
		// Ejercicio 5.
		barajaPartida.ordenar();
		System.out.println("\n Ejercicio 5\n\n" + barajaPartida.toString());
		
		// Ejercicio 6.
		System.err.println("\n Ejercicio 6\n\n" );
		repartirCartas(barajaPartida, arrayJugadores);
		
	}
	
	
	/**
	 * Método que reparte cartas a los jugadores.
	 * @param barajaPart (Baraja)	Baraja con las cartas de la partida.
	 * @param jugadores (Jugador)	Jugadores de la partida.
	 */
	private static void repartirCartas(Baraja barajaPart, Jugador jugadores[]) {
		for (int i = 0; i < jugadores.length; i++)
			barajaPart.repartir(jugadores[i]);
	}

}
