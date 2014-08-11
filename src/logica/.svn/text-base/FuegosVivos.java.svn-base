package logica;

import java.util.Iterator;
import java.util.Vector;

public class FuegosVivos {
	private static final int TIEMPOAPARICION = 5;
	Vector<Fuego> vector_fuegos;
	private int t;
	
	
	public FuegosVivos(){
		
		vector_fuegos = new Vector<Fuego>();
		
	}
	
	
	public void agregarFuego(Fuego fuego){
		vector_fuegos.add(fuego);
	}


	public int getSize() {
		return vector_fuegos.size();
	}

	public void eliminarfuegos() {
		if(vector_fuegos.size()>0)t++;
		if (t>TIEMPOAPARICION){
			vector_fuegos = new Vector<Fuego>();
			t=0;
		}
	}

	public Iterator<Fuego> iterator() {
		return vector_fuegos.iterator();
	}
	
}
