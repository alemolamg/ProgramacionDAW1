package capitulo05.bloque05_metodos_y_arrays;

import java.util.Scanner;

import javax.security.auth.callback.TextOutputCallback;

public class MetodosJavaAlemol {

	public static void main(String[] args) {
		
//		1º.- Método que reciba como parámetros de entrada tres valores enteros y uno flotante. 
//		El método se llamará "media" y debe devolver la media aritmética de los cuatro valores. 
//		El valor devuelto debe ser flotante. El método "main" debe llamar a este otro método, 
//		con valores inventados por ti, e imprimir el valor de la media en la consola de salida.
//		
		System.out.println("\n--------- Ejercicio 01 ---------");
		float calcMedia = media (3, 4, 5, 6.7f);
		System.out.println("La media es: " + calcMedia);

		
//		2º.- Método llamado "obtenerNumeroDeUsuarioEntreMinimoYMaximo" que reciba dos valores enteros: 
//		un valor mínimo y un valor máximo. El método debe pedir un numero al usuario. 
//		El método examinará el número introducido por el usuario y, si dicho número no está entre 
//		el valor mínimo y el máximo que se ha indicado, seguirá pidiendo números al usuario hasta que se obtenga uno válido. 
//		Finalmente se debe devolver dicho valor del usuario al método main, que lo imprimirá en la consola.
		
		System.out.println("\n--------- Ejercicio 02 ---------");
		int valorEntreNumeros = obtenerNumeroDeUsuarioEntreMinimoYMaximo(18, 3);
		System.out.println("El número es: " + valorEntreNumeros);
		
		
//		3º.- Método llamado "maximo" que devuelva el valor máximo de dos números enteros recibidos como argumentos 
//		de entrada. El método main pedirá dos números al usuario y los enviará a este nuevo método. 
//		Finalmente imprimirá en consola el valor devuelto por el método.
		
		System.out.println("\n--------- Ejercicio 03 ---------");
		int elMaximo = maximo(8, 71);
		System.out.println("El número mayor es: " + elMaximo);
		
		
//		4º.- Método llamado "numeroImparEntreLimites" que devuelva un número entero aleatorio, impar y comprendido entre
//		dos límites recibidos como parámetros de entrada. "main" debe llamar a este método e imprimir el valor devuelto.
		
		System.out.println("\n--------- Ejercicio 04 ---------");
		int numAleatorioConLimites = numeroImparEntreLimites(63, 93);
		System.out.println("El número " + numAleatorioConLimites + " está en los límites");
		
		
//		5º.- Realiza un método que reciba un valor entero, del 1 al 10, como argumento de entrada y devuelva un String, 
//		con  dicho número escrito en palabras. Llama a este método "getStringFromEntero".
		
		System.out.println("\n--------- Ejercicio 05 ---------");
		String numTexto = getStringFromEntero(8);
		System.out.println(numTexto);
		
		
//		6º.- Método, llamado "imprimeMinimoAMaximo", que reciba tres valores enteros como argumentos de entrada. 
//		Debe imprimir dichos valores en orden de menor a mayor.
		
		System.out.println("\n--------- Ejercicio 06 ---------");
		imprimeMinimoAMaximo(8,15,3);
		System.out.println(" ");
		
		
//		7º.- La serie de Fibonacci es una serie numérica que comienza en los números 1, 1 y continua de forma infinita, 
//		calculando cada mienbro de la serie como la suma de los dos anteriores. De esta manera, la serie de Fibonacci 
//		comienza 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.......... Debes realizar un método llamado "fibonacci". Recibirá un argumento 
//		de entrada, de tipo entero. El método debe devolver un array con la serie de Fibonacci. El parámetro de entrada del método 
//		determinará la longitud del array a devolver. El método main recibirá el array y lo imprimirá en la consola.
		
		System.out.println("\n--------- Ejercicio 07 ---------");
		int arrayFibonacci[] = fibonacci(8);
		imprimeArray(arrayFibonacci);
		
//		8º.- Método que imprima en pantalla un array, recibirá un array como parámetro de entrada y lo mostrará en consola. 
//		Main debe enviar el array al método, llamado "imprimeArray".
		
		System.out.println("\n--------- Ejercicio 08 ---------");
		imprimeArray(fibonacci(10));
		
		
//		9º.- Método que "recorte" un array. El método recibirá un array, un "primerIndice" y un "ultimoIndice" y debe devolver 
//		un array, formado con los elementos del array recibido, cuyos índices estén dentro del intervalo cerrado formado 
//		por los dos índices recibidos

		System.out.println("\n--------- Ejercicio 09 ---------");
		int array[] = recorte(fibonacci(10),2,7);
		imprimeArray(array);		
		
		
//		10º.- Método que muestre en pantalla los números del 1 al 100. El único requisito para esto es que debe hacerse utilizando
//		la recursividad.
		
		System.out.println("\n--------- Ejercicio 10 ---------");
		muestraNumerosRecursividad(1);
		
	}
	
	/**
	 * Función que calcula la média de tres enteros y un float
	 * @param num1	(int)
	 * @param num2	(int)
	 * @param num3	(int)	
	 * @param num4	(float)
	 * @return	resultado (float) media de los cuatro números
	 */
	public static float media(int num1, int num2, int num3, float num4) {
		float resultado = (num1 + num2 + num3 +num4) / 4;
		return resultado;
	}
	
	/**
	 * Dados dos límites, lee un valor y lo devuelve si está en el rango.
	 * @param max
	 * @param min
	 * @return valorUsuario (int) Lo devuelve si está en el rango.
	 */
	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo(int max, int min) {
		int valorUsuario;
		do {
			System.out.println("El límite inferior es " + min + " y el superior es " + max);
			valorUsuario = obtenerEnteroScanner();			
		}while ( min > valorUsuario || valorUsuario > max);
		return valorUsuario;
	}

	/**
	 * Recibe dos números y devuleve el mayor de los dos
	 * @param num1 	(int)
	 * @param num2	(int)
	 * @return	el número mayor
	 */
	public static int maximo(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
	
	
	/**
	 * Crea una sucesión de Fibonacci de 'num' números de longitud
	 * @param num
	 * @return
	 */
	public static int [] fibonacci (int num) {
		int fibonacci[] = new int [num];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		
		for(int i = 2; i < fibonacci.length; i++)
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		return fibonacci;
	}
	
	
	/**
	 * Recibe un array y devuelve un array acortado por los 
	 * @param array
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int [] recorte (int array[], int num1, int num2) {
		int iterator = 0, mayor = maximo(num1, num2), menor = minimo(num1, num2);
		int nuevoArray [] = new int [mayor - menor];
		
		for (int i = menor; i < mayor; i++, iterator++) {
			nuevoArray[iterator] = array[i];
		}
		return nuevoArray;
	}
	
	
	/**
	 * Muestra por pantalla el orden de las tres variables de menor a mayor.
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void imprimeMinimoAMaximo(int a, int b, int c) {
		
		if(a < b) {				// Comprobamos si a es menor que b
			if(a < c)			// ahora si a es el menor de todos	
				if (c < b)		// comprobar el orden de los otros dos números
					System.out.print(a +", " + c +", " + b);
				else
					System.out.print(a +", " + b +", " + c);
			else
				System.out.print(c +", " + a +", " + b );
		} else
			if(b < c)
				if ( c < a)
					System.out.print(b + ", " + c + ", " + a);
				else
					System.out.print(b + ", " + a + ", " + c );
			else
				System.out.print(c +", " + b +", " + a);
	}
	
	
	/**
	 * Recibe dos números y devuleve el menor de los dos.
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int minimo(int num1, int num2) {
		if (num1 < num2)
			return num1;
		else
			return num2;
	}
	
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	public static String getStringFromEntero(int num) {
		if (num < 0 || num > 10) {
			System.out.println("El número no está entre el 0 y el 10");
			return "Error";
		}else {
			String texto = "error";
			switch(num){
				case 0:
					texto = "Zero";
					break;
				
				case 1:
					texto = "Uno";
					break;
				
				case 2:
					texto = "Dos";
					break;
					
				case 3:
					texto = "Tres";
					break;
					
				case 4:
					texto = "Cuatro";
					break;
					
				case 5:
					texto = "Cinco";
					break;
					
				case 6:
					texto = "Seis";
					break;
					
				case 7:
					texto = "Siete";
					break;
					
				case 8:
					texto = "Ocho";
					break;
					
				case 9:
					texto = "Nueve";
					break;
					
				case 10:
					texto = "Diez";
					break;
			}
			return texto;
		}
	}
	
	/**
	 * Muestra un array de enteros en la pantalla.
	 * @param imprimeme (int [])
	 */
	public static void imprimeArray(int imprimeme[]) {
		for(int i = 0; i < imprimeme.length; i++)
			System.out.print(imprimeme[i] + " ");
		System.out.println("");
	}
	
	
	public static int numeroImparEntreLimites (int num1, int num2) {
		return obtenerNumeroAzar(minimo(num1,num2), maximo(num1, num2));
	}
	
	/**
	 * Usa el método Scanner para obtener el entero
	 * @return int
	 */
	public static int obtenerEnteroScanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	
	/**
	 * 
	 * @param min Límite inferior de generación del número al azar
	 * @param max Límite superior de generación del número al azar
	 * @return Número generado al azar entre dos límites.
	 */
	public static int obtenerNumeroAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;
	}
	
	
	public static void muestraNumerosRecursividad (int i) {
		if (i <= 100) {
			System.out.print(i + " ");
			muestraNumerosRecursividad(++i);
		} else
			System.out.println("\nVector recorrido");	
	}
	
}
