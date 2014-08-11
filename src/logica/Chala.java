package logica;

import java.awt.Graphics;
import vista.VistaChala;

public class Chala extends Articulo {
	
	
	public Chala(int x,int y){
		coordenadas = new Coordenadas(x,y);
	}
	
	public void interactuar_con(Jugador jug){
		jug.interactuar_con_chala(this);
	}
	
	public void pintar(Graphics G){
		VistaChala.pintar(this, G);
	}
}
