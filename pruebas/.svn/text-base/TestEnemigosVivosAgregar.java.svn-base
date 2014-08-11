import junit.framework.TestCase;
import logica.EnemigoCecilio;
import logica.EnemigosVivos;

public class TestEnemigosVivosAgregar extends TestCase {

	public void testEnemigosVivosAgregar(){
		
		EnemigosVivos enemVivos = new EnemigosVivos();
		
		EnemigoCecilio unEnemCecilio = new EnemigoCecilio(5,5);
		EnemigoCecilio otroEnemCecilio = new EnemigoCecilio(4,5);
		
		enemVivos.agregarEnemigo(unEnemCecilio);
		enemVivos.agregarEnemigo(otroEnemCecilio);
		
		assertTrue(enemVivos.getsize() == 2);
	}
}
