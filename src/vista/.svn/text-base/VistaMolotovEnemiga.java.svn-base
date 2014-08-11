package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import logica.MolotovEnemiga;

public class VistaMolotovEnemiga {

	static Image bomb1 = new ImageIcon("drawable/bomb1.png").getImage();
	static Image bomb2 = new ImageIcon("drawable/bomb2.png").getImage();
	
	static final int tamanox = GamePanel.tamanox;
	static final int tamanoy = GamePanel.tamanoy;
	static final int celdatamx = GamePanel.celdatamx;
	static final int celdatamy = GamePanel.celdatamx;
	static final int offsetx = GamePanel.offsetx;
	static final int offsety = GamePanel.offsety;
	private static int tiempoCambiarImagenArmamento = 0;
	static int xMolotovEnemiga, yMolotovEnemiga;
	static Image imagenfinal = bomb1;

	public static void pintar(MolotovEnemiga molotovEnemiga, Graphics g) {
		
		if(++tiempoCambiarImagenArmamento > 1){
			tiempoCambiarImagenArmamento = 0;
		}
		
		xMolotovEnemiga = molotovEnemiga.get_coordenadas().getx();
		yMolotovEnemiga = molotovEnemiga.get_coordenadas().gety();
		
		if (tiempoCambiarImagenArmamento == 1) imagenfinal = bomb2;
		else imagenfinal = bomb1;
		g.drawImage(imagenfinal,xMolotovEnemiga*celdatamx+offsetx, yMolotovEnemiga*celdatamy+offsety, null);				
	}
}