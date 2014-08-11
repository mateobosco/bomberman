import junit.framework.TestCase;

import org.junit.Test;

import logica.BloqueCemento;
import logica.Explosion;
import logica.Jugador;
import logica.Molotov;

/*Prueba poner una bomba y explotar un bloque*/
public class TestJugadorPonerBomba extends TestCase{

	@Test
	public void testJugadorPonerBomba(){
		
		Molotov bomba1;
		Explosion explosion1;
		
		BloqueCemento bloque1 = new BloqueCemento(5,1);
		Jugador jugador1 = new Jugador(4,1);
		Jugador jugador2 = new Jugador(1,1);
		
		bomba1 = jugador1.ponerBombaMolotov();
		
		explosion1 = bomba1.explotar(null);
		
		explosion1.interactuar_con(bloque1);
		explosion1.interactuar_con(jugador1);
		
		assertSame("Durabilidad bolque1", 5, bloque1.get_durabilidad());
		assertSame("Vida Jug1", 0, jugador1.getvida());
		assertSame("Vida Jug2", 5, jugador2.getvida()); //no esta en la explosion
		
		
		
	}
	
}
