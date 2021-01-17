package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

public class PreguntaVF extends Pregunta {

	public PreguntaVF(String textoPre, String respuesta) {
		super(textoPre, respuesta);
	}
	
	
	@Override
	public boolean verificarRespuesta(String respuesta) {
		if (this.respuesta == respuesta)
			return true;
		return false;
	}
	
	@Override
	public void mostrarPregunta() {
		System.out.println(this.textoPre);
		
	}
	
	
}