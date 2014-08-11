import junit.framework.TestCase;
import logica.FabricadeNiveles;
import logica.Juego;


public class TestFabricadeNivelesCargarSegundoNivel extends TestCase {

	public void testCargarSegundoNivel(){
		Juego juego = new Juego();
		FabricadeNiveles fabrica = new FabricadeNiveles();
		
		fabrica.cargarNivel(juego);
		fabrica.cargarNivel(juego);
		
		assertSame("", fabrica.getNumNivel(),2);
	}
}
