import junit.framework.TestCase;
import logica.FabricadeNiveles;


public class TestFabricadeNivelesGetNumNivel extends TestCase {
	public void testFabricadeNivelesGetNumNivel(){
		FabricadeNiveles unaFabrica = new FabricadeNiveles();
		int numeroNivel = unaFabrica.getNumNivel();
		
		assertSame("",numeroNivel,0);
	}

}
