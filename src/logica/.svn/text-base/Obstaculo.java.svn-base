package logica;

import java.awt.Graphics;

import org.dom4j.Attribute;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;


/*Clase que representa las paredes, o obstaculos
 * Tiene 3 Clases hijas: Acero,Cemento,Ladrillos
 * */
public abstract class Obstaculo extends Elemento{
	
	protected int durabilidad; //Utilizado para los bloques con vida
	
	/*Constructor basico que asigna unas coordenadas
	 * Es Llamado con super(x,y) en las hijas*/
	public Obstaculo(int x,int y){
		coordenadas = new Coordenadas(x,y);		
	}

	/*Gets*/
	public int get_durabilidad(){return durabilidad;}
	
	
	/**DOUBLE DISPACHMENTSSSSSS**/
	public void interactuar_con_fuego(Fuego f) {
		/*Debe ser sobrescrito por las clases hijas (BloqueAcero,etc)
		 * */	
	}
	
	public void pintar(Graphics g) {}

	public boolean esta_vivo() {
		return get_durabilidad() > 0;
	}

	public Element serializar() {
        Element elementobs = DocumentHelper.createElement("Obstaculo");
        elementobs.addAttribute("clase", ""+this.getClass());
        elementobs.addAttribute("x", ""+this.get_coordenadas().getx());
        elementobs.addAttribute("y", ""+this.get_coordenadas().gety());
        elementobs.addAttribute("durabilidad", ""+this.get_durabilidad());
        return elementobs;
	}

	public static Obstaculo recuperar(Element elemobstaculo) {

        String clase = elemobstaculo.attributeValue("clase");
        String x = elemobstaculo.attributeValue("x");
        String y = elemobstaculo.attributeValue("y");
        String durabilidad = elemobstaculo.attributeValue("durabilidad");
        /*En este caso usamos reflexion pq en la persistencia del archivo 
         * solo podemos guardar strings en este caso el nombre de la clase
         */
        if (clase.equals(BloqueAcero.class.toString()))
        	return new BloqueAcero(Integer.parseInt(x), Integer.parseInt(y),Integer.parseInt(durabilidad));
        if (clase.equals(BloqueCemento.class.toString()))
        	return new BloqueCemento(Integer.parseInt(x), Integer.parseInt(y),Integer.parseInt(durabilidad));
        if (clase.equals(BloqueLadrillos.class.toString()))
        	return new BloqueLadrillos(Integer.parseInt(x), Integer.parseInt(y),Integer.parseInt(durabilidad));
        return null;
	}
}
