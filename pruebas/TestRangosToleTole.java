


import org.junit.Test;

import junit.framework.TestCase;
import logica.*;

public class TestRangosToleTole extends TestCase {

	@Test
	public void testRangosToleTole(){
		
		ToleTole unaToleTole = new ToleTole(10,10);	
		
		/* Estos bloques deben ser alcanzados por la explosión. */
		BloqueCemento bloque1 = new BloqueCemento(14,10);
		BloqueCemento bloque2 = new BloqueCemento(10,14);
		BloqueCemento bloque3 = new BloqueCemento(6,10);
		BloqueCemento bloque4 = new BloqueCemento(10,6);
		
		/* Este bloque no debe sufrir ningún daño. */
		BloqueCemento bloque5 = new BloqueCemento(10,5);

		ObstaculosVivos obsVivos = new ObstaculosVivos();
		obsVivos.agregarObstaculo(bloque1);
		obsVivos.agregarObstaculo(bloque2);
		obsVivos.agregarObstaculo(bloque3);
		obsVivos.agregarObstaculo(bloque4);
		obsVivos.agregarObstaculo(bloque5);
		
		Explosion unaExplosion = unaToleTole.explotar(obsVivos);
				
		unaExplosion.interactuar_con(obsVivos);
		
		assertSame("Tiene q destruir bloque", 0, bloque1.get_durabilidad());
		assertSame("Tiene q destruir bloque", 0, bloque2.get_durabilidad());
		assertSame("Tiene q destruir bloque", 0, bloque3.get_durabilidad());
		assertSame("Tiene q destruir bloque", 0, bloque4.get_durabilidad());
		assertSame("No tiene q destruir bloque", 10, bloque5.get_durabilidad());
		
	}

}
