package capitulo06_Recursos.wrappers;

import alemol.UtilsAlemol;

public class Ejercicio02_GeneraContrasenia {

	public static void main(String[] args) {
		String contrasenia = "**";
		
		do {
			System.out.println("Escribe una contraseña: ");
			contrasenia = UtilsAlemol.leerStringScanner();

		} while (verificarContrasenia(contrasenia) == false);
		
		System.out.println("Tu contraseña es correcta y es: " + contrasenia);
	}
	
	/*
	 * Método que verifica que la contraseña está creada correctamente.
	 * @return True si correcta, False si no.
	 */
	public static boolean verificarContrasenia(String texto) {
		boolean tieneMayus = false, tieneMin = false, tieneDig = false, tieneNoAN = false;
		char[] pass = texto.toCharArray();
		for (int i = 0; i < pass.length -1; i++) {
			if (Character.isDigit(pass[i]))
				tieneDig = true;
			if (Character.isLowerCase(pass[i]))
				tieneMin = true;
			if (Character.isUpperCase(pass[i]))
				tieneMayus = true;
			if (Character.isLetterOrDigit(pass[i]) == false )
				tieneNoAN = true;
		}
		
		if(tieneDig)
			if(tieneMin)
				if(tieneMayus)
					if(tieneNoAN)
						return true;
		return false;
						
	}

}
