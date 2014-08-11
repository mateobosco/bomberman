package logica;

import java.awt.Graphics;

import org.dom4j.*;

public class Enemigo extends Elemento implements Movible{

	public static int TIEMPOARMAMENTOMAX = 25,IZQ=0, DER=1, ARR=2, ABJ=3;;

	int vida, velocidad ,ultimadir;

	private int timepoPonerArmamento = 0;
	private boolean debePonerArmamento = true;

	public Enemigo(int x, int y){
		coordenadas = new Coordenadas(x,y);
		vida = 5;
		velocidad = 1;
		pasoEnX = 1;
		pasoEnY = 1;
		ultimadir=ABJ;
	}
	
	/******DOUBLE DISPACHMENT*********/
	public void interactuar_con_fuego(Fuego f) {
		if (get_coordenadas().equals(f.get_coordenadas())){ //si estan en el mismo lugar
			vida = vida - f.destruccionEnemiga;
		}
	}
	
	public void interactuar_con_jugador(Jugador jug){
		jug.interactuar_con_enemigo(this);
	}
	
	public void pintar(Graphics g) {}
	/******FIN DOUBLE DISPACHMENT*********/


	/**************MOVIMIENTO**************/
	public Coordenadas obtenerDestino() {

		if(puedeSeguirCaminando) return sumarPasos();

		pasoEnX = (int)(Math.random()*3)-1;
		pasoEnY = (int)(Math.random()*3)-1;
		return sumarPasos();		
	}


	public void mover(Coordenadas nuevascoord) {
		int x= coordenadas.getx();
		int y= coordenadas.gety();
		int nuevax=nuevascoord.getx();
		int nuevay=nuevascoord.gety();

		if (nuevax>x)ultimadir=DER;
		else if(nuevax<x)ultimadir=IZQ;
		else if (nuevay>y)ultimadir=ARR;
		else if (nuevay<y)ultimadir=ABJ;

		coordenadas = nuevascoord;		
	}


	/**************FIN MOVIMIENTO**************/

	

	public void contarTiempo(){
		debePonerArmamento=false;
		if (estaVivo()){
			if(timepoPonerArmamento>0){
				if (timepoPonerArmamento>TIEMPOARMAMENTOMAX){
					timepoPonerArmamento=0;
					return;
				}
			}
			else debePonerArmamento=true;
			timepoPonerArmamento++;			
		}

	}

	public boolean estaVivo() {
		return getvida()>0;
	}

	public int getvida() {
		return vida;
	}

	public boolean debePonerArmamento() {
		return debePonerArmamento;
	}

	public MolotovEnemiga ponerArmamento() {
		int x = coordenadas.getx(),y = coordenadas.gety();
		return new MolotovEnemiga(x,y);
	}

	public int getvelocidad() {
		return velocidad;
	}

	public int getultimadirec() {
		return ultimadir;

	}
	
    public Element serializar() {
        Element elemenemigo = DocumentHelper.createElement("Enemigo");
        elemenemigo.addAttribute("clase", ""+this.getClass());
        elemenemigo.addAttribute("x", ""+this.get_coordenadas().getx());
        elemenemigo.addAttribute("y", ""+this.get_coordenadas().gety());
        return elemenemigo;
    }

    public static Enemigo recuperar(Element elemenemigo) {
        String clase = elemenemigo.attributeValue("clase");
        String x = elemenemigo.attributeValue("x");
        String y = elemenemigo.attributeValue("y");
        /*En este caso usamos reflexion pq en la persistencia del archivo 
         * solo podemos guardar strings en este caso el nombre de la clase
         */
        if (clase.equals(EnemigoCecilio.class.toString()))
        	return new EnemigoCecilio(Integer.parseInt(x), Integer.parseInt(y));
        if (clase.equals(EnemigoLopezReggae.class.toString()))
        	return new EnemigoLopezReggae(Integer.parseInt(x), Integer.parseInt(y));
        if (clase.equals(EnemigoLopezReggaeAlado.class.toString()))
        	return new EnemigoLopezReggaeAlado(Integer.parseInt(x), Integer.parseInt(y));
        return null;
    }
}
