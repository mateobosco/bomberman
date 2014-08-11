import junit.framework.TestCase;
import logica.FabricadeNiveles;
import logica.Juego;
import logica.Puerta;


public class TestPuertaInteractuoConJugador extends TestCase {
	public void testPuertaInteractuoConJugador(){
		Juego unJuego = new Juego();
		Puerta unaPuerta = unJuego.getPuerta();
		FabricadeNiveles unaFabrica = unJuego.getFabrica();
		
		/* Interactuo con el juego y luego
		 * obtengo el nivel que si se dio el caso
		 * de interactuar, debe haber aumentado. */
		unaPuerta.interactuar(unJuego);
		assertSame("",unaFabrica.getNumNivel(),1);
	}

}
