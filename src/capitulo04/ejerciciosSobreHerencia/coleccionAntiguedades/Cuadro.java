package capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Cuadro extends Antiguedad {
	// Atributos
	private String nombre;
	private String autor;
	/**
	 * @param anioFab
	 * @param origen
	 * @param precio
	 * @param nombre
	 * @param autor
	 */
	public Cuadro(int anioFab, String origen, float precio, String nombre, String autor) {
		super(anioFab, origen, precio);
		this.nombre = nombre;
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Cuadro [anioFab=" + anioFab + ", origen=" + origen + ", precio=" + precio + ", nombre=" + nombre
				+ ", autor=" + autor + "]";
	}
	
	
	
}
