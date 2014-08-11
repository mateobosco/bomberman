package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import logica.Juego;


/*Controlador encargado de manejar los eventos de las teclas y los movimientos*/
public class ControladordeMovimiento implements KeyListener{
	
	Juego juego;
	
	
	public ControladordeMovimiento( ){
	}
	
	public void setJuego(Juego juego){
		this.juego=juego;
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println("Key Pressed");
		if (juego!=null){
				
			//rellenar
			if (e.getKeyChar()=='d')juego.jugadorfijarDestinoDerecha();
			else if (e.getKeyChar()=='a')juego.jugadorfijarDestinoIzquierda();
			else if (e.getKeyChar()=='s')juego.jugadorfijarDestinoAbajo();
			else if (e.getKeyChar()=='w')juego.jugadorfijarDestinoArriba();
			
			if(e.getKeyChar() == 'q') juego.jugadorponerBomba(); 
			if(e.getKeyChar() == 'g'){
				try {
					juego.guardar(juego.NOMBREARCHIVO);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} 
		
	}
	
	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {}
	
}