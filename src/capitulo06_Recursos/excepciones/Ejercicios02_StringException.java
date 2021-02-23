package capitulo06_Recursos.excepciones;

import alemol.UtilsAlemol;

public class Ejercicios02_StringException {

	public static void main(String[] args) {
		boolean activo = true;
		String texto = "*";
		do {
			try {
				System.out.println("\nEscribe un texto con la palabra bombilla");
				texto = UtilsAlemol.leerStringScanner();
				if (verificarTexto(texto))
					activo = false;
				
			} catch (Exception e) {
				System.out.println("El texto no es correcto porque:");
				System.out.println(e.getMessage());
			}
		} while (activo);
		System.out.println("Fin del programa, frase correcta.");
	}
	
	
	/*
	 * Método que verifica que la contraseña está creada correctamente.
	 * @return True si correcta, False si no.
	 */
	public static boolean verificarTexto(String texto) throws LongitudMinimaException, SoloEspaciosException, PalabraNoEncontradaException, PalabrotaException {
		texto = texto.replaceAll("\r","");
		boolean tieneMayus = false, tieneMin = false, tieneDig = false, tieneNoAN = false, soloEspacios = true;
		char[] pass = texto.toCharArray();
		if (texto.split(" ").length < 3)
			throw new LongitudMinimaException("La longitud del array es menor de 3");
		else
			if(esEspacio(pass))
				throw new SoloEspaciosException("Solo hay espacios en blanco");
			else 
				if(estaBombilla(texto) == false)
					throw new PalabraNoEncontradaException("No está la palabra bombilla en el texto");
		
		if (palabrotaEnTexto(texto))
			throw new PalabrotaException("Existe una palabrota en el texto, cuida tu lenguaje");
		
		return true;
	}


	private static boolean palabrotaEnTexto(String texto) {
		String[] palabras = texto.split(" ");
		String malsonantes[] = {"tonto","tonta","idiota","gilipollas", "mamón","inutil"};
		for(String str : palabras)
			for(String malso : malsonantes)
				if(str.equals(malso) )
					return true;
		return false;
	}


	private static boolean esEspacio(char[] chares) {
		for (char c : chares)
			if (Character.isLetterOrDigit(c))
				return false;
		return true;
	}
	
	/**
	 * Verifica si la palabra bombilla está en el texto
	 * @param texto
	 * @return true si está, false si no.
	 */
	private static boolean estaBombilla(String texto) {
		String[] palabras = texto.split(" ");
		for(String str : palabras)
			if(str.equals("bombilla") || str.equals("bombillas") )
				return true;
		return false;
	}
	
	
	
	

}
