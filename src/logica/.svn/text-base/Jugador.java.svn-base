package logica;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/*Clase del Jugador*/
public class Jugador extends Elemento implements Movible{

	public static final int demoraInicial = 20, IZQ=0, DER=1, ARR=2, ABJ=3;
	private int vida, demoraMax, velocidad; 
	public int ultimadir;
	private boolean buffActivo;
	private int demoraactual;

	public Jugador(int x, int y){
		coordenadas = new Coordenadas(x,y);
		vida = 5;
		velocidad = 1;
		buffActivo = false;
		demoraMax = Jugador.demoraInicial;
		//System.out.println("DEBUG JUG DEMORA MAX"+demoraMax);
		demoraactual = 0;
		pasoEnX = 0;
		pasoEnY = 0;
	}	

	public Jugador(int x, int y, int vel, int dem,
			boolean buffactivo) {
		coordenadas = new Coordenadas(x,y);
		vida = 5;
		velocidad = vel;
		buffActivo = buffactivo;
		demoraMax = dem;
		demoraactual = 0;
		pasoEnX = 0;
		pasoEnY = 0;		
	}

	/********PONER BOMBAS*********/
	public Molotov ponerBombaMolotov() { 
		demoraactual=1;
		int x = coordenadas.getx(),y = coordenadas.gety();
		return new Molotov(x,y);
	}
	
	public ToleTole ponerBombaToleTole() {
		demoraactual=15;
		int x = coordenadas.getx(),y = coordenadas.gety();
		return new ToleTole(x,y);
	}
	


	public void contarTiempoDemora() {
		//System.out.println("DEMORA MAX"+demoraMax);
		if (demoraactual!=0){
			if (++demoraactual>demoraMax)demoraactual=0;
		}
	}

	public boolean puedeponerbomba() {
		return demoraactual==0;
	}
	/********FIN PONER BOMBAS*********/	


	/******DOUBLE DISPACHMENTS******/
	public void interactuar_con_fuego(Fuego f) {
		if (get_coordenadas().equals(f.get_coordenadas())){ //si estan en el mismo lugar
			if(f.destruccionGeneral==-1)vida=0;
			else vida = vida - f.destruccionGeneral;
		}
	}

	public void interactuar_con_chala(Chala chala) {
		if (get_coordenadas().equals(chala.get_coordenadas())){
			chala.setYaInteractuo();
			velocidad = 2;
		}
	}

	public void interactuar_con_buffToleTole(BuffToleTole buffToleTole) {
		if (this.get_coordenadas().equals(buffToleTole.get_coordenadas())){
			setBuffActivo(true);
		    buffToleTole.setYaInteractuo();
			System.out.println("DEBUG INTERACTUO BUFF TOLE TOLE");
			}
	}

	public void interactuar_con_timer(Timer timer) {
		if (this.get_coordenadas().equals(timer.get_coordenadas())){
			timer.setYaInteractuo();
			reducirDemora();
		}
	}
	
	public void interactuar_con_enemigo(Enemigo enemigo) {
		if (this.get_coordenadas().equals(enemigo.get_coordenadas())&(enemigo.getvida()>0))
			vida = 0;
	}
	
	/******FIN DOUBLE DISPACHMENTS******/

	/******EFECTOS DE ARTICULOS********/
	public void setBuffActivo(boolean estado){
		buffActivo = estado;
	}

	private void reducirDemora() {
		demoraMax -= demoraMax*0.55;
	}

	public void restablecerDemora(){
		demoraMax = Jugador.demoraInicial;
	}

	/******FIN EFECTOS DE ARTICULOS********/


	/*********************MOVIMIENTO ****************************/
	public void mover(Coordenadas nuevascoord) {
		coordenadas = nuevascoord;
	}

	public Coordenadas obtenerDestino() {
		Coordenadas coordenadasDestino = sumarPasos();
		return coordenadasDestino;
	}

	public void fijarDestinoArriba(){
		ultimadir= Jugador.ARR;

		pasoEnX = 0;
		pasoEnY = -1;
	}

	public void fijarDestinoAbajo(){
		ultimadir = Jugador.ABJ;

		pasoEnX = 0;
		pasoEnY = 1;
	}

	public void fijarDestinoIzquierda(){
		ultimadir= Jugador.IZQ;

		pasoEnX = -1;
		pasoEnY = 0;
	}

	public void fijarDestinoDerecha(){
		ultimadir= Jugador.DER;

		pasoEnX = 1;
		pasoEnY = 0;
	}

	public void setPasosEnCero(){
		pasoEnX = 0;
		pasoEnY = 0;
	}
	/*********************FIN MOVIMIENTO ****************************/

	//Getters
	public int getvida(){return vida;}
	public boolean getBuffActivo() {return buffActivo;}
	public int getDemora() {return demoraMax;}
	public int getvelocidad(){return velocidad;}

	public int getultimadirec() {
		return ultimadir;
	}

	public void serializar(Element elemJuego) {
        Element elementjugador = DocumentHelper.createElement("Jugador");
        elementjugador.addAttribute("x", ""+this.get_coordenadas().getx());
        elementjugador.addAttribute("y", ""+this.get_coordenadas().gety());
        elementjugador.addAttribute("buffactivo",""+this.buffActivo);
        elementjugador.addAttribute("demoramax", ""+this.demoraMax);
        elementjugador.addAttribute("velocidad", ""+this.velocidad);
        
        elemJuego.add(elementjugador);
    }

    public static Jugador recuperar(Element elementpadre) {
    	Element element =elementpadre.element("Jugador");
        String x = element.attributeValue("x");
        String y = element.attributeValue("y");
        String demoramax = element.attributeValue("demoramax");
        String buffactivo = element.attributeValue("buffactivo");
        String velocidad = element.attributeValue("velocidad");
        return new Jugador(Integer.parseInt(x), Integer.parseInt(y),
        		Integer.parseInt(velocidad),Integer.parseInt(demoramax)
        		,Boolean.parseBoolean(buffactivo));

    }


}
