package logica;

import java.awt.Graphics;

import vista.VistaTimer;

public class Timer extends Articulo {

	public Timer(int x, int y){
		coordenadas = new Coordenadas(x,y);
		
	}
	@Override
	public void interactuar_con(Jugador jug) {
		jug.interactuar_con_timer(this);
		
	}

	public void pintar(Graphics G){
		VistaTimer.pintar(this,G);
	}

}
