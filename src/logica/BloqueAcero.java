package logica;

import java.awt.Graphics;

import vista.VistaAcero;

/*Bloque Inromplible solo por bomba tole-tole*/
public class BloqueAcero extends Obstaculo {
	
	public static int DurabildadMax = 999; //inrompible
	
	public BloqueAcero(int x, int y){
		super(x,y); //llamada al constructor de obstauclo
		durabilidad = BloqueAcero.DurabildadMax;
	}
	
	public BloqueAcero(int x, int y, int d) {
		super(x,y); //llamada al constructor de obstauclo
		durabilidad = d;
	}

	/**DOUBLE DISPACHMENTS**/
	public void interactuar_con_fuego(Fuego f) {
		if (get_coordenadas().equals(f.get_coordenadas())){
			System.out.println("Interactua BloqueAcero con Fuego");
			//No deberia pasar nada, solo si es un fuego de Tole-Tole
			if (f.getDestruccionBloque() == -1){
				durabilidad = 0;
			}
		}
	}
	
	public void pintar(Graphics G){
		VistaAcero.pintar(this, G);
	}
	
}
