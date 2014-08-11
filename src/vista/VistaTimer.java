package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import logica.Timer;

public class VistaTimer {
	
	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	static int xArt, yArt;
	
	static Image imagenTimer = Toolkit.getDefaultToolkit().getImage("drawable/timer.png");


	public static void pintar(Timer timer, Graphics g) {
		xArt = timer.get_coordenadas().getx();
		yArt = timer.get_coordenadas().gety();	
		
		g.drawImage(imagenTimer ,xArt*celdatamx+offsetx, yArt*celdatamy+offsety, null);
	}

}
