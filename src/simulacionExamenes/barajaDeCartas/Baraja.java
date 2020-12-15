package simulacionExamenes.barajaDeCartas;

import java.util.Arrays;

public class Baraja {
	//	Atributos
	private Carta[] cartas = new Carta[52];
	private int cartasRepartidas = 0;
	
	//	Métodos

	/**
	 * 
	 */
	public Baraja() {
		this.cartasRepartidas = 0;
		int idCarta = 0;
		for(int i = 1; i <=13; i++) {
			cartas[idCarta] = new Carta(i, "picas", idCarta);
			idCarta++;
		}
		
		for(int i = 1; i <= 13; i++) {
			cartas[idCarta] = new Carta(i, "diamantes", idCarta);
			idCarta++;
		}
		
		for(int i = 1; i <= 13; i++) {
			cartas[idCarta] = new Carta(i, "tréboles", idCarta);
			idCarta++;
		}
		
		for(int i = 1; i <= 13; i++) {
			cartas[idCarta] = new Carta(i, "corazones", idCarta);
			idCarta++;
		}		
	}
	
	
	public void moverCartaDesdeAbajoHastaArriba() {
		// Salvaguardo la primera posición del array
		Carta aux = this.cartas[0];
		// Recorro las posiciones del array de primera a penúltima
		for (int j = 0; j < cartas.length - 1; j++) {
			cartas[j] = cartas[j+1];
		}
		// La primera posición, guardada en aux, pasa a ser la última
		cartas[cartas.length-1] = aux;
	}
	
	public void moverCartaDesdeArribaHastaAbajo() {
		// Pongo a salvo el último elemento del array
		Carta aux = cartas[cartas.length - 1];
		// Desplazo uno a uno los elementos del array, desde la derecha hacia la izquierda
		for (int i = cartas.length - 1; i > 0; i--) {
			cartas[i] = cartas[i-1];
		}
		// Introduzco el último valor, puesto a salvo, en la primera posición del array
		cartas[0] = aux;
	}
	
	public void imprimeBaraja() {
		for (int i = 0; i < cartas.length; i++) 
			System.out.println(cartas[i]);
	}
	
	
	/**
	 * Mezcla las cartas de la baraja
	 */
	public void mezclar() {
		for (int i = 0; i < cartas.length/2; i++) {
			int primerIndice = (int) Math.round(Math.random() * cartas.length);
			int SegundoIndice = (int) Math.round(Math.random() * cartas.length);
			
			Carta aux = cartas[primerIndice];
			cartas[primerIndice] = cartas[SegundoIndice];
			cartas[SegundoIndice] = aux;
		}
	}
	
	
	/**
	 * Ordena la baraja de cartas
	 */
	public void ordenar() {
		Carta auxiliar;
        boolean intercambio = false;

        do {
            intercambio = false;
            for (int i = 0; i < cartas.length - 1; i++)
                if (cartas[i].getId() > cartas[i + 1].getId()) { // Comparamos IDs
                    auxiliar = cartas[i + 1]; // Guardamos valor en auxiliar
                    cartas[i + 1] = cartas[i]; // Realizamos intercambio
                    cartas[i] = auxiliar;
                    intercambio = true;
                }

        } while (intercambio); // Saldremos del bucle cuando no haya intercambios
	}
	
	
	/**
	 * Método que reparte cartas a todos los jugadores.
	 * @param jugador
	 */
	public void repartir(Jugador jugador) {
			for (int j = 0; j < jugador.getMano().length; j++) {
				jugador.getMano()[j] = cartas[cartasRepartidas];
				this.cartasRepartidas++;
			}
			jugador.jugada();
	}


	@Override
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + ", cartasRepartidas=" + cartasRepartidas + "]";
	}
	
	
	
	
	
}
