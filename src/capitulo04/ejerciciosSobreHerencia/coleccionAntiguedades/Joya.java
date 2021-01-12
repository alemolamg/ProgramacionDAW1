package capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Joya extends Antiguedad {
	protected String materialFab;

	/**
	 * @param anioFab
	 * @param origen
	 * @param precio
	 * @param materialFab
	 */
	public Joya(int anioFab, String origen, float precio, String materialFab) {
		super(anioFab, origen, precio);
		this.materialFab = materialFab;
	}

	@Override
	public String toString() {
		return "Joyas [anioFab=" + anioFab + ", origen=" + origen + ", precio=" + precio + ", materialFab="
				+ materialFab + "]";
	}
	
}
