package logica;

import java.util.Iterator;

import org.dom4j.*;
public class FabricadeNiveles {
	
	public int NUMNIVEL=0;
	
	public  synchronized  void  cargarNivel(Juego juego){
		NUMNIVEL++;
		
		if(NUMNIVEL>3)NUMNIVEL=1;//cambiar la linea cuando se tengan mas niveles
		if (NUMNIVEL==1)cargarNivel1(juego);
		if (NUMNIVEL==2)cargarNivel2(juego);
		if (NUMNIVEL==3)cargarNivel3(juego);
	}
	
	private void cargarNivelVacio(Juego juego) {
		juego.obsVivos = new ObstaculosVivos();
		juego.articulosVivos = new ArticulosVivos();
		juego.enemigosVivos = new EnemigosVivos();
		juego.armamentosVivos = new ArmamentosVivos();
		juego.fuegosvivos = new FuegosVivos();
		juego.jugador = new Jugador(0,0);
		
	}	
	public void cargarNivelGuardado(Element elemJuego,Juego juego) {
		cargarNivelVacio(juego);
		cargarJugador(elemJuego,juego);
		cargarEnemigos(elemJuego,juego);
		cargarObstaculos(elemJuego,juego);
		cargarArticulosVivos(elemJuego,juego);		
	}
	
	private void cargarJugador(Element elemJuego, Juego juego) {
		juego.jugador=Jugador.recuperar(elemJuego);
		
	}

	private void cargarArmamentosVivos(Element elemJuego, Juego juego) {
        Element elementopadre = elemJuego.element("ArmamentosVivos");
        Iterator it = elementopadre.elementIterator();
        while(it.hasNext()){
            Element elementotemp = (Element)it.next();
            juego.armamentosVivos.agregar_proyectil((Armamento.recuperar(elementotemp)));
        }
	}

	private void cargarArticulosVivos(Element elemJuego, Juego juego) {
        Element elementopadre = elemJuego.element("ArticulosVivos");
        Iterator it = elementopadre.elementIterator();
        while(it.hasNext()){
            Element elementotemp = (Element)it.next();
            juego.articulosVivos.agregarArticulo((Articulo.recuperar(elementotemp)));
        }
	}

	private void cargarObstaculos(Element elemJuego, Juego juego) {
        Element elementopadre = elemJuego.element("ObstaculosVivos");
        Iterator it = elementopadre.elementIterator();
        while(it.hasNext()){
            Element elementotemp = (Element)it.next();
            juego.obsVivos.agregarObstaculo((Obstaculo.recuperar(elementotemp)));
        }
	}


	private void cargarEnemigos(Element elemJuego, Juego juego) {
        Element elemEnemigosVivos = elemJuego.element("EnemigosVivos");
        Iterator it = elemEnemigosVivos.elementIterator();
        while(it.hasNext()){
            Element elemenemigotemp = (Element)it.next();
            juego.enemigosVivos.agregarEnemigo(Enemigo.recuperar(elemenemigotemp));
        }
	}
	
	
	
	private  void cargarNivel1(Juego juego){
		
			cargarNivelVacio(juego);
			
			for(int i = 1; i < juego.xMax-1; i+=2){
				for(int j = 1; j < juego.yMax-1; j+=2){
					juego.obsVivos.agregarObstaculo(new BloqueAcero(i,j));
				}
			}

			juego.obsVivos.agregarObstaculo(new BloqueCemento(0,2));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(1,4));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(2,2));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(2,6));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(4,1));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(4,3));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(6,5));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(5,7));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(9,12));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(15,5));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(15,11));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(15,2));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(5,12));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(6,8));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(12,8));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(14,12));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(12,6));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(14,5));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(14,9));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(4,7));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(11,0));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(8,6));
			juego.obsVivos.agregarObstaculo(new BloqueCemento(8,2));
			
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(2,4));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(5,2));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(6,0));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(9,0));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(11,3));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(11,7));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(8,5));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(5,8));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(4,10));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(9,10));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(9,8));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(4,12));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(6,12));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(7,12));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(15,3));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(15,8));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(0,7));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(0,8));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(0,11));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(12,5));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(12,10));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(14,11));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(4,6));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(4,11));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(4,0));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(0,4));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(0,8));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(4,9));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(4,3));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(9,3));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(5,4));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(10,4));
			juego.obsVivos.agregarObstaculo(new BloqueLadrillos(15,12));
			
			juego.articulosVivos.agregarArticulo(new Chala(12,10));
			juego.articulosVivos.agregarArticulo(new BuffToleTole(3,4));
			juego.articulosVivos.agregarArticulo(new Timer(4,8));

			juego.enemigosVivos.agregarEnemigo(new EnemigoCecilio(0,5));
			juego.enemigosVivos.agregarEnemigo(new EnemigoLopezReggaeAlado(7,8));
			juego.enemigosVivos.agregarEnemigo(new EnemigoLopezReggae(8,12));

			Puerta puerta = new Puerta();
	}

	private void cargarNivel2(Juego juego){
		cargarNivelVacio(juego);
		
		
		juego.jugador = new Jugador(0,0);
		for(int i = 1; i < juego.xMax-1; i+=2){
			for(int j = 1; j < juego.yMax-1; j+=2){
				juego.obsVivos.agregarObstaculo(new BloqueAcero(i,j));
			}
		}

		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(0,2));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(1,4));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(2,2));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(2,6));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(4,1));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(4,3));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(6,5));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(5,7));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(9,12));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(15,5));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(15,11));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(15,2));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(5,12));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(6,8));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(12,8));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(14,12));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(12,6));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(14,5));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(14,9));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(4,7));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(11,0));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(8,6));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(8,2));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(14,2));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(14,6));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(14,10));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(15,12));

		
		juego.obsVivos.agregarObstaculo(new BloqueCemento(2,4));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(5,2));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(6,0));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(9,0));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(11,3));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(11,7));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(8,5));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(5,8));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,10));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(9,10));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(9,8));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,12));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(6,12));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(7,12));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(15,3));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(15,8));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(0,7));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(0,8));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(0,11));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(12,5));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(12,10));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(14,11));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,6));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,11));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(2,0));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(0,4));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(0,8));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,9));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,3));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(9,3));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(5,4));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(10,4));
		
		juego.articulosVivos.agregarArticulo(new Chala(10,12));
		juego.articulosVivos.agregarArticulo(new BuffToleTole(8,9));

		juego.enemigosVivos.agregarEnemigo(new EnemigoCecilio(5,0));
		juego.enemigosVivos.agregarEnemigo(new EnemigoLopezReggaeAlado(10,5));
		juego.enemigosVivos.agregarEnemigo(new EnemigoLopezReggae(9,11));
		
		Puerta puerta = new Puerta();
	}
	
	
	private void cargarNivel3(Juego juego){
		cargarNivelVacio(juego);
		
		for(int i = 1; i < juego.xMax-1; i+=2){
			for(int j = 1; j < juego.yMax-1; j+=2){
				juego.obsVivos.agregarObstaculo(new BloqueAcero(i,j));
			}
		}

		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(4,1));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(7,3));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(9,9));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(11,3));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(6,1));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(1,11));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(3,9));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(1,2));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(9,12));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(5,15));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(3,11));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(15,2));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(5,12));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(1,8));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(2,9));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(12,14));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(11,6));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(14,7));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(14,9));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(4,7));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(11,0));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(8,6));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(8,2));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(15,11));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(14,12));
		juego.obsVivos.agregarObstaculo(new BloqueLadrillos(15,12));
		
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,4));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(5,13));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(5,0));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(0,9));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(11,3));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(11,7));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(8,5));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(5,8));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,10));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(9,10));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(9,8));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,12));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(6,12));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(7,12));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(15,3));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(15,8));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(0,7));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(0,8));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(0,11));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(12,5));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(12,10));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(14,11));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,6));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,11));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(2,0));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(0,4));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(0,8));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,9));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(4,3));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(9,3));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(5,4));
		juego.obsVivos.agregarObstaculo(new BloqueCemento(10,4));
		
		juego.articulosVivos.agregarArticulo(new Chala(10,11));
		juego.articulosVivos.agregarArticulo(new BuffToleTole(12,3));
		juego.articulosVivos.agregarArticulo(new Timer(4,9));

		juego.enemigosVivos.agregarEnemigo(new EnemigoCecilio(12,9));
		juego.enemigosVivos.agregarEnemigo(new EnemigoLopezReggaeAlado(10,8));
		juego.enemigosVivos.agregarEnemigo(new EnemigoLopezReggae(9,11));
		
		Puerta puerta = new Puerta();
	}
	
	
	public int getNumNivel(){	
		return NUMNIVEL; 
	}
}
