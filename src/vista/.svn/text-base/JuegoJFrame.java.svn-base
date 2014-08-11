package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logica.Juego;
import logica.MainLoop;

import controlador.ControladordeBotones;
import controlador.ControladordeMovimiento;

@SuppressWarnings("serial")

/*Clase principal de la ventana del juego*/
public class JuegoJFrame extends JFrame  {
	
	ImageIcon title= new ImageIcon("drawable/title.png");
	Image presplash= Toolkit.getDefaultToolkit().getImage("drawable/presplash.png");
	GamePanel gamepanel;
	ControladordeBotones controladordeBotones;
	ControladordeMovimiento controlador;
	Juego juego;
	public JButton botonnuevo ;
	public JButton botoncargar ;
	private boolean pintarpresplash=false;

	public JuegoJFrame(){
		/*Constructor, fija dimensiones basicas y crea las intancia de los controladores*/
		super("BomberMan 1.0");
		controlador= new ControladordeMovimiento();
		controladordeBotones=new ControladordeBotones(this);
		
		//Configuraciones Generales
		setBounds(200,200,800,600);
		this.setPreferredSize(new Dimension(800,600));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setResizable(true);

		//Estetica del menu
		Container contentpane= getContentPane();
		contentpane.setLayout(new GridLayout(4,1));

		//botones
		botonnuevo = new JButton("Nuevo Juego");
		botonnuevo.addActionListener(controladordeBotones);
		botoncargar = new JButton("Cargar Juego");
		botoncargar.addActionListener(controladordeBotones);

		//Agregar al Panel
		JPanel panellabel= new JPanel();
		JPanel panelbotonnuevo= new JPanel();
		JPanel panelbotoncargar= new JPanel();
		JPanel panellabelbot= new JPanel();
		
		panellabel.add(new JLabel(title));
		panelbotonnuevo.add(botonnuevo);
		panelbotoncargar.add(botoncargar);
		panellabelbot.add(new JLabel("Presione G durante el Juego para guardar la partida"));
		
		contentpane.add(panellabel);
		contentpane.add(panelbotonnuevo);
		contentpane.add(panelbotoncargar);
		contentpane.add(panellabelbot);
		
		this.pack();
		
		Toolkit.getDefaultToolkit().sync();
		
	}
	
	/*Llamado del controlador para iniciar el juego nuevo*/
	public void juegoNuevo() {
		juego = new Juego();
		comenzarJuego();	
	}
	
	/*Llamado del controlador para iniciar el juego cargado*/
	public void juegoCargar() {
		juego = new Juego(Juego.NOMBREARCHIVO);
		comenzarJuego();		
	}
	
	/*Imprime el Pre-Spalsh*/
	private void imprimirprespalsh(){
		//Imprimir pre Spalsh
		pintarpresplash=true;
		paint(getGraphics());
		this.getContentPane().removeAll();
		paint(getGraphics());
		try {
			int timer=0;
			while(timer++<10){
				Thread.sleep(200);
				paint(getGraphics());
			}
		} 
		catch (InterruptedException e) {e.printStackTrace();}
		pintarpresplash=false;
	}
	
	/*Comienza un nuevo Juego al igual q un mainloop y un paintloop*/
	@SuppressWarnings("unused")
	private void comenzarJuego() {
		
		setFocusable(true);
		requestFocusInWindow();
		
		imprimirprespalsh();
		this.getContentPane().removeAll();
		
		//Agregar el panel del juego
		gamepanel = new GamePanel(juego);
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(gamepanel);
		
		//Darle foco al controlador de teclas
		controlador.setJuego(juego);
		gamepanel.setFocusable(true);
		gamepanel.requestFocusInWindow();
		gamepanel.addKeyListener(controlador);
		
		//Iniciar mainloop y paintloop
		MainLoop mainloop = new MainLoop(juego);
		Repainter repainter = new Repainter(gamepanel);

		this.paintAll(getGraphics());
		this.repaint();
		
		Toolkit.getDefaultToolkit().sync();
	}
	
	
	public void paint(Graphics G){
		super.paint(G);
		if(pintarpresplash){
			G.drawImage(presplash,0, 0, this);
		}
		Toolkit.getDefaultToolkit().sync();
	}		
	
	
	
	/*Hilo encargado de repintar el gamepanel*/
	private class Repainter extends Thread{
		GamePanel gamepanel;
		Repainter(GamePanel gamepanel){
			this.gamepanel = gamepanel;
			start();
		}
		public void run(){
			while (true){
				try {Thread.sleep(200);} 
				catch (InterruptedException e) {e.printStackTrace();}
				gamepanel.repaint();
			}
		}
	}







}
