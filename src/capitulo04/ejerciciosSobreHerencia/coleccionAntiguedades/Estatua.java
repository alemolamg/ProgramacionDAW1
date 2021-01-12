package capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Estatua extends Antiguedad{
	//	Atributos
	private String nombre;
	private double altura;
	private double anchura;
	private double peso;
	
	
	//	Métodos
	
	/**
	 * @param anioFab
	 * @param origen
	 * @param precio
	 * @param altura
	 * @param anchura
	 * @param peso
	 */
	public Estatua(int anioFab, String origen, float precio, double altura, double anchura, double peso) {
		super(anioFab, origen, precio);
		this.altura = altura;
		this.anchura = anchura;
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Estatua [anioFab=" + anioFab + ", origen=" + origen + ", precio=" + precio + ", nombre=" + nombre
				+ ", altura=" + altura + ", anchura=" + anchura + ", peso=" + peso + "]";
	}
	
	
	
	
	
	
	
}
