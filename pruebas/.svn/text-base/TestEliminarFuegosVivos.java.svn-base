import junit.framework.TestCase;
import logica.Fuego;
import logica.FuegosVivos;

public class TestEliminarFuegosVivos extends TestCase {

		public void testEliminarFuegosVivos(){
			
			Fuego fuego1 = new Fuego(5,5, 1, 1);
			Fuego fuego2 = new Fuego(5,5, 1, 2);
			Fuego fuego3 = new Fuego(5,5, 1, 3);
			Fuego fuego4 = new Fuego(5,5, 2, 1);
			Fuego fuego5 = new Fuego(5,5, 2, 3);
			Fuego fuego6 = new Fuego(5,5, 1, 4);
			
			FuegosVivos fuegosVivos = new FuegosVivos();
			
			fuegosVivos.agregarFuego(fuego1);
			fuegosVivos.agregarFuego(fuego2);
			fuegosVivos.agregarFuego(fuego3);
			fuegosVivos.agregarFuego(fuego4);
			fuegosVivos.agregarFuego(fuego5);
			fuegosVivos.agregarFuego(fuego6);

			for(int i = 0;i < 6;i++){
				fuegosVivos.eliminarfuegos();
			}
			
			// El tamaño de los fuegos vivos debe ser nulo.
			assertSame("No deben quedar fuegos vivos", 0 ,fuegosVivos.getSize());			
			
		}
}
