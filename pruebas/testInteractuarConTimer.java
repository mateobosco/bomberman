import org.junit.Test;

import junit.framework.TestCase;

import logica.*;

public class testInteractuarConTimer extends TestCase {

	@Test
	public void testInteractuarConTimerTrue() {
		
		Jugador unJugador = new Jugador(5,5);
		Timer unTimer = new Timer(5,5);
		
		int demora= unJugador.getDemora();
		unTimer.interactuar_con(unJugador);
		
		assertTrue(unJugador.getDemora()<demora);
	}
}
