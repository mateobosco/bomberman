import org.junit.Test;

import junit.framework.TestCase;
import logica.*;

/*Prueba crear ObstaculosVivos y explotarlos*/
public class TestCrearObstaculo extends TestCase {
	
	@Test
	public void testCrearObstaculo(){
		Explosion explosion;
		Molotov bomba1 = new Molotov(4,7);
				
		ObstaculosVivos obstaculos_vivos = new ObstaculosVivos();
			
		BloqueLadrillos bloqueLadrillo = new BloqueLadrillos(4,8);
		BloqueCemento bloqueCemento = new BloqueCemento(4,9);
		BloqueCemento bloqueCemento2 = new BloqueCemento(5,8);
		BloqueAcero bloqueAcero = new BloqueAcero(5,9);
		
		obstaculos_vivos.agregarObstaculo(bloqueLadrillo);
		obstaculos_vivos.agregarObstaculo(bloqueCemento);
		obstaculos_vivos.agregarObstaculo(bloqueCemento2);
		obstaculos_vivos.agregarObstaculo(bloqueAcero);
		
		assertSame("existe bloque en 4,8", true, obstaculos_vivos.existeBloqueEn(new Coordenadas(4,8)));
				
		explosion = bomba1.explotar(obstaculos_vivos);
		
		explosion.interactuar_con(obstaculos_vivos);
				
		assertSame("Durabilidad bolque1", 0, bloqueLadrillo.get_durabilidad());
		assertSame("Durabilidad bolque2", 10, bloqueCemento.get_durabilidad());
		assertSame("Durabilidad bolque3", 10, bloqueCemento2.get_durabilidad());
		
	}
}