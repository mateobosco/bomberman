package logica;


/* Clase que representa la coordenada de cada elemento*/
public class Coordenadas {
	
	int x, y;
	
	public Coordenadas(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getx(){return x;}
	public int gety(){return y;}
	public String toString(){return "x: "+x+" y: "+y;}

	
	/* Metodo que devuelve si la coordenada es igual q otra*/
	public boolean equals(Coordenadas coord){
		if (x == coord.x && y == coord.y)return true;
		
		return false;
	}
	

}
