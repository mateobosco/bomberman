import junit.framework.TestCase;
import logica.Coordenadas;
import logica.Juego;
import logica.Jugador;

public class TestJuegoMoverJugadorIzquierda extends TestCase {

	public void testMoverIzquierdaJugador(){
		Juego unJuego = new Juego();
		Jugador jugador = unJuego.getJugador();

		/* Como el jugador se encuentra en el 0,0
		 * lo muevo hacia la izquierda.
		 * No debe moverse. 
		 */
		
		unJuego.jugadorfijarDestinoIzquierda();
		unJuego.moverJugador();
		
		assertTrue(jugador.get_coordenadas().equals(new Coordenadas(0,0)));
	}
}
