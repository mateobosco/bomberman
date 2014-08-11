package logica;

import java.util.Iterator;
import java.util.Vector;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/*Clase encargada de manejar varios obstaculos*/
public class ObstaculosVivos{

		Vector<Obstaculo> listaObstaculos;
		
		public ObstaculosVivos(){
			listaObstaculos = new Vector<Obstaculo>();			
		}
		
		/*Agrega un osbtaculo*/
		public void agregarObstaculo(Obstaculo obs){
			listaObstaculos.add(obs);
		}
		
		/*Interactuar todos los bloques con la explosion*/
		public void interactuar_con_explosion(Explosion explosion) {
			for (int i=0; i< listaObstaculos.size();i++){
				explosion.interactuar_con(listaObstaculos.elementAt(i));
			}
		}
		
		/*Devuelve si Existe un bloque con durabilidad en esa posicion*/
		public boolean existeBloqueEn(Coordenadas coor){
			for (int i=0; i < listaObstaculos.size();i++){
				Obstaculo obstaculotemp = listaObstaculos.elementAt(i);
				if((obstaculotemp.get_coordenadas().equals(coor)) && (obstaculotemp.esta_vivo()) )return true;
				}			
			return false;
		}
		
		/* Si algún obstáculo no está vivo, devuelve false. 
		 * Caso contrario, true.
		 */
		public boolean estanTodosVivos(){
			for(int i = 0; i < listaObstaculos.size(); i++){
				if (!(listaObstaculos.elementAt(i).esta_vivo())) return false;
			}
			return true;
		}
		
		
		public Obstaculo getObstaculoAt(int i) {
			return listaObstaculos.elementAt(i);
		}

		public int getsize() {
			return listaObstaculos.size();
		}

		public void serializar(Element elemJuego) {
			 Element elementopadre = DocumentHelper.createElement("ObstaculosVivos");
			 elemJuego.add(elementopadre);
			Iterator<Obstaculo> it = iterator();
			while(it.hasNext()){
				Obstaculo tempobj= (Obstaculo)it.next();
				elementopadre.add(tempobj.serializar());
				
			}
			
			
		}

		public Iterator <Obstaculo> iterator() {
			return listaObstaculos.iterator();
		}			
}