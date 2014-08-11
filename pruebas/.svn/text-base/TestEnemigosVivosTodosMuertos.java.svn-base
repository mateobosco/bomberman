import junit.framework.TestCase;
import logica.*;


public class TestEnemigosVivosTodosMuertos extends TestCase {
	
	public void testEnemigosVivosTodosMuertos(){
		
		EnemigoCecilio enemigo = new EnemigoCecilio(2,2);
		EnemigosVivos enemVivos = new EnemigosVivos();
		Molotov molotov = new Molotov(2,2);
		ObstaculosVivos obsVivos = new ObstaculosVivos();
		
		enemVivos.agregarEnemigo(enemigo);
		
		Explosion unaExplosion = molotov.explotar(obsVivos);
		unaExplosion.interactuar_con(enemVivos);
		
		assertTrue(enemVivos.todosMuertos());	
		
	}

}
