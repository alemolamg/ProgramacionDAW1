package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Componente {
	// 	Atributos
	protected Componente compAnterior;
	protected Componente compSiguiente;
	
	
	//	Métodos
	
	public Componente() {
		this.compAnterior = null;
		this.compSiguiente = null;
	}


	public Componente(Componente compAnterior, Componente compSiguiente) {
		this.compAnterior = compAnterior;
		this.compSiguiente = compSiguiente;
	}

	

	@Override
	public String toString() {
		return "Componente [compAnterior=" + compAnterior + ", compSiguiente=" + compSiguiente + "]";
	}


	public Componente getCompAnterior() {
		return compAnterior;
	}


	public void setCompAnterior(Componente compAnterior) {
		this.compAnterior = compAnterior;
	}


	public Componente getCompSiguiente() {
		return compSiguiente;
	}


	public void setCompSiguiente(Componente compSiguiente) {
		this.compSiguiente = compSiguiente;
	}
	
	
	
	
}
