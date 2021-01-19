package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Componente {
	// 	Atributos
	protected String nombre;
	protected Componente compAnterior;
	protected Componente compSiguiente;
	
	
	//	Métodos
	
	public Componente(String nombre) {
		this.nombre = nombre;
		this.compAnterior = null;
		this.compSiguiente = null;
	}


	public Componente(String nombre, Componente compAnterior, Componente compSiguiente) {
		this.nombre = nombre;
		this.compAnterior = compAnterior;
		this.compSiguiente = compSiguiente;
	}

	

	@Override
	public String toString() {
		return "Componente [compAnterior=" + compAnterior.nombre + ", compSiguiente=" + compSiguiente.nombre + "]";
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
