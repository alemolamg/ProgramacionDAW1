package simulacionExamenes.marcianitos;

import simulacionExamenes.barajaDeCartas.Carta;

public class CampoBatalla {
	//	Atributos
	private static int NUM_PERS = 20;
	private String nombre = "Campo de Batalla";
	private Malvado malvados[] = new Malvado [NUM_PERS];
	private Humano humanos[] = new Humano [NUM_PERS];
	
	//	Métodos
	
	/**
	 * Constructor por defecto
	 */
	public CampoBatalla() {
		for (int i = 0; i < NUM_PERS; i++) {
			malvados[i] = new Malvado("Malvado "+ i);
			humanos[i] = new Humano("Humano " + i);
		}
		malvados[NUM_PERS - 1].setPuntosVida(malvados[NUM_PERS - 1].getPuntosVida() * 2);
		humanos[NUM_PERS - 1].setPuntosVida(humanos[NUM_PERS - 1].getPuntosVida() * 2);
	}
	
	/**
	 * Constructor parametrizado
	 * @param nombre
	 */
	public CampoBatalla(String nombre) {
		this.nombre = nombre;
		for (int i = 0; i < NUM_PERS; i++) {
			malvados[i] = new Malvado("Malvado "+ i);
			humanos[i] = new Humano("Humano " + i);
		}
	}
	
	
	/**
	 * Mezcla los personajes que luchan.
	 */
	public void mezclarPersonajes() {
		for (int i = 0; i < NUM_PERS; i++) {	// Mezcla los malvados
			int primerIndice = (int) Math.round(Math.random() * (NUM_PERS -1));
			int segundoIndice = (int) Math.round(Math.random() * (NUM_PERS -1));
			
			Malvado auxMal = malvados[primerIndice];
			malvados[primerIndice] = malvados[segundoIndice];
			malvados[segundoIndice] = auxMal;			
		}
		
		for (int i = 0; i < humanos.length; i++) {	// Mezcla los humanos
			int primerIndice = (int) Math.round(Math.random() *(NUM_PERS-1));
			int segundoIndice = (int) Math.round(Math.random() * (NUM_PERS-1));
			
			Humano auxHum = humanos[primerIndice];
			humanos[primerIndice] = humanos[segundoIndice];
			humanos[segundoIndice] = auxHum;
		}
	}

	// 	Getters and Setters
	public Malvado[] getMalvados() {
		return malvados;
	}

	public void setMalvados(Malvado[] malvados) {
		this.malvados = malvados;
	}

	public Humano[] getHumanos() {
		return humanos;
	}

	public void setHumanos(Humano[] humanos) {
		this.humanos = humanos;
	}
	
	
	

	
	
	
}
