import junit.framework.TestCase;
import logica.Coordenadas;
import logica.Jugador;


public class TestJugadorGetCoordenadas extends TestCase {
	
	public void testJugadorGetCoordenadas(){
		
		Jugador unJugador = new Jugador (2,3);
		Coordenadas coordenadas = new Coordenadas(2,3);
		
		assertTrue(unJugador.get_coordenadas().equals(coordenadas));
	}

}
