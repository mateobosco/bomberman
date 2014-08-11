package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import logica.EnemigoLopezReggaeAlado;

public class VistaEnemigoLopezReggaeAlado {

	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	static int xEne, yEne, direcenemigo;
	private static int tiempoCambiarImagenEnemigo = 0;
	
	static Image avion1 = new ImageIcon("drawable/avion1abj.png").getImage();
	static Image avion2 = new ImageIcon("drawable/avion2abj.png").getImage();
	static Image avion1top = new ImageIcon("drawable/avion1.png").getImage();
	static Image avion2top = new ImageIcon("drawable/avion2.png").getImage();
	static Image avion1der = new ImageIcon("drawable/avion1der.png").getImage();
	static Image avion2der = new ImageIcon("drawable/avion2der.png").getImage();
	static Image avion1izq = new ImageIcon("drawable/avion1izq.png").getImage();
	static Image avion2izq = new ImageIcon("drawable/avion2izq.png").getImage();
	static Image avionmuerto = new ImageIcon("drawable/avionmuerto.png").getImage();
	static Image imagenenemigofinal = avion1;
	
	public static void pintar(EnemigoLopezReggaeAlado enemigoLopezReggaeAlado,
			Graphics g) {
		
		xEne = enemigoLopezReggaeAlado.get_coordenadas().getx();
		yEne = enemigoLopezReggaeAlado.get_coordenadas().gety();
		
		if(++tiempoCambiarImagenEnemigo>1){
			tiempoCambiarImagenEnemigo=0;
		}
		
		direcenemigo = enemigoLopezReggaeAlado.getultimadirec();
		
		if(tiempoCambiarImagenEnemigo==0){
			if(direcenemigo==0)imagenenemigofinal=avion2izq;
			else if(direcenemigo==1)imagenenemigofinal=avion2der;
			else if(direcenemigo==2)imagenenemigofinal=avion2;
			else if(direcenemigo==3)imagenenemigofinal=avion2top;
		}
		else if(tiempoCambiarImagenEnemigo==1){
			if(direcenemigo==0)imagenenemigofinal=avion1izq;
			else if(direcenemigo==1)imagenenemigofinal=avion1der;
			else if(direcenemigo==2)imagenenemigofinal=avion1;
			else if(direcenemigo==3)imagenenemigofinal=avion1top;
		}				
		if (enemigoLopezReggaeAlado.getvida()<=0)imagenenemigofinal=avionmuerto;
		
		g.drawImage(imagenenemigofinal,xEne*celdatamx+offsetx, yEne*celdatamy+offsety, null);
	}
}