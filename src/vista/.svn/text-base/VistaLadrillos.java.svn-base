package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import logica.BloqueLadrillos;

public class VistaLadrillos {
	
	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	static Image imagenLadrillos = Toolkit.getDefaultToolkit().getImage("drawable/ladrillos.png");
	static Graphics G;
	
	public static void pintar(BloqueLadrillos bloque, Graphics G) {
		int xobs = bloque.get_coordenadas().getx();
		int yobs = bloque.get_coordenadas().gety();

		G.drawImage(imagenLadrillos,xobs*celdatamx+offsetx, yobs*celdatamy+offsety, null);
	}
}
