
import junit.framework.TestCase;
import logica.*;
import org.junit.Test;

public class TestPonerBombaMolotov extends TestCase{
	
	@Test
	public void testponerBombaMolotov(){	
	/*Pongo una molotov y luego la exploto dabnando un bloque*/

		
		Explosion explosion1;
		
		BloqueCemento bloque1 = new BloqueCemento(5,1);
		BloqueLadrillos bloque2 = new BloqueLadrillos(5,2);
		BloqueLadrillos bloque3 = new BloqueLadrillos(9,9);
		
		Molotov bomba1= new Molotov(5,1);
		
		//exploto la bomba devuelve la explosion(llena de fuegos)
		explosion1= bomba1.explotar(null);
		
		//interactua la explosion con un bloque
		explosion1.interactuar_con(bloque1);
		explosion1.interactuar_con(bloque2);
		explosion1.interactuar_con(bloque3);
		
		
		assertSame("Durabilidad bolque1", 5, bloque1.get_durabilidad());
		assertSame("Durabilidad bolque2", 0, bloque2.get_durabilidad());
		assertSame("Durabilidad bolque3", 5, bloque3.get_durabilidad());
	}

}
