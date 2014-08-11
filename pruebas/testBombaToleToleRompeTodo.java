import org.junit.Test;

import junit.framework.TestCase;
import logica.*;

public class testBombaToleToleRompeTodo extends TestCase {

	@Test
	public void testBombaToleToleRompe(){
		
		ToleTole unaToleTole = new ToleTole(5,5);		
		BloqueLadrillos unBloqueLadrillos = new BloqueLadrillos(5,6);
		BloqueCemento unBloqueCemento = new BloqueCemento(5,4);

		ObstaculosVivos obsVivos = new ObstaculosVivos();
		obsVivos.agregarObstaculo(unBloqueLadrillos);
		obsVivos.agregarObstaculo(unBloqueCemento);
		
		Explosion unaExplosion = unaToleTole.explotar(obsVivos);
				
		unaExplosion.interactuar_con(obsVivos);
		
		assertSame("La tole tole tiene que destruir el ladrillo", 0, unBloqueLadrillos.get_durabilidad());
		assertSame("La tole tole tiene que destruir el cemento", 0, unBloqueCemento.get_durabilidad());
	}

}
