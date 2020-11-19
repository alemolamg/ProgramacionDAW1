package capitulo05.juegoPistolero;

import java.lang.reflect.Array;
import java.util.Scanner;

import capitulo05.juegoPistolero.*;

public class JuegoPistolero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void jugada () {
		
		
	}
	
	
	/**
	 * Método que lee el array del jugador 
	 * @return array(int[]) del jugador
	 */
	private static int[] lecturaDisparos() {
		int array[] = new int [3];
		for(int i = 0; i < array.length;i++ )
			array[i] = new Scanner(System.in).nextInt();
		return array;
	}
	
	
	

}
