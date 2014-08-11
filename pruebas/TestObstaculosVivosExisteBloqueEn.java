

import junit.framework.TestCase;
import logica.BloqueLadrillos;
import logica.Coordenadas;
import logica.ObstaculosVivos;

public class TestObstaculosVivosExisteBloqueEn extends TestCase {
	
	public void testObsVivosExisteBloqueEn(){
		
		ObstaculosVivos obsVivos = new ObstaculosVivos();
		
		BloqueLadrillos unBloque = new BloqueLadrillos(4,4);
	
		obsVivos.agregarObstaculo(unBloque);
		
		assertTrue(obsVivos.existeBloqueEn(new Coordenadas(4,4)));
	}

}
