package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

public class PreguntaOpUni extends Pregunta {

	public PreguntaOpUni(String textoPre, String respuesta) {
		super(textoPre, respuesta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarPregunta() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verificarRespuesta(String respuesta) {
		// TODO Auto-generated method stub
		return false;
	}

}
