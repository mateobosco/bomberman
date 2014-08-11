

import junit.framework.TestCase;
import logica.ArticulosVivos;
import logica.Chala;
import logica.Coordenadas;

public class TestArticulosVivosExisteEn extends TestCase {
	
	public void testArticulosExisteEn(){
		
		ArticulosVivos artVivos = new ArticulosVivos();
		
		Chala unaChala = new Chala(5,5);
		
		artVivos.agregarArticulo(unaChala);
				
		assertTrue(artVivos.existeArticuloEn(new Coordenadas(5,5)));
		
	}

}
