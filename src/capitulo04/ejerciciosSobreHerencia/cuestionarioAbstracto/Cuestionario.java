package capitulo04.ejerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.ArrayList;
import java.util.List;

public class Cuestionario {

	public static void main(String[] args) {
		int puntos = 0;
		List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();
		listaPreguntas.add(new PreguntaOpUni("¿Cual es la capital de Francia", 0, new String [] {"Paris","Burdeos","Nápoles","Marsella"} ));
		listaPreguntas.add(new PreguntaVF("El mar mediterráneo baña la costa de Italia.", "V"));
		listaPreguntas.add(new PreguntaVF("El volcán Diamond Head es un volcán activo.", "F"));
		
		for(Pregunta p : listaPreguntas) {
			p.mostrarPregunta();
			if(p.verificarRespuesta()) {
				System.out.println("La Respuesta es correcta, +1 punto.");
				puntos++;
			}else
				System.out.println("Respuesta incorrecta :(");
		}
		System.out.println("Has conseguido un total de "+ puntos +" puntos.");		
	}

}
