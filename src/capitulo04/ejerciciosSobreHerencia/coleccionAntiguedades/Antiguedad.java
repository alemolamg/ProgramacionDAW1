package capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Antiguedad {
	// Atributos
	protected int anioFab;
	protected String origen;
	protected float precio;
	
	// Métodos
	/**
	 * @param anioFab
	 * @param origen
	 * @param precio
	 */
	public Antiguedad(int anioFab, String origen, float precio) {
		super();
		this.anioFab = anioFab;
		this.origen = origen;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Antiguedad [anioFab=" + anioFab + ", origen=" + origen + ", precio=" + precio + "]";
	}

	public int getAnioFab() {
		return anioFab;
	}

	public void setAnioFab(int anioFab) {
		this.anioFab = anioFab;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
