package capitulo04.ejerciciosSobreHerencia.ventanaCanvas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

public class Menu {

	public static void main(String[] args) {
		JFrame ventana1 = new JFrame("Ventana con figuras pintadas"); // Creamos la ventana
		ventana1.setBounds(1, 1, 800, 600); // Elegimos las dimensiones
		ventana1.getContentPane().setLayout(new BorderLayout()); // Añadimos el BorderLayout

		MiCanvas canvas1 = new MiCanvas(); // Creamos nuestra clase para pintar objetos
		canvas1.setBackground(new Color(63, 63, 63)); // Elegimos un fondo, en mi caso gris

		ventana1.getContentPane().add(canvas1, BorderLayout.CENTER); // Añadimos nuestro canvas a la ventana

		ventana1.setVisible(true); // Hacemos visible la ventana para poder mostrarla.
	}

}
