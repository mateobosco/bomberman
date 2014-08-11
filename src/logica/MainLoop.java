package logica;

public class MainLoop extends Thread {
	
	public ObstaculosVivos obsVivos;
	public FuegosVivos fuegosvivos;
	public ArticulosVivos articulosVivos;
	public ArmamentosVivos armamentosVivos;
	public Jugador jugador;
	public EnemigosVivos enemigosVivos;
	public Juego juego;
	public Puerta puerta;
	
	public MainLoop(Juego juego){
		this.juego = juego;
		obsVivos = juego.getObsVivos();
		enemigosVivos = juego.getEnemigosVivos();
		articulosVivos = juego.getArticulosVivos();
		jugador = juego.getJugador();
		armamentosVivos = juego.getArmamentosVivos();	
		fuegosvivos = juego.getFuegosVivos();
		puerta = juego.getPuerta();
		
		start();
	}
	
	public void run(){
		while (true){
			
			obsVivos = juego.getObsVivos();
			enemigosVivos = juego.getEnemigosVivos();
			articulosVivos = juego.getArticulosVivos();
			jugador = juego.getJugador();
			armamentosVivos = juego.getArmamentosVivos();	
			fuegosvivos = juego.getFuegosVivos();
			puerta = juego.getPuerta();
			
			
			//Esperar
			try {Thread.sleep(200);} 
			catch (InterruptedException e) {e.printStackTrace();}
			
			
			
			juego.moverJugador();			
			juego.moverEnemigos();
						
			juego.explotarArmamentos();	
			
			articulosVivos.interactuar_con_jugador(jugador);
			enemigosVivos.interactuar_con_jugador(jugador);
			puerta.interactuar(juego);
			
			
			armamentosVivos.contarTiempo();	
			enemigosVivos.contarTiempo();
			jugador.contarTiempoDemora();			
			
			juego.EnemigosVivosponerArmamentos();
			
			fuegosvivos.eliminarfuegos();
			
		}
	}
}
