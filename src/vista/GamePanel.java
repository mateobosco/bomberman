package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

import logica.EnemigosVivos;
import logica.FabricadeNiveles;
import logica.Juego;
import logica.Jugador;

@SuppressWarnings("serial")
/*Clase Encarga de pintar en la pantalla cada ciclo del juego*/
public class GamePanel extends JPanel {
	
	Juego juego;	

	static final int tamanox = 800;
	static final int tamanoy= 600;
	static final int celdatamx=40;
	static final int celdatamy=40;
	static final int offsetx=85;
	static final int offsety=5;
	
	Image gameOver = Toolkit.getDefaultToolkit().getImage("drawable/gameOver.png");
	Image detrasInformacion = Toolkit.getDefaultToolkit().getImage("drawable/detrasInformacion.png");
	
	VistaPuerta vistaPuerta;
	VistaObstaculos vistaObstaculos;
	VistaFuegos vistaFuegos;
	VistaEnemigos vistaEnemigos;
	VistaArticulos vistaArticulos;
	VistaBombas vistaBombas;
	VistaJugador vistaJugador;
	
	GamePanel(Juego juego){
		setBackground(Color.black);
		this.juego = juego;		
	}
	/*Llamado en cada ciclo para pintar la pantalla*/
	public void paint(Graphics G){

		vistaJugador = new VistaJugador(juego.getJugador());
		vistaPuerta = new VistaPuerta(juego.getPuerta());
		vistaObstaculos = new VistaObstaculos(juego);
		vistaFuegos = new VistaFuegos(juego);
		vistaEnemigos = new VistaEnemigos(juego);
		vistaArticulos = new VistaArticulos(juego);
		vistaBombas = new VistaBombas(juego);		
	
		//Constantes
		G.setColor(Color.black);
		G.fillRect(0, 0, tamanox, tamanoy);
		pintarCeldas(G);		
		vistaJugador.pintar(G);
		vistaPuerta.pintar(G);
		vistaFuegos.pintar(G);
		vistaObstaculos.pintar(G);
		vistaArticulos.pintar(G);
		vistaBombas.pintar(G);
		vistaEnemigos.pintar(G);	
		

		pintarCarteles(G);
		pintarInformacion(G);	
	}	

	/*Pinta informacion sobre la partida actual*/
	private void pintarInformacion(Graphics G) {
		
		EnemigosVivos enemVivos = juego.getEnemigosVivos();
		int cantidadEnemigos = enemVivos.getCantidadVivos();
		
		FabricadeNiveles fabrica = juego.getFabrica();
		int numNivel = fabrica.getNumNivel();
		
		G.drawImage(detrasInformacion, 130, 530, 542, 32, null);	
		G.drawString("Enemigos Restantes: "+cantidadEnemigos+".   NIVEL ACTUAL: "+numNivel , 280, 550);
	}

	private void pintarCarteles(Graphics G) {
		
		Jugador jugador = juego.getJugador();
		boolean jugadorVive = jugador.getvida() > 0;
		
		if (!jugadorVive)
			G.drawImage(gameOver, 200, 200, 414, 123, null);		
	}
	
	private void pintarCeldas(Graphics G) {
		for(int i =0; i< juego.xMax;i++){
			for(int j =0; j< juego.yMax;j++){
				G.setColor(Color.white);
				G.fillRect(i*celdatamx+offsetx, j*celdatamy+offsety, celdatamx,celdatamy);
				G.setColor(Color.black);
				G.drawRect(i*celdatamx+offsetx, j*celdatamy+offsety, celdatamx,celdatamy);
			}
		}
	}
}