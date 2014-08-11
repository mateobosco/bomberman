package logica;

import java.awt.Graphics;

import vista.VistaToleTole;

public class ToleTole extends Armamento {
	
	public static int destruccionEnemiga = 10;
	public static int destruccionJugador = -1;

	public ToleTole(int x, int y) {
		coordenadas = new Coordenadas(x,y);
		tiempo = 12;
	}

	@Override
	public Explosion explotar(ObstaculosVivos ObsVivos) {
		/*Explotar de la bomba tole tole*/
		int x = coordenadas.getx();
		int y = coordenadas.gety();
		
		Explosion exp = new Explosion(Explosion.ToleTole,destruccionJugador,destruccionEnemiga,x,y,ObsVivos);
		return exp;	
	}
	
	public void pintar(Graphics G){
		VistaToleTole.pintar(this,G);
	}
}
