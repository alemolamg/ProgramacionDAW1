package Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int numNums = 3, numMayor = Integer.MIN_VALUE, numMenor = Integer.MAX_VALUE;
		int [] numVectores = new int [numNums];
		String lector;
		
		System.out.println("Calcula el número mayor y menor de una serie de números");
		
		for (int j = 0; j < numNums; j++) {
			lector = JOptionPane.showInputDialog("Introduzca un número entero: ");
			numVectores[j] = Integer.parseInt(lector);			
		}
		
		for (int i = 0; i < numNums; i++) {
			if(numVectores[i] > numMayor)
				numMayor=numVectores[i];
			
			if(numVectores[i] < numMenor)
				numMenor = numVectores[i];	
		}
		
		System.out.println("El número mayor es: " + numMayor + ", y el menor es: " + numMenor);
		
	}

}
