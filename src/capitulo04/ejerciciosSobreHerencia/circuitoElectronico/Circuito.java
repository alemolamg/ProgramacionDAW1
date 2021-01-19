package capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

import java.util.ArrayList;
import java.util.List;

class Circuito {

	public static void main(String[] args) {
		List<Componente> circuito = new ArrayList<Componente>();
//		Componente listaComps[] = new Componente[4];
		aniadirComponente(circuito, new Bateria("Bateria",2000, 2.5f));
		aniadirComponente(circuito, new Resistencia("Resistencia 01",20));
		aniadirComponente(circuito, new Bombilla("Bombilla 200",200));
		aniadirComponente(circuito, new Resistencia("Resistencia 02",15));
		
		System.out.println("Mostramos los componentes: \n");
		for (int i = 0; i < circuito.size(); i++) {
//			System.out.println("Componente " + (i+1));
			System.out.println(circuito.get(i).toString());
		}
		
		System.out.println("Fin del programa");
	}
	
	public static void aniadirComponente (List<Componente> circuito, Componente comp) {
		if (circuito.size() > 0) {	// Ajustamos los parámetros de los componentes.
		circuito.get(circuito.size()-1).setCompSiguiente(comp);
		comp.setCompAnterior(circuito.get(circuito.size()-1));
		circuito.get(0).setCompAnterior(comp);
		comp.setCompSiguiente(circuito.get(0));
		}
		
		circuito.add(comp);
	}

}
