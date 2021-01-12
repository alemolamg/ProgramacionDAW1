package capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class ColeccionAntiguedades {
	
	public static void main(String[] args) {
		Antiguedad arrayAnti[] = new Antiguedad [4];
		
		arrayAnti[0] = new Cuadro(1896, "España", 5.42f, "La Primera Comunión", "Picasso");
		arrayAnti[1] = new Joya(1780, "Alemania", 2, "Zafiro") ;
		arrayAnti[2] = new Estatua(320, "Roma", 0.26f, 2, 1.2f, 420);
		arrayAnti[3] = new Manuscrito(-450, "Grecia", 1.22f, "Platón");
		
		for (int i = 0; i < arrayAnti.length; i++) 
			System.out.println(arrayAnti[i].toString());		
	}

}
