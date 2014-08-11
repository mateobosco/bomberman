package logica;

import java.util.Iterator;
import java.util.Vector;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;


/*Estructura utilizada para manejar varios articulos al mismo tiempo*/
public class ArticulosVivos{

		Vector<Articulo> listaArticulos;
		
		public ArticulosVivos(){
			listaArticulos = new Vector<Articulo>();			
		}
		
		public void agregarArticulo(Articulo art){
			listaArticulos.add(art);
		}

		/*Interactuar todos los articulos con el jugador*/
		public void interactuar_con_jugador(Jugador jugador) {
			for (int i = 0; i < listaArticulos.size();i++){
				Articulo articuloTemporal = listaArticulos.elementAt(i);
				articuloTemporal.interactuar_con(jugador);
				if(articuloTemporal.yaInteractuo) listaArticulos.remove(i);				
			}
		}
		
		/* Devuelve True en el caso de que exista el artículo en
		 * las coordenadas recibidas. Y False en caso contrario. */
		public boolean existeArticuloEn(Coordenadas coor){
			for (int i = 0; i< listaArticulos.size();i++){
				Articulo articuloTemp = listaArticulos.elementAt(i);
				if((articuloTemp.get_coordenadas().equals(coor)) )return true;
			}
			return false;
		}

		public int getSize() {
			return listaArticulos.size();
		}
		
		public Iterator<Articulo> iterator() {
			return listaArticulos.iterator();
		}

		public void serializar(Element elemJuego) {
	        Element elemArtVivos =DocumentHelper.createElement("ArticulosVivos");
	        elemJuego.add(elemArtVivos);
	        Iterator<Articulo> it = iterator();
	        while(it.hasNext()){
	            Articulo articulotemp = (Articulo)it.next();
	            elemArtVivos.add(articulotemp.serializar());
	        }		
		}			
}