import junit.framework.TestCase;
import logica.FabricadeNiveles;
import logica.Juego;


public class TestFabricadenivelesCargarTercerNivel extends TestCase {

	public void testCargartercerNivel(){
		
		Juego juego = new Juego();
		FabricadeNiveles fabrica = new FabricadeNiveles();
		
		fabrica.cargarNivel(juego);
		fabrica.cargarNivel(juego);
		fabrica.cargarNivel(juego);
		
		assertSame("", fabrica.getNumNivel(),3);
	}
}
