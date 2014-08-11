import junit.framework.TestCase;
import logica.EnemigoCecilio;


public class TestEnemigoGetVelocidad extends TestCase {
	
	public void testEnemigoGetVelocidad(){
		
		EnemigoCecilio unEnemigo = new EnemigoCecilio(5,5);
		
		int velocidadEnemigo = unEnemigo.getvelocidad();
		
		assertTrue(velocidadEnemigo == 1);
	}

}
