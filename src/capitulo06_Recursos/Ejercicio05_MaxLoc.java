package capitulo06_Recursos;

public class Ejercicio05_MaxLoc {
	public static void main(String[] args) {
		double vectorY[] =new double[5], y1=0,y2=0,y3=0;
		double xFija = 0.01, x = xFija, vectorX [] = new double[vectorY.length];
		
		for (int i = 0 ; i < 5; x += xFija) {
			y1 = y2; y2 = y3;
			y3 = x * Math.sin(x);
			if(y2 > y1 && y2 > y3) {
				vectorY[i] = y2;
				vectorX[i] = x-xFija;
				System.out.println("El punto " + (i+1) + "º es "
						+ "x: " + vectorX[i] + " ,y: " + vectorY[i]);
				i++;
			}
//			System.out.println("y = " + y2);
		}
		
		System.out.println("FIN PROGRAMA");
		
	}
}
