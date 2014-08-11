package logica;

import java.awt.Graphics;

import vista.VistaMolotovEnemiga;

public class MolotovEnemiga extends Armamento {
	
	public static int destruccionEnemiga = 0;
	public static int destruccionJugador = 5;

	public MolotovEnemiga(int x, int y) {
		coordenadas = new Coordenadas(x,y);
		tiempo = 0;
	}

	@Override
	public Explosion explotar(ObstaculosVivos ObsVivos) {
		/* Explotar de la bomba molotov enemiga */
		int x = coordenadas.getx();
		int y = coordenadas.gety();
		
		Explosion exp = new Explosion(Explosion.MolotovEnemiga,destruccionJugador,destruccionEnemiga,x,y,ObsVivos);
		return exp;		
	}
	
	public void pintar(Graphics G){
		VistaMolotovEnemiga.pintar(this,G);
	}
}
