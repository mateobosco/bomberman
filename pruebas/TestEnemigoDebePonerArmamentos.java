import junit.framework.TestCase;
import logica.EnemigoCecilio;


public class TestEnemigoDebePonerArmamentos extends TestCase {

	public void testEnemigoDebePonerArmamentos(){
		
		EnemigoCecilio unEnemigo = new EnemigoCecilio(5,5);
		
		boolean debePonerArmamentos = unEnemigo.debePonerArmamento();
		
		assertTrue(debePonerArmamentos);
	}
}
