package Cap2_Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	static final int cantNumeros = 10;
	
	public static void main(String[] args) {
		int numBajos = 0, numMedios = 0, numGrandes = 0;
		int [] vectorInt = new int [cantNumeros];
		
		System.out.println("Vamos a leer los números, "
				+ "máximo 10 (número negativo para terminar) ");
//		lectorVectoresInt(cantNumeros, vectorInt);
			
		for (int i = 0; i < cantNumeros; i++) {	
			vectorInt[i] = lectorInt();
			if (vectorInt[i] > 0)
				if (vectorInt [i] > 25)
					if (vectorInt[i] > 250)
						numGrandes++;
					else
						numMedios++;
				else 
					numBajos++;
				
			else
				break;
		}
		
//		System.out.println("Suma números negativos: " + numNegativos);
		System.out.println("Suma números pequeños: " + numBajos);
		System.out.println("Suma números medios: " + numMedios);
		System.out.println("Suma números grandes: "+ numGrandes);
		
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
	
	
	/**
	 * Lee por pantalla los números
	 * 
	 * @return (int) número leido
	 */
	public static int  lectorInt () {		
		String lector = JOptionPane.showInputDialog("Introduzca el número entero: ");
		return Integer.parseInt(lector);			
	}

}
