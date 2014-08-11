package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import logica.EnemigoCecilio;


public class VistaEnemigoCecilio {
	
	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	static int xEne, yEne, direcenemigo;
	private static int tiempoCambiarImagenEnemigo = 0;
		
	static Image cecilio1= new ImageIcon("drawable/cecilio1.png").getImage();
	static Image cecilio2= new ImageIcon("drawable/cecilio2.png").getImage();
	static Image cecilio1top= new ImageIcon("drawable/cecilio1top.png").getImage();
	static Image cecilio2top= new ImageIcon("drawable/cecilio2top.png").getImage();
	static Image cecilio1izq= new ImageIcon("drawable/cecilio1izq.png").getImage();
	static Image cecilio2izq= new ImageIcon("drawable/cecilio2izq.png").getImage();
	static Image cecilio1der= new ImageIcon("drawable/cecilio1der.png").getImage();
	static Image cecilio2der= new ImageIcon("drawable/cecilio2der.png").getImage();
	static Image cecilio1muerto= new ImageIcon("drawable/cecilio1muerto.png").getImage();
	static Image imagenenemigofinal = cecilio1;
	
	public static void pintar(EnemigoCecilio enemigoCecilio, Graphics G) {
		
		xEne = enemigoCecilio.get_coordenadas().getx();
		yEne = enemigoCecilio.get_coordenadas().gety();
		
		if(++VistaEnemigoCecilio.tiempoCambiarImagenEnemigo>1){
			VistaEnemigoCecilio.tiempoCambiarImagenEnemigo=0;
		}
		
		direcenemigo = enemigoCecilio.getultimadirec();
		
		if(tiempoCambiarImagenEnemigo==0){
			if(direcenemigo==0)imagenenemigofinal=cecilio2izq;
			else if(direcenemigo==1)imagenenemigofinal=cecilio2der;
			else if(direcenemigo==2)imagenenemigofinal=cecilio2;
			else if(direcenemigo==3)imagenenemigofinal=cecilio2top;
		}
		else if(tiempoCambiarImagenEnemigo==1){
			if(direcenemigo==0)imagenenemigofinal=cecilio1izq;
			else if(direcenemigo==1)imagenenemigofinal=cecilio1der;
			else if(direcenemigo==2)imagenenemigofinal=cecilio1;
			else if(direcenemigo==3)imagenenemigofinal=cecilio1top;
		}								
		if (enemigoCecilio.getvida()<=0) imagenenemigofinal=cecilio1muerto;
		
		G.drawImage(imagenenemigofinal,xEne*celdatamx+offsetx, yEne*celdatamy+offsety, null);
	}
}