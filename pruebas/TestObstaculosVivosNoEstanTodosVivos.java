

import junit.framework.TestCase;
import logica.BloqueLadrillos;
import logica.Explosion;
import logica.Molotov;
import logica.ObstaculosVivos;

public class TestObstaculosVivosNoEstanTodosVivos extends TestCase {

	public void testObstaculosNoEstanVivos(){
		
		ObstaculosVivos obsVivos = new ObstaculosVivos();
		Molotov unaMolotov = new Molotov(4,3);
		
		BloqueLadrillos unBloque = new BloqueLadrillos(4,4);
		BloqueLadrillos otroBloque = new BloqueLadrillos(4,5);
		
		obsVivos.agregarObstaculo(unBloque);
		obsVivos.agregarObstaculo(otroBloque);
		
		Explosion unaExplosion = unaMolotov.explotar(obsVivos);
		unaExplosion.interactuar_con(obsVivos);		
		
		assertTrue(!obsVivos.estanTodosVivos());
			
		}
	}
