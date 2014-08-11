import junit.framework.TestCase;
import logica.*;

public class TestJuegoMoverJugadorConChala extends TestCase {

	public void testMoverJugadorConChala(){
		
		/* Esta prueba si se corre en conjunto con las demás: falla.
		 * Si se corre sola: da OK.
		 * 
		 * En el DEBUG el valor de ambas coordenadas es el correcto.
		 */
		
		Juego unJuego = new Juego();
		Jugador unJugador = unJuego.getJugador();
		Chala unaChala = new Chala(0,0);
		ArticulosVivos artVivos = unJuego.getArticulosVivos();
		
		artVivos.agregarArticulo(unaChala);
		artVivos.interactuar_con_jugador(unJugador);
	
		unJuego.jugadorfijarDestinoDerecha();
		unJuego.moverJugador();
		
		// Debe moverse dos lugares en lugar de uno.
		Coordenadas coordenadas = new Coordenadas(2,0);
		Coordenadas coordenadasJugador = unJugador.get_coordenadas();
		
		// Las coordenadas deben ser iguales.
		assertTrue(coordenadas.equals(coordenadasJugador));
	}
}
