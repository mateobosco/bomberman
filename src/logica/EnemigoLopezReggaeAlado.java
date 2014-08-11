package logica;

import java.awt.Graphics;

import vista.VistaEnemigoLopezReggaeAlado;

public class EnemigoLopezReggaeAlado extends Enemigo{

	public EnemigoLopezReggaeAlado(int x, int y) {
		super(x, y);
		puedeVolar = true;
	}
	
	/* Obtiene el destino de manera random todo 
	 * el tiempo, y se redefine dado que obtiene
	 * siempre y no solo cuando choca con algo.*/
	public Coordenadas obtenerDestino() {		
				
		pasoEnX = (int)(Math.random()*3)-1;
		pasoEnY = (int)(Math.random()*3)-1;
		return sumarPasos();		
	}
	
	public MolotovEnemiga ponerArmamento() {
		int x = coordenadas.getx(),y = coordenadas.gety();
		return new MolotovEnemigaLopezReggaeAlado(x,y);
	}
	
	public void pintar(Graphics G){
		VistaEnemigoLopezReggaeAlado.pintar(this,G);
	}



}
