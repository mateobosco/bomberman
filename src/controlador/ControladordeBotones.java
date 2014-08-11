package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.JuegoJFrame;

import logica.Juego;


/*Controlador encargado de manejar los eventos de los botones*/
public class ControladordeBotones implements ActionListener {
	
	JuegoJFrame framemadre;
	
	public ControladordeBotones(JuegoJFrame framemadre){
		this.framemadre=framemadre;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==framemadre.botonnuevo){
			framemadre.juegoNuevo();
		}
		else if (e.getSource()==framemadre.botoncargar){
			framemadre.juegoCargar();
		}
	}

}
