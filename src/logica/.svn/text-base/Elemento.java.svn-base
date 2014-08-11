package logica;


/*	Clase Abstracta de todos los elementos. 
 * 	Se definen los double dispatchments y las coordendas. */

public abstract class Elemento {
	
	boolean puedeSeguirCaminando = false, puedeVolar = false;
	int pasoEnY, pasoEnX;
		
	public Coordenadas coordenadas; //coordenadas de cada elemento
		
	public Coordenadas get_coordenadas(){ 
		return coordenadas; 
	}

	public void noPuedeSeguirCaminando() {
		puedeSeguirCaminando = false;
	}	
	
	/** DOUBLE DISPACHMENTS **/
	public abstract void interactuar_con_fuego(Fuego f);

	public void puedeSeguirCaminando() {
		puedeSeguirCaminando = true;	
	}
	
	public Coordenadas sumarPasos(){
		
		int nuevaX = get_coordenadas().getx() + pasoEnX;
		int nuevaY = get_coordenadas().gety() + pasoEnY;
		
		Coordenadas nuevasCoord = new Coordenadas(nuevaX,nuevaY);
		
		return nuevasCoord;
	}

	public boolean puedeVolar() {
		return puedeVolar;
	}

}
