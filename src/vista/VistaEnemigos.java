package vista;

import java.awt.Graphics;
import java.util.Iterator;

import logica.Enemigo;
import logica.EnemigosVivos;
import logica.Juego;

public class VistaEnemigos {
	
	EnemigosVivos enemVivos;
	Juego juego;
	
	public VistaEnemigos(Juego j){
		juego = j;
	}
	
	public void pintar(Graphics G){
		enemVivos = juego.getEnemigosVivos();
		Enemigo enemigoTemp;
		Iterator <Enemigo> it = enemVivos.Iterator();
		while(it.hasNext()){
			enemigoTemp = it.next();
			enemigoTemp.pintar(G);
		}
	}
}