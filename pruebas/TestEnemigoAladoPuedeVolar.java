import junit.framework.TestCase;
import logica.EnemigoLopezReggaeAlado;


public class TestEnemigoAladoPuedeVolar extends TestCase {

	public void testJugadorNoPuedeVolar(){
		
		EnemigoLopezReggaeAlado unEnemigoAlado = new EnemigoLopezReggaeAlado(2,3);
		
		boolean enemigoAladoPuedeVolar = unEnemigoAlado.puedeVolar();
		
		assertTrue(enemigoAladoPuedeVolar);	
	}
}
