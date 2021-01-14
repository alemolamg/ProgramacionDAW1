package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Bateria extends Componente {
	//	Atributos
	protected int capacidad = 1000;

	public Bateria(int capacidad) {
		super();
	}

	public Bateria(Componente compAnterior, Componente compSiguiente, int capacidad) {
		super(compAnterior, compSiguiente);
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Bateria [capacidad=" + capacidad + ", compAnterior=" + compAnterior + ", compSiguiente=" + compSiguiente
				+ "]";
	}
	
	
	
}
