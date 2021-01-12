package capitulo04.ejerciciosSobreHerencia.articulosComestibles;

public class Pedecedero extends Producto {
	protected boolean esPedecedero = true;
	protected String fechaCad;
	
	
	public Pedecedero(String nombre, float precio, String fechaCaducidad) {
		super(nombre, precio);
		this.fechaCad = fechaCaducidad;
		esPedecedero = true;
	}


	@Override
	public String toString() {
		return "Pedecedero [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fechaCad =" + fechaCad
				+ "]";
	}


	public boolean isEsPedecedero() {
		return esPedecedero;
	}


	public void setEsPedecedero(boolean esPedecedero) {
		this.esPedecedero = esPedecedero;
	}


	public String getFechaCad() {
		return fechaCad;
	}


	public void setFechaCad(String fechaCad) {
		this.fechaCad = fechaCad;
	}

	
	
	

}
