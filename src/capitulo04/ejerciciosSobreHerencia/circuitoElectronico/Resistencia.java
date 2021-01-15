package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Resistencia extends Componente {
	//	Atributos
	int resistencia = 50;

	// Métodos
	
	/**
	 * @param compAnterior
	 * @param compSiguiente
	 * @param resistencia
	 */
	public Resistencia(Componente compAnterior, Componente compSiguiente, int resistencia) {
		super(compAnterior, compSiguiente);
		this.resistencia = resistencia;
	}

	/**
	 * @param resistencia
	 */
	public Resistencia(int resistencia) {
		super();
		this.resistencia = resistencia;
	}

	@Override
	public String toString() {
		return "Resistencia [resistencia=" + resistencia + ", compAnterior=" + compAnterior + ", compSiguiente="
				+ compSiguiente + "]";
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
	
	
	
	
}
