package logica;

import java.awt.Graphics;

import vista.VistaCemento;


/*Bloque de Cemento, tiene 10 de vida*/
public class BloqueCemento extends Obstaculo {

	
	public static int DurabildadMax = 10;
	
	public BloqueCemento(int x, int y){
		super(x,y);
		durabilidad = BloqueCemento.DurabildadMax;
	}
	
	public BloqueCemento(int x, int y, int d) {
		super(x,y); //llamada al constructor de obstauclo
		durabilidad = d;
	}

	/**DOUBLE DISPACHMENTS **/
	
	/*Con un fuego normal, se le resta el dano del fuego*/
	public void interactuar_con_fuego(Fuego f) {
		
		if (get_coordenadas().equals(f.get_coordenadas())){ //si estan en el mismo lugar
			int destruccion = f.getDestruccionBloque();
			if (destruccion == -1) destruccion = durabilidad;
			durabilidad = durabilidad - destruccion;
		}	
	}
	
	public void pintar(Graphics G){
		VistaCemento.pintar(this, G);
	}
}