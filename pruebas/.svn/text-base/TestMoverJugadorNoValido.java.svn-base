

import junit.framework.TestCase;
import logica.Coordenadas;
import logica.Juego;
import logica.Jugador;

public class TestMoverJugadorNoValido extends TestCase {
	
	public void testJugadorMover(){
		/* 	Mueve el jugador a una posición no valida. */
		
		Juego juego1 = new Juego();
		Jugador jugador1 = new Jugador(1,0);
		
		Coordenadas nuevacoord = new Coordenadas(1,1);
		
		juego1.jugadorfijarDestinoAbajo();
		juego1.moverJugador();	
		
		assertFalse(jugador1.get_coordenadas().equals(nuevacoord));
	
	}	
}

