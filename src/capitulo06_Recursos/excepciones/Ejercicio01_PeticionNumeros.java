package capitulo06_Recursos.excepciones;

import alemol.UtilsAlemol;

public class Ejercicio01_PeticionNumeros {
	
	public static void main(String[] args) {
		try {
			System.out.println("El número par es: " + pideNumeroPar());
		} catch (NumeroParException e) {
			System.out.println(e.getMessage());
		}
	}

	private static int pideNumeroPar() throws NumeroParException {
		int num = 0;
		
			System.out.println("Introduce un número par: ");
			num = UtilsAlemol.obtenerEnteroScanner();
			if(num % 2 != 0)
				throw new NumeroParException("El número no es par.");

		
		return num;
	}
	

	
	
}



