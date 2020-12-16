package simulacionExamenes.marcianitos;

public class Personaje {
	//	Atributos
	private int puntosVida;
	private String nombre;
	private boolean vivo;
	private int dispRecibidos = 0;
	
	//	Métodos
	public Personaje() {
		this.puntosVida = 50 + (int) Math.round(Math.random() * 50);	// 50 puntos iniciales + random(50)
		this.nombre = "Personaje Jugable";
		this.vivo = true;
	}
	
	public Personaje(String nombre) {
		this.puntosVida = 50 + (int) Math.round(Math.random() * 50);	// 50 puntos iniciales + random(50)
		this.nombre = nombre;
		this.vivo = true;
	}

	/**
	 * @return the puntosVida
	 */
	public int getPuntosVida() {
		return puntosVida;
	}

	/**
	 * @param puntosVida the puntosVida to set
	 */
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
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
	 * @return the vivo
	 */
	public boolean getVivo() {
		return vivo;
	}

	/**
	 * @param vivo the vivo to set
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	
	public int getDispRecibidos() {
		return dispRecibidos;
	}

	public void setDispRecibidos(int dispRecibidos) {
		this.dispRecibidos = dispRecibidos;
	}

	public void disparar(Personaje enemigo) {
		int disparo = 5 + (int) Math.round(Math.random() * 20);
		enemigo.setPuntosVida(enemigo.getPuntosVida() - disparo);
		enemigo.dispRecibidos++;
		enemigo.comprobarVida();		
	}
	
	/**
	 * Comprueba si le queda vida al personaje
	 */
	public void comprobarVida() {
		if(this.puntosVida <= 0)
			this.vivo = false;
	}
	
}
