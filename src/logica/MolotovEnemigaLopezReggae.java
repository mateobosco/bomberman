package logica;

import java.awt.Graphics;

import vista.VistaMolotovEnemigaLopezReggae;

public class MolotovEnemigaLopezReggae extends MolotovEnemiga {

	public MolotovEnemigaLopezReggae(int x, int y) {
		super(x, y);
	}

	public void pintar(Graphics G){
		VistaMolotovEnemigaLopezReggae.pintar(this,G);
	}
}
