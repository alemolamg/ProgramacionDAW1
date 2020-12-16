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
	 * 
	 */
	public void mezclarPersonajes() {
		for (int i = 0; i < NUM_PERS; i++) {	// Mezcla los malvados
			int primerIndice = (int) Math.round(Math.random() * (NUM_PERS -1));
			int segundoIndice = (int) Math.round(Math.random() * (NUM_PERS -1));
			int tercerIndice = (int) Math.round(Math.random() * (NUM_PERS -1));
			
			Malvado auxMal = malvados[primerIndice];
			malvados[primerIndice] = malvados[segundoIndice];
			malvados[segundoIndice] = auxMal;
			
			Humano auxHum = humanos[tercerIndice];
			humanos[tercerIndice] = humanos[segundoIndice];
			humanos[segundoIndice] = auxHum;
		}
	}
	
	
	
	public void turnoDisparos() {		//ToDo: terminar, esta incorrecto dado que no contempla si se acaban los personajes
		
		do {
			int orden = (int) Math.round(Math.random() * 1	);	// Elige al azar quien ataca
			switch (orden) {
			case 0:				// Comienza Humanos
				humanoDispara();	
				malvadoDispara();
				break;
			case 1:				// Comienzan Malvados
				malvadoDispara();
				humanoDispara();	
				break;
			default:			// comienzo en caso de fallo.
				humanoDispara();	
				malvadoDispara();
				break;
			}
			humanoDispara();	
			malvadoDispara();	
			
		}while ( (humanos[NUM_PERS-1].getVivo() ) && (malvados[NUM_PERS-1].getVivo()) );
		
		System.out.println("La batalla ha finalizado");
		finDeBatalla();	
	}
	
	
	public boolean finDeBatalla() {
		
		boolean humVivos = false;
		for (int i = 0; i < NUM_PERS; i++)
			if (humanos[i].getVivo()) {
				humVivos = true;
				break;
			}
		
		boolean malVivos = false;
		for (int i = 0; i < NUM_PERS; i++)
			if (humanos[i].getVivo()) {
				malVivos = true;
				break;
			}
		
		if(!humVivos || !malVivos) {		
			comprobarGanador();
			return true;
		}
		
		return false;
	}
	
	/**
	 * Humano dispara al siguiente malvado vivo.
	 */
	private void humanoDispara() {
		int posHumano = -1;
		for (int i = 0; i < this.NUM_PERS; i++)	// Elegimos humano
			if(humanos[i].getVivo()) {
				posHumano = i;
				break;
			}
		
		int posMalvado = 0; 
		for (int i = 0; i < this.NUM_PERS; i++)	// Elegimos malvado
			if(malvados[i].getVivo()) {
				posMalvado = -1;
				break;
			}
				
		
		// Se dispara
		if(posHumano > -1 && posMalvado > -1)
			humanos[posHumano].disparar(malvados[posMalvado]);	//Humano dispara
	}
	
	
	/**
	 * Malvado dispara al siguiente humano vivo;
	 */
	private void malvadoDispara() {
		int posMalvado = 0; 
		for (int i = 0; i < this.NUM_PERS; i++)	// Elegimos malvado
			if(malvados[i].getVivo()) {
				posMalvado = -1;
				break;
			}
		
		int posHumano = -1;
		for (int i = 0; i < this.NUM_PERS; i++)	// Elegimos humano
			if(humanos[i].getVivo()) {
				posHumano = i;
				break;
			}
		
		// Se dispara
		if(posHumano > -1 && posMalvado > -1)
			malvados[posMalvado].disparar(humanos[posHumano]);	//Malvado dispara
	}
	
	
	public String comprobarGanador() {
		boolean humVivos = false;
		for (int i = 0; i < NUM_PERS; i++)
			if (humanos[i].getVivo()) {
				humVivos = true;
				break;
			}
		
		boolean malVivos = false;
		for (int i = 0; i < NUM_PERS; i++)
			if (humanos[i].getVivo()) {
				malVivos = true;
				break;
			}
		
		if(malVivos && !humVivos)
			return "Han ganado los malvados."
					+ "\nLa tierra está en peligro";
		if(humVivos && !malVivos)
			return "Han ganado los humanos."
					+ "\nLa tierra está liberada";
		if (!malVivos && !humVivos) 
			return "¡Han muerto todos!, revisa el código Alemol";
		
		return "La batalla continúa...";
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
