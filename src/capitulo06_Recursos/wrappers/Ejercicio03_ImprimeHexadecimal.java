package capitulo06_Recursos.wrappers;

public class Ejercicio03_ImprimeHexadecimal {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) 
			System.out.println("Num " + i + " = " + Integer.toHexString(i)+" x16");
		
	}

}