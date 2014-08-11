package logica;


/*La clase fuego seria lo que realmente dana a los enemigos
 * y a los obstaculos, pegandoles un dano igual a destruccion
 * se utiliza double dispatchment.
 */
public class Fuego extends Elemento{
	
	int destruccionGeneral, destruccionEnemiga;
	
	public Fuego(int destruccionGeneral, int destruccionEnemiga, int x,int y){
		coordenadas = new Coordenadas(x,y);
		this.destruccionGeneral = destruccionGeneral;
		this.destruccionEnemiga = destruccionEnemiga;
	}
	
	//Interaccion con un elemento desconosido e
	public void interactuar_con(Elemento e){
		e.interactuar_con_fuego(this);
	}

	//Getters
	public int getDestruccionEnemiga() {return destruccionEnemiga;}
	public int getDestruccionBloque() { return destruccionGeneral;}
	public int getDestruccionJugador() {return destruccionGeneral;}
	public Coordenadas get_coordenadas() {return coordenadas;}	
	
	
	/**DOUBLE DISPACHMENTSSSSSS**/
	// Un fuego no interactua con otro fuego.
	public void interactuar_con_fuego(Fuego f) {}



}
