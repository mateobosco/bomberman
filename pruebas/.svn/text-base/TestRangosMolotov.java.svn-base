import org.junit.Test;

import junit.framework.TestCase;
import logica.*;

public class TestRangosMolotov extends TestCase {

	@Test
	public void testRangosMolotov(){
		
		Molotov molotov = new Molotov(10,10);		
		
		/* Estos bloques deben ser alcanzados por
		 * la explosión.
		 */
		BloqueCemento bloque1 = new BloqueCemento(8,10);
		BloqueCemento bloque2 = new BloqueCemento(10,8);
		BloqueCemento bloque3 = new BloqueCemento(12,10);
		BloqueCemento bloque4 = new BloqueCemento(10,12);
		
		/* Este bloque no debe sufrir ningún daño. */
		BloqueCemento bloque5 = new BloqueCemento(13,10);
		
		ObstaculosVivos obsVivos = new ObstaculosVivos();
		obsVivos.agregarObstaculo(bloque1);
		obsVivos.agregarObstaculo(bloque2);
		obsVivos.agregarObstaculo(bloque3);
		obsVivos.agregarObstaculo(bloque4);
		obsVivos.agregarObstaculo(bloque5);
		
		Explosion unaExplosion = molotov.explotar(obsVivos);				
		unaExplosion.interactuar_con(obsVivos);
		
		assertSame("Tiene que pegarle bloque", 5, bloque1.get_durabilidad());
		assertSame("Tiene que pegarle bloque", 5, bloque2.get_durabilidad());
		assertSame("Tiene que pegarle bloque", 5, bloque3.get_durabilidad());
		assertSame("Tiene que pegarle bloque", 5, bloque4.get_durabilidad());
		assertSame("No tiiene que pegarle bloque", 10, bloque5.get_durabilidad());
		
	}

}
