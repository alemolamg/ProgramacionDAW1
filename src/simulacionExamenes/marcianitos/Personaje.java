package simulacionExamenes.marcianitos;

public class Personaje {
	//	Atributos
	private int puntosVida;
	private String nombre;
	private boolean vivo = true;
	
	//	Métodos
	public Personaje() {
		this.puntosVida = 50 + (int) Math.round(Math.random() * 50);	// 50 puntos iniciales + random(50)
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
	public boolean isVivo() {
		return vivo;
	}

	/**
	 * @param vivo the vivo to set
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	
	
}
