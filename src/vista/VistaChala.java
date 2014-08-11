package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import logica.Chala;

public class VistaChala {
	
	static Image imagenChala = Toolkit.getDefaultToolkit().getImage("drawable/chala.png");
	
	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	static int xArt, yArt;
	
	public static void pintar(Chala chala, Graphics g) {
		xArt = chala.get_coordenadas().getx();
		yArt = chala.get_coordenadas().gety();	
		
		g.drawImage(imagenChala ,xArt*celdatamx+offsetx, yArt*celdatamy+offsety, null);		
	}
}
