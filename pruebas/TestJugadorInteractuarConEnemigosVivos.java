import logica.*;
import junit.framework.TestCase;

public class TestJugadorInteractuarConEnemigosVivos extends TestCase {

	public void testEnemigoInteractuarConEnemigosVivos(){
		
		Jugador unJugador = new Jugador(0,0);
		EnemigoCecilio unCecilio = new EnemigoCecilio(0,0);
		EnemigoCecilio otroCecilio = new EnemigoCecilio(5,5);
		EnemigoLopezReggae unLopezReggae = new EnemigoLopezReggae(2,4);
		
		EnemigosVivos enemVivos = new EnemigosVivos();
		enemVivos.agregarEnemigo(unCecilio);
		enemVivos.agregarEnemigo(otroCecilio);
		enemVivos.agregarEnemigo(unLopezReggae);
		
		enemVivos.interactuar_con_jugador(unJugador);
		
		assertTrue(unJugador.getvida() == 0);
		
	}
}
