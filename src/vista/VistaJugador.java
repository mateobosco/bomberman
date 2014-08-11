package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import logica.Jugador;

public class VistaJugador {
	
	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	private static int tiempoCambiarImagenJugador = 0;
	int direcjug;
	
	Image bomberman1;
	Image bomberman2; 
	Image bomberman1izq;
	Image bomberman2izq;
	Image bomberman1der;
	Image bomberman2der;
	Image bomberman1top;
	Image bomberman2top;
	Image bomberman2muerto;

	Jugador jugador;
	
	Image imagenfinal = bomberman2;
	
	public VistaJugador(Jugador j){
		
		bomberman1= new ImageIcon("drawable/bomberman1.png").getImage();;
		bomberman2= new ImageIcon("drawable/bomberman2.png").getImage();; 	
		bomberman1izq=new ImageIcon("drawable/bomberman1izq.png").getImage();
		bomberman2izq=new ImageIcon("drawable/bomberman2izq.png").getImage();
		bomberman1der=new ImageIcon("drawable/bomberman1der.png").getImage();;
		bomberman2der=new ImageIcon("drawable/bomberman2der.png").getImage();;
		bomberman1top=new ImageIcon("drawable/bomberman1top.png").getImage();;
		bomberman2top=new ImageIcon("drawable/bomberman2top.png").getImage();;
		bomberman2muerto= new ImageIcon("drawable/bomberman2muerto.png").getImage();;
		
		jugador = j;
	}
	public void pintar(Graphics G){
		
		if(++tiempoCambiarImagenJugador>1){
			tiempoCambiarImagenJugador=0;
		}
		
		direcjug = jugador.getultimadirec();
		
		if(tiempoCambiarImagenJugador==0){
			if(direcjug==0)imagenfinal=bomberman2izq;
			else if(direcjug==1)imagenfinal=bomberman2der;
			else if(direcjug==2)imagenfinal=bomberman2top;
			else if(direcjug==3)imagenfinal=bomberman2;
		}

		else if(tiempoCambiarImagenJugador==1){
			if(direcjug==0)imagenfinal=bomberman1izq;
			else if(direcjug==1)imagenfinal=bomberman1der;
			else if(direcjug==2)imagenfinal=bomberman1top;
			else if(direcjug==3)imagenfinal=bomberman1;
		}

		if(jugador.getvida()<=0) imagenfinal=bomberman2muerto;

		int xjug = jugador.get_coordenadas().getx();
		int yjug = jugador.get_coordenadas().gety();

		G.drawImage(imagenfinal, xjug*celdatamx+offsetx,yjug*celdatamy+offsety, null);

		
		
	}

}
