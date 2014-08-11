import junit.framework.TestCase;
import logica.EnemigoCecilio;
import logica.Jugador;


public class TestEnemigoInteractuarConJugador extends TestCase {

	public void testEnemigoInteractuarConJugador(){
		
		Jugador unJugador = new Jugador(0,0);
		EnemigoCecilio enemCecilio = new EnemigoCecilio(0,0);
		
		enemCecilio.interactuar_con_jugador(unJugador);
		
		assertTrue(unJugador.getvida() == 0);
		
	}
}
