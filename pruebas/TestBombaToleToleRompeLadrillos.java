import org.junit.Test;

import junit.framework.TestCase;
import logica.*;

public class TestBombaToleToleRompeLadrillos extends TestCase {

	@Test
	public void testBombaToleToleRompe(){
		
		ToleTole unaToleTole = new ToleTole(5,5);		
		BloqueLadrillos unBloqueLadrillos = new BloqueLadrillos(5,6);

		ObstaculosVivos obsVivos = new ObstaculosVivos();
		obsVivos.agregarObstaculo(unBloqueLadrillos);
						
		Explosion unaExplosion = unaToleTole.explotar(obsVivos);				
		unaExplosion.interactuar_con(obsVivos);
		
		assertFalse(obsVivos.estanTodosVivos());
	}

}
