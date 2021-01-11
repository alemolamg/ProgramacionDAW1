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
	
	
	/**
	 * @param nombre
	 */
	public Jugador(String nombre) {
		super();
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
	
	
	/**
	 * @return maximo de repeticiones de cartas.
	 */
	public int verificarPuntosMano () {
		int maximoPuntos = 1;
		for (int i = 0; i < mano.length-1; i++) {
			int contador = 1;
			for (int j = i+1; j < mano.length; j++) {
				if(mano[i].getNumero() == mano[j].getNumero())
					contador++;
			}
			if(contador > maximoPuntos)
				maximoPuntos = contador;
		}
		return maximoPuntos;
	}
	
	
	public void nuevoLectorPuntos() {
		int i = 0, contador = 0;
		do {
			for (int j = i+1; j < mano.length; j++) {
				if(mano[i].getNumero() == mano[j].getNumero())
					contador++;
			}
			
		}while(i < mano.length);
		
		
	}
	
	
	public void jugada() {
		switch (verificarPuntosMano()) {
		case 1:
			System.out.println("Soy el " + this.nombre + " y tengo solo carta alta");
			break;
		case 2:
			System.out.println("Soy el " + this.nombre + " y tengo"
					+ " una pareja");
			break;
		case 3:
			System.out.println("Soy el " + this.nombre + " y tengo "
					+ "un trio");
			break;
		case 4:
			System.out.println("Soy el " + this.nombre + " y tengo"
					+ " un poker");
			break;
		case 5: 
			System.out.println("Soy el " + this.nombre + " y estoy haciendo trampa"
					+ " o algo falla porque no puedo tener 5 cartas iguales.");
		default:
			System.out.println("no tengo nada");
			break;
		}
	}
	
	
	
	
	
}
