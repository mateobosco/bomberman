

import junit.framework.TestCase;
import logica.ArmamentosVivos;
import logica.Molotov;

public class TestArmamentosVivosEliminar extends TestCase {

	public void testarmamentosvivoseliminar(){
		Molotov molotov = new Molotov(5,5);
		ArmamentosVivos armVivos = new ArmamentosVivos();
		
		armVivos.agregar_proyectil(molotov);
		armVivos.eliminar(molotov);
		
		assertSame("",armVivos.getSize(),0);
	}
}
