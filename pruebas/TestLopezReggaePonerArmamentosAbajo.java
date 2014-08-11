import junit.framework.TestCase;
import logica.Coordenadas;
import logica.EnemigoLopezReggae;
import logica.MolotovEnemiga;


public class TestLopezReggaePonerArmamentosAbajo extends TestCase {
	
	public void testLopezReggaePonerArmamentosAbajo(){
		
		EnemigoLopezReggae enemigo = new EnemigoLopezReggae(9,10);
		
		MolotovEnemiga molotovEnemiga = enemigo.ponerArmamento();
		
		Coordenadas nuevasCoord = new Coordenadas(6,7);
		
		assertTrue(molotovEnemiga.get_coordenadas().equals(nuevasCoord));
	}

}
