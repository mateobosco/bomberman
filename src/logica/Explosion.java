package logica;

import java.util.*;

public class Explosion extends Elemento{
	/* Explosion es una clase que va a contener todos los
	 * fuegos. */
	
	public static int Molotov = 2,ToleTole = 4, MolotovEnemiga = 2;
	private static int tipoDeBomba;
	private Vector<Fuego> vector_fuegos;
	
	/*Constructor de una explosion depende el tipo*/
	public Explosion(int tipo,int destruccionJugador, int destruccionEnemiga, int x, int y, ObstaculosVivos obsVivos){
		
		vector_fuegos = new Vector<Fuego>();		
		tipoDeBomba = tipo;
		
		crear_bomba(x,y,destruccionJugador,destruccionEnemiga,obsVivos);		
	}
	
	public void crear_bomba(int x, int y, int destruccionJugador, int destruccionEnemiga, ObstaculosVivos obsVivos) {

		vector_fuegos.add(new Fuego(destruccionJugador,destruccionEnemiga,x,y));

		for(int i = 1; i <= tipoDeBomba; i++){
			vector_fuegos.add(new Fuego(destruccionJugador,destruccionEnemiga,x,y+i));
			if(obsVivos != null)if(obsVivos.existeBloqueEn(new Coordenadas(x,y+i)))break;
		}
		for(int i = 1; i <= tipoDeBomba; i++){
			vector_fuegos.add(new Fuego(destruccionJugador,destruccionEnemiga,x+i,y));
			if(obsVivos != null)if(obsVivos.existeBloqueEn(new Coordenadas(x+i,y)))break;
		}
		for(int i = 1; i <= tipoDeBomba; i++){
			vector_fuegos.add(new Fuego(destruccionJugador,destruccionEnemiga,x,y-i));
			if(obsVivos != null)if(obsVivos.existeBloqueEn(new Coordenadas(x,y-i)))break;
		}
		for(int i = 1; i <= tipoDeBomba; i++){
			vector_fuegos.add(new Fuego(destruccionJugador,destruccionEnemiga,x-i,y));
			if(obsVivos != null)if(obsVivos.existeBloqueEn(new Coordenadas(x-i,y)))break;
		}		
	}
	
	/** DOUBLE DISPACHMENTS **/
	/*Metodo  utilizado para interactuar con un elemento desconocido e*/
	public void interactuar_con(Elemento e){
		for(int i = 0 ; i < vector_fuegos.size();i++){
			e.interactuar_con_fuego(vector_fuegos.elementAt(i));
		}
	}
	
	public void interactuar_con(ObstaculosVivos obstaculos){
		obstaculos.interactuar_con_explosion(this);			
	}	
	public void interactuar_con(EnemigosVivos enemigosVivos) {
		enemigosVivos.interactuar_con_explosion(this);
	}
	
	//Si una explosión toca con fuego no pasa nada..
	public void interactuar_con_fuego(Fuego f) {}
	
	/** FIN DOUBLE DISPACHMENTS **/

	public void agregarAFuegosVivos(FuegosVivos fuegosvivos) {
		for(int i=0; i<vector_fuegos.size();i++){
			fuegosvivos.agregarFuego(vector_fuegos.get(i));			
		}		
	}
}
