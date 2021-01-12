package capitulo04.ejerciciosSobreHerencia.articulosComestibles;

public class Producto {
	protected int codigo;
	protected String nombre;
	protected float precio;
	protected int NUM_PRODUCTOS = 0;
	
	
	/**
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, float precio) {
		this.NUM_PRODUCTOS++;
		this.codigo = NUM_PRODUCTOS;
		this.nombre = nombre;
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Productos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public int getNUM_PRODUCTOS() {
		return NUM_PRODUCTOS;
	}
	
	



	
	
	
	
}
