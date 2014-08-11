import junit.framework.TestCase;
import logica.Explosion;
import logica.FuegosVivos;
import logica.Molotov;
import logica.ObstaculosVivos;


public class TestExplosionAgregarAFuegosVivos extends TestCase {
	
	public void testExplosionAgregarAFuegosVivos(){
	
		FuegosVivos fuegosVivos = new FuegosVivos();
		Molotov unaMolotov = new Molotov(0,0);
		ObstaculosVivos obsVivos = new ObstaculosVivos();
		
		/* La explosión de la molotov genera nueve fuegos en total. */
		Explosion unaExplosion = unaMolotov.explotar(obsVivos);
		unaExplosion.agregarAFuegosVivos(fuegosVivos);
		
		assertTrue(fuegosVivos.getSize() == 9);
		
	}
}
