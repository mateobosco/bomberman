import junit.framework.TestCase;
import logica.Coordenadas;
import logica.Jugador;
import logica.ToleTole;


public class TestJugadorPonerBombaToleTole extends TestCase {
	
	public void testJugadorPonerBombaToleTole(){
		
		Jugador unJug = new Jugador(5,5);
		ToleTole bomba = unJug.ponerBombaToleTole();
		Coordenadas nuevasCoord = bomba.get_coordenadas();
		
		assertTrue(unJug.get_coordenadas().equals(nuevasCoord));
	}
}
