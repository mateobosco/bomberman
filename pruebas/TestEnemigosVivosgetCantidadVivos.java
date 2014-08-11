import junit.framework.TestCase;
import logica.EnemigoCecilio;
import logica.EnemigosVivos;
import logica.Explosion;
import logica.Molotov;
import logica.ObstaculosVivos;


public class TestEnemigosVivosgetCantidadVivos extends TestCase {

	public void testEnemigosVivosgetCantidadVivos(){
		
		EnemigoCecilio enemigo = new EnemigoCecilio(2,2);
		EnemigosVivos enemVivos = new EnemigosVivos();
		Molotov molotov = new Molotov(2,2);
		ObstaculosVivos obsVivos = new ObstaculosVivos();
		
		enemVivos.agregarEnemigo(enemigo);
		
		Explosion unaExplosion = molotov.explotar(obsVivos);
		unaExplosion.interactuar_con(enemVivos);
		
		assertSame("",enemVivos.getCantidadVivos(),0);
	}
	
}
