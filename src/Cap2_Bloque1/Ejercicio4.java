package Cap2_Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio4 {
	
	public static void main(String[] args) {		
		
		int numNums = 5, numMayor = Integer.MIN_VALUE, numMenor = Integer.MAX_VALUE;
		int [] numVectores = new int [numNums];
		String lector;
		
		System.out.println("Calcula el número mayor y menor de una serie de números");
				
		lectorVectoresInt(numNums, numVectores);
		
		
		for (int i = 0; i < numNums; i++) {
//			if(numVectores[i] > numMayor)
//				numMayor=numVectores[i];
			
			if(numVectores[i] < numMenor)
				numMenor = numVectores[i];	
		}
		
		System.out.println("El número menor es: " + numMenor);
			
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
