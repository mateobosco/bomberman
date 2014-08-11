

import junit.framework.TestCase;
import logica.EnemigoCecilio;
import logica.EnemigosVivos;
import logica.Explosion;
import logica.MolotovEnemiga;
import logica.ObstaculosVivos;

public class TestMolotovEnemigaNoMataEnemigo extends TestCase {

	public void testMolotovEnemigaNoMataEnemigo(){
		
		EnemigoCecilio unEnemigoCecilio = new EnemigoCecilio(0,2);
		MolotovEnemiga unaMolotovEnemiga = new MolotovEnemiga(0,1);
		EnemigosVivos enemVivos = new EnemigosVivos();
		ObstaculosVivos obsVivos = new ObstaculosVivos();
		
		enemVivos.agregarEnemigo(unEnemigoCecilio);
				
		Explosion unaExplosion = unaMolotovEnemiga.explotar(obsVivos);
		unaExplosion.interactuar_con(enemVivos);
		
		assertSame("El enemigo no debe haber muerto", 5, unEnemigoCecilio.getvida());
		
	}
}
