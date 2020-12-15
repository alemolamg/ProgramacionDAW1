package simulacionExamenes.barajaDeCartas;

public class Carta {
	//	Atributos
	private int numero;
	private String palo;
	private int id;
	
	
	/**
	 * 
	 */
	public Carta() { }

	
	/**
	 * @param numero
	 * @param palo
	 * @param id
	 */
	public Carta(int numero, String palo, int id) {
		super();
		this.numero = numero;
		this.palo = palo;
		this.id = id;
	}


	public String toString() {
		return "\nCarta [numero=" + numero + ", palo=" + palo + ", id=" + id + "]";
	}


	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}


	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}


	/**
	 * @return the palo
	 */
	public String getPalo() {
		return palo;
	}


	/**
	 * @param palo the palo to set
	 */
	public void setPalo(String palo) {
		this.palo = palo;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	

}
