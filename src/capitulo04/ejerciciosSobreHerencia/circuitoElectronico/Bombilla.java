package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Bombilla extends Componente {
	private int numLumenes;

	//	Métodos
	public Bombilla(int numLumenes) {
		super();
		this.numLumenes = numLumenes;
	}



	public Bombilla(Componente compAnterior, Componente compSiguiente, int numLumenes) {
		super(compAnterior, compSiguiente);
		this.numLumenes = numLumenes;
	}



	@Override
	public String toString() {
		return "Bombilla [numLumenes=" + numLumenes + ", compAnterior=" + compAnterior + ", compSiguiente="
				+ compSiguiente + "]";
	}



	public int getNumLumenes() {
		return numLumenes;
	}



	public void setNumLumenes(int numLumenes) {
		this.numLumenes = numLumenes;
	}
	
	
	
	
}
