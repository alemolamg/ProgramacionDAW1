package capitulo05.bloque04;

import javax.print.attribute.standard.MediaPrintableArea;

import alemol.UtilsAlemol;

public class Ejercicio02 {

	public static void main(String[] args) {
		int tamanio = 20;
		int[] arrayAprobado = new int [tamanio];
//		int[] arraySuspenso = new int [tamanio];
		
		for (int i = 0; i< arrayAprobado.length; i++) {
			arrayAprobado[i] = UtilsAlemol.obtenerNumeroAzar10();
		}
		calPorcentaje(arrayAprobado);
		
	}
	
	
	/**
	 * Calcula el porcentaje de aprobados y suspensos en clase.
	 * @param vecPos vector con notas, quedarán las positivas
	 * @param vecNeg vector a rellenar.
	 */
	private static void calPorcentaje (int vecPos[]) {
		double porApr = 0, porSus = 0;
		for (int i = 0; i < vecPos.length; i++) {
			if (vecPos[i] < 5) 
				porSus++;
			else 
				porApr++;
		}	
		
		porApr = (double) (porApr * 100) / vecPos.length;
		porSus = (double) (porSus * 100) / vecPos.length;
		
		System.out.println("El porcentaje de las notas positivas es: " + (porApr) + "%");
		System.out.println("El porcentaje de las notas negativas es: " + (porSus) + "%");		
	}

}
