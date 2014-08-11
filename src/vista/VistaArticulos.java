package vista;

import java.awt.Graphics;
import java.util.Iterator;

import logica.Articulo;
import logica.ArticulosVivos;
import logica.Juego;

public class VistaArticulos {
	
	Articulo artTemp;
	ArticulosVivos artVivos;
	Juego juego;
	
	public VistaArticulos(Juego j){
		juego = j;
	}
	
	public void pintar(Graphics G){
		
		artVivos = juego.getArticulosVivos();
		Iterator <Articulo> it = artVivos.iterator();
		
		while(it.hasNext()){
			artTemp = it.next();
			artTemp.pintar(G);
		}
	}
}
