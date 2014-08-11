package logica;

import java.awt.Graphics;

import vista.VistaLadrillos;

/*Bloque Ladrillos tiene 5 de vida*/
public class BloqueLadrillos extends Obstaculo {

	public static int DurabildadMax = 5;
	
	public BloqueLadrillos(int x, int y){
		super(x,y);
		durabilidad=BloqueLadrillos.DurabildadMax;
	}
	
	
	public BloqueLadrillos(int x, int y, int d) {
		super(x,y); //llamada al constructor de obstauclo
		durabilidad = d;
	}


	/**DOUBLE DISPACHMENTSSSSSS**/
	/*Con fuego se le resta el dano del fuego*/
	public void interactuar_con_fuego(Fuego f) {
		
		if (get_coordenadas().equals(f.get_coordenadas())){
			System.out.println("Ladrillos("+get_coordenadas().toString()+")dur:"+durabilidad+" -> Fuego("+f.get_coordenadas().toString()+") des: "+f.getDestruccionBloque());
			int destruccion = f.getDestruccionBloque();
			if (destruccion == -1) destruccion = durabilidad;
			durabilidad -= destruccion;
		}
	}
	
	public void pintar(Graphics G){
		VistaLadrillos.pintar(this, G);
	}

	
	
}
