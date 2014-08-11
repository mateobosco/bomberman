package logica;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.w3c.dom.Node;



public class EnemigosVivos {

	Vector<Enemigo> vector_enemigos;
	Coordenadas coord;
	Enemigo enemigoActual;
	
	public EnemigosVivos(){
		vector_enemigos = new Vector<Enemigo>();
	}
	

	public void interactuar_con_explosion(Explosion explosion) {
		Iterator <Enemigo> it = vector_enemigos.iterator();
		Enemigo enemigoTemporal;
		while(it.hasNext()){
			enemigoTemporal = it.next();
			explosion.interactuar_con(enemigoTemporal);
		}
	}

	public int getsize() {
		return vector_enemigos.size();
	}

	public void agregarEnemigo(Enemigo enemigo) {
		vector_enemigos.add(enemigo);		
	}

	public void contarTiempo() {
		Iterator <Enemigo> it = vector_enemigos.iterator();
		Enemigo enemigoTemporal;
		while(it.hasNext()){
			enemigoTemporal = it.next();
			enemigoTemporal.contarTiempo();	
		}
	}

	public void interactuar_con_jugador(Jugador unJugador) {
		Iterator <Enemigo> it = vector_enemigos.iterator();
		Enemigo enemigoTemporal;
		while(it.hasNext()){
			enemigoTemporal = it.next();
			unJugador.interactuar_con_enemigo(enemigoTemporal);
		}		
	}

	public boolean todosMuertos() {
		Iterator <Enemigo> it = vector_enemigos.iterator();
		Enemigo enemigoTemporal;
		while(it.hasNext()){
			enemigoTemporal = it.next();
			if(enemigoTemporal.getvida()>0) return false;
		}
		return true;
	}
	
	public int getCantidadVivos(){
		int cantidadVivos = 0;
		Iterator <Enemigo> it = vector_enemigos.iterator();
		Enemigo enemigoTemporal;
		while(it.hasNext()){
			enemigoTemporal = it.next();
			if(enemigoTemporal.getvida()>0) cantidadVivos++;
		}
		return cantidadVivos;		
	}


	public void serializar(Element elemJuego) {
		Element elemenemigos = DocumentHelper.createElement("EnemigosVivos");
		elemJuego.add(elemenemigos);
		Iterator<Enemigo> it = Iterator();
		while(it.hasNext()){
			Enemigo tempenemigo = it.next();
			elemenemigos.add(tempenemigo.serializar());
		}		
	}

	public Iterator<Enemigo> Iterator() {
		return vector_enemigos.iterator();
	}
}

