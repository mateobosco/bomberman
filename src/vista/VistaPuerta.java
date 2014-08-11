package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import logica.Puerta;

public class VistaPuerta{

	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	
	Image imagenPuerta = Toolkit.getDefaultToolkit().getImage("drawable/puerta.png");	
	Puerta puerta; 
	int xPuerta, yPuerta;
	
	public VistaPuerta(Puerta p) {
		xPuerta = p.getCoordenadas().getx();
		yPuerta = p.getCoordenadas().gety();
	}
	
	public void pintar(Graphics G){
		G.drawImage(imagenPuerta ,xPuerta*celdatamx+offsetx, yPuerta*celdatamy+offsety, null);		
	}
}
