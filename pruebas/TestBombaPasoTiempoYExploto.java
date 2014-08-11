import junit.framework.TestCase;
import logica.ArmamentosVivos;
import logica.Jugador;
import logica.Molotov;

public class TestBombaPasoTiempoYExploto extends TestCase {

	public void testBombaPasoTiempoYExploto(){
		
		ArmamentosVivos armVivos = new ArmamentosVivos(); 
		Jugador unJugador = new Jugador(0,0);
		
		Molotov unaMolotov = unJugador.ponerBombaMolotov();
		armVivos.agregar_proyectil(unaMolotov);
		
		/* Se eligio que lo haga cien veces por lo que hace contar
		 * tiempo. Durante el juego va a depender del tiempo que 
		 * dure el ciclo.
		 */
		for(int i = 0; i<100;i++){
			armVivos.contarTiempo();		
		}
		
		assertTrue(armVivos.yaExplotaronTodos());
	}
}
