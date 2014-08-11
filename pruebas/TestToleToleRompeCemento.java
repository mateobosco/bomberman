
import org.junit.Test;

import junit.framework.TestCase;
import logica.*;

public class TestToleToleRompeCemento extends TestCase {
	@Test
	public void testBombaToleToleRompe(){
		
		ToleTole unaToleTole = new ToleTole(5,5);		
		BloqueCemento unBloqueCemento = new BloqueCemento(5,6);

		ObstaculosVivos obsVivos = new ObstaculosVivos();
		obsVivos.agregarObstaculo(unBloqueCemento);
						
		Explosion unaExplosion = unaToleTole.explotar(obsVivos);				
		unaExplosion.interactuar_con(obsVivos);
		
		assertFalse(obsVivos.estanTodosVivos());
	}
}
