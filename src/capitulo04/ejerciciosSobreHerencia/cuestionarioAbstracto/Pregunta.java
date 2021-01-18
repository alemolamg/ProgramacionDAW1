package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.Scanner;

public abstract class Pregunta {
	protected String textoPre;
	protected String usuarioRespuesta;
	
	
	//	Métodos
	public Pregunta(String textoPre) {
		this.textoPre = textoPre;
	}
	
	public abstract void mostrarPregunta();
	
	public abstract boolean verificarRespuesta();
	
	protected void leerRespuestaUsuario() {
		Scanner sc = new Scanner (System.in);
		this.usuarioRespuesta = sc.nextLine();
	}
	

}
