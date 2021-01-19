package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Bateria extends Componente {
	//	Atributos
	protected int capacidad = 1000;
	protected double voltaje = 5;

	public Bateria(String nombre, int capacidad, double voltaje) {
		super(nombre);
		this.capacidad = capacidad;
		this.voltaje = voltaje;
	}

	public Bateria(String nombre, Componente compAnterior, Componente compSiguiente, int capacidad, double voltaje) {
		super(nombre, compAnterior, compSiguiente);
		this.capacidad = capacidad;
		this.voltaje = voltaje;
	}

	@Override
	public String toString() {
		return "Bateria [capacidad=" + capacidad + ", voltaje=" + voltaje + ", compAnterior=" + compAnterior.nombre
				+ ", compSiguiente=" + compSiguiente.nombre + "]";
	}


	
	
	
}
