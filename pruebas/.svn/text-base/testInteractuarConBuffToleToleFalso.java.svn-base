import org.junit.Test;

import junit.framework.TestCase;
import logica.BuffToleTole;
import logica.Jugador;

public class testInteractuarConBuffToleToleFalso extends TestCase {

	@Test
	public void testBuffToleTole() {
		
		Jugador unJugador = new Jugador(5,5);
		BuffToleTole unBuff = new BuffToleTole(6,6);
		
		unBuff.interactuar_con(unJugador);
		
		assertSame("El buff tiene que ser falso", false, unJugador.getBuffActivo());
	}

}
