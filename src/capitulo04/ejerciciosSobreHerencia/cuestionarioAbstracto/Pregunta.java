package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

public abstract class Pregunta {
	protected String textoPre;
	protected String respuesta;
	
	
	//	Métodos
	public Pregunta(String textoPre, String respuesta) {
		this.textoPre = textoPre;
		this.respuesta = respuesta;
	}
	
	public abstract void mostrarPregunta();
	
	public abstract boolean verificarRespuesta(String respuesta);
	
	

}
