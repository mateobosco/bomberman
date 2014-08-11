package vista;

import java.awt.Graphics;
import java.util.Iterator;

import logica.Juego;
import logica.Obstaculo;
import logica.ObstaculosVivos;

public class VistaObstaculos {
	
	ObstaculosVivos obsvivos;
	Juego juego;
	
	public VistaObstaculos(Juego j){
		juego = j;
	}
	
	public void pintar(Graphics G){
		
		obsvivos = juego.getObsVivos();
		
		Obstaculo obstaculotemp;
		Iterator <Obstaculo> it = obsvivos.iterator();
		
		while(it.hasNext()){
			obstaculotemp = it.next();
			if (obstaculotemp.get_durabilidad()>0){
				obstaculotemp.pintar(G);
			}
		}
	}
}