package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import logica.BuffToleTole;

public class VistaBuffToleTole {
	
	static Image bufftoletole = Toolkit.getDefaultToolkit().getImage("drawable/bufftoletole.png");
	
	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	static int xArt, yArt;

	public static void pintar(BuffToleTole buffToleTole, Graphics g) {
		xArt = buffToleTole.get_coordenadas().getx();
		yArt = buffToleTole.get_coordenadas().gety();	
		
		g.drawImage(bufftoletole ,xArt*celdatamx+offsetx, yArt*celdatamy+offsety, null);
		
	}

}
