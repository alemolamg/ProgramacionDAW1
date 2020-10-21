package capitulo05.bloque04;

import javax.print.attribute.standard.MediaPrintableArea;

import utilidades.UtilsAlemol;

public class Ejercicio02 {

	public static void main(String[] args) {
		int tamanio = 20;
		int[] arrayAprobado = new int [tamanio];
		int[] arraySuspenso = new int [tamanio];
		
		for (int i = 0; i< arrayAprobado.length; i++) {
			arrayAprobado[i] = UtilsAlemol.obtenerNumeroAzar10();
			arraySuspenso[i] = 0;
		}
		
		calMedia(arrayAprobado, arraySuspenso);
		
	}
	
	private static void calMedia (int vecPos[], int vecNeg[]) {
		int j = 0;
		double porApr = 0, porSus = 0;
		for (int i = 0; i < vecPos.length; i++) {
			if (vecPos[i] < 5) {
				vecNeg[j] = vecPos[i];
				vecPos[i] = 0;
				j++;
			}
			porApr += vecPos[i];
			porSus += vecNeg[i];
		}	
		
		porApr = (porApr * vecPos.length) / 100;
		porSus = (porSus * vecNeg.length) / 100;
		
		System.out.println("El porcentaje de las notas positivas es: " + (porApr) );
		System.out.println("El porcentaje de las notas negativas es: " + (porSus) );
		
		
	}
	

}
