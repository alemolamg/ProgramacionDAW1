package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Bombilla extends Componente {
	private int numLumenes;

	//	Métodos
	public Bombilla(String nombre, int numLumenes) {
		super(nombre);
		this.numLumenes = numLumenes;
	}



	public Bombilla(String nombre, Componente compAnterior, Componente compSiguiente, int numLumenes) {
		super(nombre,compAnterior, compSiguiente);
		this.numLumenes = numLumenes;
	}

	@Override
	public String toString() {
		return "Bombilla [numLumenes=" + numLumenes + ", compAnterior=" + compAnterior.nombre + ", compSiguiente="
				+ compSiguiente.nombre + "]";
	}



	public int getNumLumenes() {
		return numLumenes;
	}



	public void setNumLumenes(int numLumenes) {
		this.numLumenes = numLumenes;
	}
	
	
	
	
}
