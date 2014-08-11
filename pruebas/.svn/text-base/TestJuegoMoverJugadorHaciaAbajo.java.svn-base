

import junit.framework.TestCase;
import logica.*;

public class TestJuegoMoverJugadorHaciaAbajo extends TestCase {
	
	public void testJuego(){
		
		Juego unJuego = new Juego();
		
		Jugador jugador = unJuego.getJugador();

		jugador.fijarDestinoAbajo();
		unJuego.moverJugador();
		
		assertTrue(jugador.get_coordenadas().equals(new Coordenadas(0,1)));
	
	
	}
	

}
