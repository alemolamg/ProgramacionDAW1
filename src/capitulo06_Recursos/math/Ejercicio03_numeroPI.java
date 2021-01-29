package capitulo06_Recursos.math;

public class Ejercicio03_numeroPI {

	public static void main(String[] args) {
		double numPi = 0;
		double cambio = 1;	//cambiamos su signo continuamente.
		for (double i = 1; i <= 5000000; i+= 2,cambio = -cambio)	//5000000 para conseguir los decimales deseados. 
			numPi +=(double) (cambio * (4/i));
		
		System.out.println("Valor PI: " + numPi);
	}

}