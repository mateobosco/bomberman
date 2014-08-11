package logica;

public class Puerta {
	
	Coordenadas coordenada;
	EnemigosVivos enemVivos;
	FabricadeNiveles fabrica;
	
	public Puerta() {
		coordenada = new Coordenadas(15,12);
	}	
	
	public Coordenadas getCoordenadas(){
		return coordenada;
	}
	
	public void interactuar(Juego juego){
		Jugador jugador = juego.getJugador();
		FabricadeNiveles fabrica = juego.getFabrica();
		EnemigosVivos enemVivos = juego.getEnemigosVivos();
		
		if(jugador.get_coordenadas().equals(coordenada)){
			if (enemVivos.todosMuertos()){
				fabrica.cargarNivel(juego);
			}
		}
	}
}