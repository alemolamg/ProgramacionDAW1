package capitulo04.Bloque01_PrimerosObjetos;

public class CromoBaloncesto {
	// Atributos
	private String nombreJugador;
	private int alturaCm;
	private int pesoKg;
	private float puntosMedioPorPartido;
	
	
	// Métodos
	
	/**
	 * Constructor por defecto de CromoBaloncesto
	 */
	public CromoBaloncesto () {
		this.nombreJugador = "jugadorEstandar";
		this.alturaCm = 175;
		this.pesoKg = 75;
		this.puntosMedioPorPartido = (float) 5.5;
	}
	
	
	/**
	 * Constructor parametrizado de CromoBaloncesto
	 * @param nombre
	 * @param altura
	 * @param peso
	 * @param puntosDeMedia
	 */
	public CromoBaloncesto (String nombre, int altura, int peso, float puntosDeMedia) {
		this.nombreJugador = nombre;
		this.alturaCm = altura;
		this.pesoKg = peso;
		this.puntosMedioPorPartido = puntosDeMedia;
	}
	
	
	public String toString () {
		return (nombreJugador +"; "+ alturaCm +"; "+ pesoKg +"; "+ puntosMedioPorPartido );
	}


	/**
	 * @return the nombreJugador
	 */
	public String getNombreJugador() {
		return nombreJugador;
	}


	/**
	 * @param nombreJugador the nombreJugador to set
	 */
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}


	/**
	 * @return the alturaCm
	 */
	public int getAlturaCm() {
		return alturaCm;
	}


	/**
	 * @param alturaCm the alturaCm to set
	 */
	public void setAlturaCm(int alturaCm) {
		this.alturaCm = alturaCm;
	}


	/**
	 * @return the pesoKg
	 */
	public int getPesoKg() {
		return pesoKg;
	}


	/**
	 * @param pesoKg the pesoKg to set
	 */
	public void setPesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}


	/**
	 * @return the puntosMedioPorPartido
	 */
	public float getPuntosMedioPorPartido() {
		return puntosMedioPorPartido;
	}


	/**
	 * @param puntosMedioPorPartido the puntosMedioPorPartido to set
	 */
	public void setPuntosMedioPorPartido(float puntosMedioPorPartido) {
		this.puntosMedioPorPartido = puntosMedioPorPartido;
	}
	
	
	
}
