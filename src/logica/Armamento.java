package logica;

import java.awt.Graphics;

import org.dom4j.Attribute;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;


/*Clase  abstaracta de las armas Hijas: Molotov, Tole Tole*/

public abstract class Armamento extends Elemento{

	protected int destruccion, tiempo;
	
	private static int TIEMPOMOLOTOV= 20;
	private boolean yaExploto = false;
	
	/* Metodo que crea explosion. DEbe ser sobre escrito en las clases hijas (molotov, tole tole)
	 * Devuelve una explosion con los fuegos*/
	public abstract Explosion explotar(ObstaculosVivos ObsVivos);
		
	public boolean yaExploto() {
		if(tiempo >= TIEMPOMOLOTOV) yaExploto = true; 		
		return yaExploto;
	}

	public void contarTiempo() {
		tiempo++;
	}

	public Element serializar() {
        Element elementarma = DocumentHelper.createElement("Armamento");
        elementarma.addAttribute("clase", this.getClass().toString());
        elementarma.addAttribute("x", ""+this.get_coordenadas().getx());
        elementarma.addAttribute("y", ""+this.get_coordenadas().gety());

        return elementarma;
	}

	public static Armamento recuperar(Element eletemp) {
		
        String clase = eletemp.attributeValue("clase");
        String x = eletemp.attributeValue("x");
        String y = eletemp.attributeValue("y");
        /*En este caso usamos reflexion pq en la persistencia del archivo 
         * solo podemos guardar strings en este caso el nombre de la clase
         */
        System.out.println(clase+"/"+Molotov.class.toString());
        if(clase.equals(MolotovEnemiga.class.toString())){
        	return new MolotovEnemiga(Integer.parseInt(x), Integer.parseInt(y));
        }
        else if(clase.equals(Molotov.class.toString())){
        	return new Molotov(Integer.parseInt(x), Integer.parseInt(y));
        }
        	
        if (clase.equals(ToleTole.class.toString()))
        	return new ToleTole(Integer.parseInt(x), Integer.parseInt(y));

        return null;
	}
	
	public void interactuar_con_fuego(Fuego f) {}

	public void pintar(Graphics g) {}
}
