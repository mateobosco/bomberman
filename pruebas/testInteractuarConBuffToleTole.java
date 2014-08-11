import org.junit.Test;

import junit.framework.TestCase;
import logica.BuffToleTole;
import logica.Jugador;

public class testInteractuarConBuffToleTole extends TestCase {

	@Test
	public void testBuffToleTole() {
		
		Jugador unJugador = new Jugador(5,5);
		BuffToleTole unBuff = new BuffToleTole(5,5);
		
		unBuff.interactuar_con(unJugador);
		
		assertTrue(unJugador.getBuffActivo());
	}

}
