import junit.framework.TestCase;
import logica.*;

public class TestBombaNoExplotoNoPasoTiempo extends TestCase {

	public void testBombaTiempo(){
		
		ArmamentosVivos armVivos = new ArmamentosVivos(); 
		Jugador unJugador = new Jugador(0,0);
		
		Molotov unaMolotov = unJugador.ponerBombaMolotov();
		armVivos.agregar_proyectil(unaMolotov);
		
		/* No tiene que haber explotado. */
		assertFalse(armVivos.yaExplotaronTodos());		
	}
}
