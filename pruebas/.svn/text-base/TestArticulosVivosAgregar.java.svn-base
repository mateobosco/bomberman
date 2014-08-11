
import junit.framework.TestCase;
import logica.ArticulosVivos;
import logica.Chala;
import logica.BuffToleTole;

public class TestArticulosVivosAgregar extends TestCase {
	
	public void testArticulosVivosAgregar(){

		ArticulosVivos artVivos = new ArticulosVivos();
		
		Chala unaChala = new Chala(5,5);
		Chala otraChala = new Chala(2,3);
		BuffToleTole unBuffToleTole = new BuffToleTole(2,4);
		BuffToleTole otroBuffToleTole = new BuffToleTole(2,5);
		
		//Agrego cuatro articulos
		artVivos.agregarArticulo(unaChala);
		artVivos.agregarArticulo(otraChala);
		artVivos.agregarArticulo(unBuffToleTole);
		artVivos.agregarArticulo(otroBuffToleTole);
		
		assertTrue(artVivos.getSize() == 4);
	}
}
