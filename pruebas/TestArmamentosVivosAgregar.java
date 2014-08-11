

import junit.framework.TestCase;
import logica.ArmamentosVivos;
import logica.Molotov;
import logica.ToleTole;

public class TestArmamentosVivosAgregar extends TestCase {

	public void testArmamentosVivosAgregar(){
		
		ArmamentosVivos armVivos = new ArmamentosVivos();
		
		Molotov unaMolotov = new Molotov(1,1);
		Molotov otraMolotov = new Molotov(1,2);
		
		ToleTole unaToleTole = new ToleTole(1,1);
		ToleTole otraToleTole = new ToleTole(2,1);
		
		armVivos.agregar_proyectil(otraToleTole);
		armVivos.agregar_proyectil(unaToleTole);
		armVivos.agregar_proyectil(otraMolotov);
		armVivos.agregar_proyectil(unaMolotov);
		
		assertTrue(armVivos.getSize() == 4);
	}
}
