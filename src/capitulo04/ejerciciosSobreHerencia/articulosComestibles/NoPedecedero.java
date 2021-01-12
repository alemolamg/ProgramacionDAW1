package capitulo04.ejerciciosSobreHerencia.articulosComestibles;

public class NoPedecedero extends Producto{

	public NoPedecedero(String nombre, float precio) {
		super(nombre, precio);
	}

	@Override
	public String toString() {
		return "NoPedecedero [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	
}
