import junit.framework.TestCase;
import logica.Coordenadas;
import logica.Puerta;


public class TestPuertaGetCoordenadas extends TestCase {
	public void testPuertagetCoordenadas(){
		Puerta unaPuerta = new Puerta();
		Coordenadas nuevasCoord = new Coordenadas(15,12);
		
		assertTrue(unaPuerta.getCoordenadas().equals(nuevasCoord));
	}

}
