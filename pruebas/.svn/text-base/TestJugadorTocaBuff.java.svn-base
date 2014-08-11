import junit.framework.TestCase;
import logica.*;

import org.junit.Test;

/*Prueba agarrar un artuculo el jugador*/
public class TestJugadorTocaBuff extends TestCase{

	@Test
	public void testJugadorponerbuff(){
		
		Chala chala1 = new Chala(4,1);
		
		
		Jugador jugador1 = new Jugador(4,1);
		Jugador jugador2 = new Jugador(1,1);
		
		chala1.interactuar_con(jugador1);
		chala1.interactuar_con(jugador2);
		
		assertSame("Vel Jug1", 2, jugador1.getvelocidad());
		assertSame("Vel Jug2", 1, jugador2.getvelocidad()); //no esta en el articulo		
				
	}	
}
