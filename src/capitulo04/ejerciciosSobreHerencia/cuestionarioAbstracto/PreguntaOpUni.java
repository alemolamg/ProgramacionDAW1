package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

public class PreguntaOpUni extends Pregunta {

	private int respuestaCorrecta;
	private String arrayResps[] = new String [4];
	
	public PreguntaOpUni(String textoPre, int respuesta, String [] respuestasPosibles) {
		super(textoPre);
		this.respuestaCorrecta = respuesta;
		this.arrayResps = respuestasPosibles;
	}

	@Override
	public void mostrarPregunta() {
		System.out.println("\n" + this.textoPre + "\n Elige la respuesta correcta : \n");
		for (String s : this.arrayResps)
			System.out.println(s);
		this.leerRespuestaUsuario();		
	}

	@Override
	public boolean verificarRespuesta() {
		if (this.respuestaCorrecta == Integer.parseInt(this.usuarioRespuesta))
			return true;
		return false;
	}

}
