
import org.junit.Test;

import junit.framework.TestCase;
import logica.*;

public class TestToleToleObstaculosdetras extends TestCase {

	@Test
	public void testToleToleObstaculosdetras(){
		
		ToleTole unaToleTole = new ToleTole(5,5);		
		BloqueLadrillos bloque1 = new BloqueLadrillos(5,6);
		BloqueCemento bloque2 = new BloqueCemento(5,7);
		BloqueCemento bloque3 = new BloqueCemento(5,1);

		ObstaculosVivos obsVivos = new ObstaculosVivos();
		obsVivos.agregarObstaculo(bloque1);
		obsVivos.agregarObstaculo(bloque2);
		obsVivos.agregarObstaculo(bloque3);
				
		Explosion unaExplosion = unaToleTole.explotar(obsVivos);
				
		unaExplosion.interactuar_con(obsVivos);
		
		assertSame("Tiene que destruir bloque1", 0, bloque1.get_durabilidad());
		assertSame("No Tiene que destruir bloque", 10, bloque2.get_durabilidad());
		assertSame("Tiene que destruir bloque", 0, bloque3.get_durabilidad());
	}

}
