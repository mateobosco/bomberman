

import junit.framework.TestCase;
import logica.BloqueLadrillos;
import logica.ObstaculosVivos;

public class TestObstaculosVivosEstanTodosVivos extends TestCase {

	public void testEstanTodosVivos(){
		
		ObstaculosVivos obsVivos = new ObstaculosVivos();
		
		BloqueLadrillos unBloque = new BloqueLadrillos(4,4);
		BloqueLadrillos otroBloque = new BloqueLadrillos(4,5);
		
		obsVivos.agregarObstaculo(unBloque);
		obsVivos.agregarObstaculo(otroBloque);
		
		assertTrue(obsVivos.estanTodosVivos());
		
	}
}
