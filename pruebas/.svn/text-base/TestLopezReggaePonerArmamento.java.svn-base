import junit.framework.TestCase;
import logica.Coordenadas;
import logica.EnemigoLopezReggae;
import logica.MolotovEnemiga;


public class TestLopezReggaePonerArmamento extends TestCase {

	public void testLopezReggaePonerArmamento(){
		
		EnemigoLopezReggae enemigo = new EnemigoLopezReggae(10,9);
		
		MolotovEnemiga molotovEnemiga = enemigo.ponerArmamento();
		
		Coordenadas nuevasCoord = new Coordenadas(13,12);
		
		assertTrue(molotovEnemiga.get_coordenadas().equals(nuevasCoord));
	}
}
