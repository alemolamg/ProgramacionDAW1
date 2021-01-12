package capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Manuscrito extends Antiguedad {
	private String autor;

	/**
	 * @param anioFab
	 * @param origen
	 * @param precio
	 * @param autor
	 */
	public Manuscrito(int anioFab, String origen, float precio, String autor) {
		super(anioFab, origen, precio);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Manuscrito [autor=" + autor + ", anioFab=" + anioFab + ", origen=" + origen + ", precio=" + precio
				+ "]";
	}
	
	
	
	
}
