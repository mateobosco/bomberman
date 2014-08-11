package vista;

import java.awt.Graphics;
import java.util.Iterator;

import logica.Armamento;
import logica.ArmamentosVivos;
import logica.Juego;

public class VistaBombas {
	
	ArmamentosVivos armamentosVivos;
	Armamento armamentotemp;
	Juego juego;
	
	public VistaBombas(Juego j){
		juego = j;
	}
	
	public void pintar(Graphics G){
		
		armamentosVivos = juego.getArmamentosVivos();
		Iterator <Armamento> it = armamentosVivos.iterator();
		
		while(it.hasNext()){
			armamentotemp = it.next();
			armamentotemp.pintar(G);
		}
	}

}
