package Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		System.out.println("Calcular costo mensual de la hipoteca");
		
		String str;
		float euribor = 0.1f, diferencial = 0.9f , capital = 150000;
		int numPlazos = 240;
		double interesMensual, cuotaMensual;
		
		str = JOptionPane.showInputDialog("Introduce el euribor (float): ");
		euribor = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el diferencial (float): ");
		diferencial = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el capital (float): ");
		capital = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el número de plazos (float): ");
		numPlazos = Integer.parseInt(str);
		
		double interesAnual = euribor + diferencial;
		
		interesMensual = interesAnual / 12 / 100 ;
		
//		cuotaMensual = capital * ( ( interesMensual * Math.pow(1+interesMensual, numPlazos) ) /
//				Math.pow(1+interesMensual, numPlazos) -1 );
		
		double elevado = Math.pow(1 + interesMensual, numPlazos);
		
		double numerador = interesMensual * elevado;
		double denominador = elevado -1;
		
		cuotaMensual = capital * (numerador / denominador);
		
		
		System.out.println("La cuota mensual a pagar es: " + cuotaMensual);
	}

}
