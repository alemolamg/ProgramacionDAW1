package Cap2_Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int cantNumeros = 5, numNegativos = 0, numBajos = 0, numMedios = 0, numGrandes = 0;
		int [] vectorInt = new int [cantNumeros];
		
		System.out.println("Vamos a leer los números: ");
		lectorVectoresInt(cantNumeros, vectorInt);
			
		for (int i = 0; i < cantNumeros; i++) {	
			if (vectorInt[i] > 0)
				if (vectorInt [i] > 25)
					if (vectorInt[i] > 250)
						numGrandes += vectorInt[i];
					else
						numMedios += vectorInt[i];
				else 
					numBajos = numBajos + vectorInt[i];
				
			else
				numNegativos = numNegativos + vectorInt[i];
		
		}
		
		System.out.println("Números negativos: " + numNegativos);
		System.out.println("Números pequeños: " + numBajos);
		System.out.println("Números medios: " + numMedios);
		System.out.println("Números grandes: "+ numGrandes);
		
	}
	
	
	/**
	 * Lee por pantalla los números
	 * 
	 * @param cant  	cantidad de números que se leerán
	 * @param vectorInt	vector donde guardar los números
	 */
	public static void  lectorVectoresInt (int cant, int [] vectorInt) {
		String lector;
		
		for (int j = 0; j < cant; j++) {
			lector = JOptionPane.showInputDialog("Introduzca el " + (1+j) +"º número entero: ");
			vectorInt[j] = Integer.parseInt(lector);			
		}
		
	}

}
