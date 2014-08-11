package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Iterator;

import logica.Fuego;
import logica.FuegosVivos;
import logica.Juego;

public class VistaFuegos {

	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	
	Image fuego1 = Toolkit.getDefaultToolkit().getImage("drawable/fuego1.png");
	int xfuego, yfuego;
	Juego juego;
	FuegosVivos fuegosVivos;

	public VistaFuegos(Juego j){
		juego = j;		
	}
	
	public void pintar(Graphics G){
		fuegosVivos = juego.getFuegosVivos();
		Fuego fuegotemp;
		Iterator <Fuego> it = fuegosVivos.iterator();
		
		while(it.hasNext()){
			fuegotemp = it.next();
			xfuego = fuegotemp.get_coordenadas().getx();
			yfuego = fuegotemp.get_coordenadas().gety();
		
			G.drawImage(fuego1,xfuego*celdatamx+offsetx, yfuego*celdatamy+offsety, null);	
		}
	}	
}
