package logica;

import java.awt.Graphics;

import vista.VistaMolotov;

public class Molotov extends Armamento{
	
	public static final int destruccionEnemiga = 5;
	public static final int destruccionJugador = 5;	
	
	public Molotov(int x, int y){
		coordenadas = new Coordenadas(x,y);
		tiempo = 0;
	}
	
	public Explosion  explotar(ObstaculosVivos ObsVivos){
		/* Explotar de la bomba molotov */
		int x = coordenadas.getx();
		int y = coordenadas.gety();
		
		Explosion exp = new Explosion(Explosion.Molotov,destruccionJugador,destruccionEnemiga,x,y,ObsVivos);
		return exp;			
	}
	
	public void pintar(Graphics G){
		VistaMolotov.pintar(this,G);
	}
}
