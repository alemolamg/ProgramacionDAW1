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
	public Resistencia(String nombre, Componente compAnterior, Componente compSiguiente, int resistencia) {
		super(nombre,compAnterior, compSiguiente);
		this.resistencia = resistencia;
	}

	/**
	 * @param resistencia
	 */
	public Resistencia(String nombre, int resistencia) {
		super(nombre);
		this.resistencia = resistencia;
	}

	@Override
	public String toString() {
		return "Resistencia [resistencia=" + resistencia + " ohmnios, compAnterior=" + compAnterior.nombre + ", compSiguiente="
				+ compSiguiente.nombre + "]";
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
	
	
	
	
}
