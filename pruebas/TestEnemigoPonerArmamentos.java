import junit.framework.TestCase;
import logica.EnemigoCecilio;
import logica.MolotovEnemiga;


public class TestEnemigoPonerArmamentos extends TestCase {

	public void testEnemigoPonerArmamento(){
		
		EnemigoCecilio enemigo = new EnemigoCecilio(5,5);
		MolotovEnemiga molotov = enemigo.ponerArmamento();
		
		assertTrue(enemigo.get_coordenadas().equals(molotov.get_coordenadas()));
	}
}
