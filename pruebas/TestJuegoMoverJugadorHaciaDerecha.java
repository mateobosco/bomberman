import junit.framework.TestCase;
import logica.Coordenadas;
import logica.Juego;
import logica.Jugador;

public class TestJuegoMoverJugadorHaciaDerecha extends TestCase {

	public void testMoverDerecha(){
		Juego unJuego = new Juego();
		
		Jugador jugador = unJuego.getJugador();

		jugador.fijarDestinoDerecha();
		unJuego.moverJugador();
		
		assertTrue(jugador.get_coordenadas().equals(new Coordenadas(1,0)));
	}
}
