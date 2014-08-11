package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import logica.EnemigoLopezReggae;

public class VistaEnemigoLopezReggae {

	static Image tanque1 = new ImageIcon("drawable/tanque1.png").getImage();
	static Image tanque2 = new ImageIcon("drawable/tanque2.png").getImage();
	static Image tanque1abj=new ImageIcon("drawable/tanque1abajo.png").getImage();
	static Image tanque2abj=new ImageIcon("drawable/tanque2abajo.png").getImage();
	static Image tanque1der=new ImageIcon("drawable/tanque1derecha.png").getImage();
	static Image tanque2der=new ImageIcon("drawable/tanque2derecha.png").getImage();
	static Image tanque1izq=new ImageIcon("drawable/tanque1izquierda.png").getImage();
	static Image tanque2izq=new ImageIcon("drawable/tanque2izquierda.png").getImage();	
	static Image tanquemuerto = new ImageIcon("drawable/tanquechocado.jpg").getImage();
	static Image imagenenemigofinal = tanque1;
	
	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	static int xEne, yEne, direcenemigo;
	private static int tiempoCambiarImagenEnemigo = 0;
	
	public static void pintar(EnemigoLopezReggae enemigoLopezReggae, Graphics g) {
		
		xEne = enemigoLopezReggae.get_coordenadas().getx();
		yEne = enemigoLopezReggae.get_coordenadas().gety();
		
		if(++tiempoCambiarImagenEnemigo>1){
			tiempoCambiarImagenEnemigo=0;
		}
		
		direcenemigo = enemigoLopezReggae.getultimadirec();
		
		if(tiempoCambiarImagenEnemigo==0){
			if(direcenemigo==0)imagenenemigofinal=tanque2izq;
			else if(direcenemigo==1)imagenenemigofinal=tanque2der;
			else if(direcenemigo==2)imagenenemigofinal=tanque2abj;
			else if(direcenemigo==3)imagenenemigofinal=tanque2;
		}
		else if(tiempoCambiarImagenEnemigo==1){
			if(direcenemigo==0)imagenenemigofinal=tanque1izq;
			else if(direcenemigo==1)imagenenemigofinal=tanque1der;
			else if(direcenemigo==2)imagenenemigofinal=tanque1abj;
			else if(direcenemigo==3)imagenenemigofinal=tanque1;
		}				
		if (enemigoLopezReggae.getvida()<=0)imagenenemigofinal=tanquemuerto;
		
		g.drawImage(imagenenemigofinal,xEne*celdatamx+offsetx, yEne*celdatamy+offsety, null);
	}
}