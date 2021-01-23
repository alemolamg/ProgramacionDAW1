package capitulo04.ejerciciosSobreHerencia.ventanaCanvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MiCanvas extends Canvas{
	
	@Override
	public void paint(Graphics g) {
		//	Rectángulo
		g.setColor(Color.red);
		g.fillRect(30, 250, 55, 288);
		//	Círculo
		g.setColor(Color.green);
		g.fillOval(200, 220, 88, 88);
		//	Triángulo
		g.setColor(Color.blue);
		g.fillPolygon(new int[] {450,530,640}, new int[] {445,300,500}, 3);
		
//		super.paint(g);
	}
}
