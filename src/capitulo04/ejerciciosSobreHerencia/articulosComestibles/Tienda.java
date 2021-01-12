package capitulo04.ejerciciosSobreHerencia.articulosComestibles;

public class Tienda {

	public static void main(String[] args) {
		Producto productos [] = new Producto[4];
		
		productos[0] = new Pedecedero("manzana", 0.5f, "25-01-2021");
		productos[1] = new Pedecedero("Lata Cerveza", 1.0f, "06-04-2021");
		productos[2] = new NoPedecedero("Lata de Sardinas", 1.5f);
		productos[3] = new NoPedecedero("Paquete de Arroz", 2);
		
		for (int cont = 0; cont < productos.length; cont++)
			System.out.println(productos[cont].toString());
		
		System.out.println("FIN DEL PROGRAMA.");
	}

}
