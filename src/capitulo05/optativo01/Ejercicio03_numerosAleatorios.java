package capitulo05.optativo01;

public class Ejercicio03_numerosAleatorios {

	public static void main(String[] args) {
//		int cantidad = aleatorioHasta500();
		System.out.println("Se han generado " + aleatorioHasta500() + " números hasta llegar a una aproximación de 500");
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static int aleatorioHasta500() {
		int contador = 1, media = 0;
		
		do {
			media = (media * (contador-1) + numeroAleatorio() ) / contador;
			contador++;
			System.out.println(media + " ");
		}while(media < 400 || media > 600);
		
		return contador - 1;
	}
	
	
	/**
	 * obtienes un número al azar entre 0 y 1000
	 * @return	num (int) entre 0 y 1000
	 */
	public static int numeroAleatorio () {
		 return (int) Math.round(Math.random() * 1000);
	}


}
