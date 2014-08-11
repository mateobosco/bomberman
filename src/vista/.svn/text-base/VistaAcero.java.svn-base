package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import logica.BloqueAcero;

public class VistaAcero {

	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	static Image imagenAcero = Toolkit.getDefaultToolkit().getImage("drawable/acero.png");
	static Graphics G;
	
	public static void pintar(BloqueAcero bloque, Graphics G) {
		int xobs = bloque.get_coordenadas().getx();
		int yobs = bloque.get_coordenadas().gety();

		G.drawImage(imagenAcero,xobs*celdatamx+offsetx, yobs*celdatamy+offsety, null);
		}

	public static void pintar(BloqueAcero bloqueAcero) {
		pintar(bloqueAcero, G);		
	}
}
