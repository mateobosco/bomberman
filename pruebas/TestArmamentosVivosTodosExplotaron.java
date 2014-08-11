

import junit.framework.TestCase;
import logica.ArmamentosVivos;
import logica.Molotov;
import logica.ToleTole;

public class TestArmamentosVivosTodosExplotaron extends TestCase {

	public void testTodosExplotaron(){
		
		ArmamentosVivos armVivos = new ArmamentosVivos();
		
		Molotov unaMolotov = new Molotov(1,1);
		Molotov otraMolotov = new Molotov(1,2);		
		ToleTole unaToleTole = new ToleTole(1,1);
		ToleTole otraToleTole = new ToleTole(2,1);
		
		armVivos.agregar_proyectil(otraToleTole);
		armVivos.agregar_proyectil(unaToleTole);
		armVivos.agregar_proyectil(otraMolotov);
		armVivos.agregar_proyectil(unaMolotov);
		
		/* Dejamos que pase un tiempo */
		for(int i = 0;i < 30; i++){
			armVivos.contarTiempo();
		}
		
		assertTrue(armVivos.yaExplotaronTodos());
	}
}
