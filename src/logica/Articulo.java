package logica;

import java.awt.Graphics;

import org.dom4j.Attribute;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;


/*Clase abstracta de los articulos (chala,buff,timer)*/
public abstract class Articulo {
	
	Coordenadas coordenadas;
	boolean yaInteractuo;

	/*Cada articulo interactua de forma diferente*/
	public abstract void interactuar_con(Jugador jug);
	
	public Coordenadas get_coordenadas() {
		return coordenadas;
	}

	public Element serializar() {
        Element elementart = DocumentHelper.createElement("Articulo");
        elementart.addAttribute("clase", ""+this.getClass());
        elementart.addAttribute("x", ""+this.get_coordenadas().getx());
        elementart.addAttribute("y", ""+this.get_coordenadas().gety());
        return elementart;
	}

	public static Articulo recuperar(Element eletemp) {
        String clase = eletemp.attributeValue("clase");
        String x = eletemp.attributeValue("x");
        String y = eletemp.attributeValue("y");
        /*En este caso usamos reflexion pq en la persistencia del archivo 
         * solo podemos guardar strings en este caso el nombre de la clase
         */
        if (clase.equals(Chala.class.toString()))
        	return new Chala(Integer.parseInt(x), Integer.parseInt(y));
        if (clase.equals(BuffToleTole.class.toString()))
        	return new BuffToleTole(Integer.parseInt(x), Integer.parseInt(y));
        if (clase.equals(Timer.class.toString()))
        	return new Timer(Integer.parseInt(x), Integer.parseInt(y));
        return null;
	}
	
	public void setYaInteractuo() {
		yaInteractuo = true;		
	}

	public void pintar(Graphics g) {}	
}
