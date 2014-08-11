package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import logica.ToleTole;

public class VistaToleTole {
	
	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	private static int tiempoCambiarImagenArmamento = 0;
	static int xToleTole, yToleTole;
	
	static Image toletole1 = Toolkit.getDefaultToolkit().getImage("drawable/tole1.png");
	static Image toletole2 = Toolkit.getDefaultToolkit().getImage("drawable/tole2.png");
	static Image imagenfinal = toletole1;

	public static void pintar(ToleTole toleTole, Graphics g) {
		
		if(++tiempoCambiarImagenArmamento>1){
			tiempoCambiarImagenArmamento=0;
		}
		
		xToleTole = toleTole.get_coordenadas().getx();
		yToleTole = toleTole.get_coordenadas().gety();
		
		if (tiempoCambiarImagenArmamento == 1) imagenfinal = toletole2;
		g.drawImage(imagenfinal,xToleTole*celdatamx+offsetx, yToleTole*celdatamy+offsety, null);				
	}
}