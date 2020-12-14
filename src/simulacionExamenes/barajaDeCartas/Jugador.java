package simulacionExamenes.barajaDeCartas;

import java.util.Arrays;

public class Jugador {
		// Atributos
	Carta mano[] = new Carta [5];
	String nombre;
	
		// Métodos
	
	/**
	 */
	public Jugador() {}
	
	
	/**
	 * @param mano
	 * @param nombre
	 */
	public Jugador(Carta[] mano, String nombre) {
		this.mano = mano;
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Jugador [mano=" + Arrays.toString(mano) + ", nombre=" + nombre + "]";
	}


	/**
	 * @return the mano
	 */
	public Carta[] getMano() {
		return mano;
	}


	/**
	 * @param mano the mano to set
	 */
	public void setMano(Carta[] mano) {
		this.mano = mano;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
		
	
	
	
	
	
}
