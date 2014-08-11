import junit.framework.TestCase;
import logica.*;

public class TestMolotovEnemigaMataJugador extends TestCase {

	public void testMolotovEnemigaMataJugador(){
		
		Jugador unJugador = new Jugador(0,0);
		MolotovEnemiga unaMolotovEnemiga = new MolotovEnemiga(0,1);
		ObstaculosVivos obsVivos = new ObstaculosVivos();
		
		Explosion unaExplosion = unaMolotovEnemiga.explotar(obsVivos);
		unaExplosion.interactuar_con(unJugador);
		
		assertSame("El jugador debe haber muerto", 0 , unJugador.getvida());
		
	}
}
