package capitulo05.bloque04;

import alemol.UtilsAlemol;

public class Ejercicio03 {

	public static void main(String[] args) {
		int tamanio = 20;
		double[] array = new double [tamanio];
		
		for(int i = 0; i < array.length; i++)
			array[i] = UtilsAlemol.obtenerNumeroAzar100() + (double) UtilsAlemol.obtenerNumeroAzar100() / 100;			
		
				
		
		
	}

}
