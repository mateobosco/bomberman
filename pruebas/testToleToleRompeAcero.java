import junit.framework.TestCase;
import logica.BloqueAcero;
import logica.ObstaculosVivos;
import logica.ToleTole;
import logica.Explosion;

public class testToleToleRompeAcero extends TestCase {

	public void testToleToleAcero(){
		
		ToleTole unaToleTole = new ToleTole(5,5);		
		BloqueAcero unBloqueAcero = new BloqueAcero(6,5);
		ObstaculosVivos obsVivos = new ObstaculosVivos();
		
		obsVivos.agregarObstaculo(unBloqueAcero);
		
		Explosion unaExplosion = unaToleTole.explotar(obsVivos);
		unaExplosion.interactuar_con(obsVivos);
		
		assertFalse(obsVivos.estanTodosVivos());		
	}
}
