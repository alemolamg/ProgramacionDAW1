package hashMap;

public class Articulo {
	int codBarras;
	int numEstante;
	
	public Articulo(int codigo, int estante) {
		this.codBarras = codigo;
		this.numEstante = estante;
	}
	
	public int getCodBarras() {
		return codBarras;
	}
	
	public int getNumEstante() {
		return numEstante;
	}
	
	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}

	@Override
	public String toString() {
		return "Articulo [codigo de barras=" + codBarras + ", Estante=" + numEstante + "]";
	}

	
}
