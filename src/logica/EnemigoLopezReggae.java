package logica;

import java.awt.Graphics;
import vista.VistaEnemigoLopezReggae;

public class EnemigoLopezReggae extends Enemigo{
	
	public EnemigoLopezReggae(int x, int y) {
		super(x, y);
		vida = 10;
		velocidad = 2;
	}
	
	public MolotovEnemiga ponerArmamento() {
		
		int x = coordenadas.getx(),y = coordenadas.gety();
		int diferencia = x - y;
		
		if (diferencia > 0){
			x += 3;/* bomba derecha */
			y += 3;/* bomba abajo */
		}
		if (diferencia < 0){
			x -= 3; /* bomba izquierda */
		    y -= 3; /* bomba arriba  */
		}
		
		return new MolotovEnemigaLopezReggae(x,y);
	}
	
	public void pintar(Graphics G){
		VistaEnemigoLopezReggae.pintar(this,G);
	}
}
