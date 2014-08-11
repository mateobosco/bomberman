import junit.framework.TestCase;
import logica.*;

/*Prueba para ver si un jugador detras de un bloque sufre la explosion*/
public class TestJugadorDetrasDeBloque extends TestCase {

	public void testJugadorDetrasDeBloque(){
		
		Molotov bomba1;
		Explosion explosion1;
				
		BloqueCemento bloque1 = new BloqueCemento(5,1);
		ObstaculosVivos obsVivos = new ObstaculosVivos();
		
		obsVivos.agregarObstaculo(bloque1);
		Jugador jugador1 = new Jugador(4,1);
		Jugador jugador2 = new Jugador(6,1);
		bomba1 = jugador1.ponerBombaMolotov();
		
		explosion1 = bomba1.explotar(obsVivos);
		explosion1.interactuar_con(obsVivos);
		explosion1.interactuar_con(jugador1);
		explosion1.interactuar_con(jugador2);
		
		assertSame("Durabilidad bolque1", 5, bloque1.get_durabilidad());
		assertSame("Jugador1", 0, jugador1.getvida());
		assertSame("Jugador2", 5, jugador2.getvida());		
	}
}
