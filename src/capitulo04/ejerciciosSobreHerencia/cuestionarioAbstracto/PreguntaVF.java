package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

public class PreguntaVF extends Pregunta {
	
	private String respuestaCorrecta;
	
	public PreguntaVF(String textoPre, String correcta) {
		super(textoPre);
		this.respuestaCorrecta = correcta;
	}
	
	@Override
	public void mostrarPregunta() {
		System.out.println("\n" + this.textoPre + "\n Elige la respuesta 'V' o 'F' : \n");
		this.leerRespuestaUsuario();
	}
	
	@Override
	public boolean verificarRespuesta() {
		if (this.usuarioRespuesta.equalsIgnoreCase(this.usuarioRespuesta))
			return true;
		return false;
	}
	
}