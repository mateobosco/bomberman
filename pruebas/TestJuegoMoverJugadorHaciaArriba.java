import junit.framework.TestCase;
import logica.Coordenadas;
import logica.Juego;
import logica.Jugador;

public class TestJuegoMoverJugadorHaciaArriba extends TestCase {

	public void testJuegoMoverJugadorHaciaArriba(){
		
		Juego unJuego = new Juego();
		
		Jugador jugador = unJuego.getJugador();

		/* Como el jugador se encuentra en el 0,0
		 * lo muevo hacia abajo y luego hacia arriba.
		 * Debe encontrarse en el inicio.
		 * fijarDestinoAbajo está probado.
		 */
		unJuego.jugadorfijarDestinoAbajo();
		unJuego.moverJugador();
		
		unJuego.jugadorfijarDestinoArriba();
		unJuego.moverJugador();
		
		assertTrue(jugador.get_coordenadas().equals(new Coordenadas(0,0)));
	}
}
