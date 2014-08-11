
import junit.framework.TestCase;
import logica.BloqueAcero;
import logica.Explosion;
import logica.Molotov;
import logica.ObstaculosVivos;

public class testBombaMolotovNoRompeAcero extends TestCase {

	public void testMolotovAcero(){
		
		BloqueAcero unBloqueAcero = new BloqueAcero(5,5);
		Molotov unaMolotov = new Molotov(6,5);
		ObstaculosVivos obsVivos = new ObstaculosVivos();
		obsVivos.agregarObstaculo(unBloqueAcero);
		
		Explosion unaExplosion = unaMolotov.explotar(obsVivos);
		unaExplosion.interactuar_con(obsVivos);
		
		/* El bloque de acero tiene que seguir vivo, 
		 * pues la molotov no puede romperlo.
		 */
		assertTrue(obsVivos.estanTodosVivos());
	}
}
