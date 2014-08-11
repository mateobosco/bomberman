package logica;

import java.awt.Graphics;
import vista.VistaBuffToleTole;

public class BuffToleTole extends Articulo {
	
	
	public BuffToleTole(int x,int y){
		coordenadas = new Coordenadas(x,y);
	}
	
	public void interactuar_con(Jugador jug){
		jug.interactuar_con_buffToleTole(this);
	}
	
	public void pintar(Graphics G){
		VistaBuffToleTole.pintar(this, G);
	}
}