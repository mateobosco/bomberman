package logica;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
public class Juego {

	public static final String NOMBREARCHIVO= "juego.xml";
	public volatile ObstaculosVivos obsVivos;
	public volatile ArmamentosVivos armamentosVivos;
	public volatile ArticulosVivos articulosVivos;
	public volatile Jugador jugador;
	public volatile EnemigosVivos enemigosVivos;
	public volatile FuegosVivos fuegosvivos;
	public final int xMax = 16;
	public final int yMax = 13;
	private FabricadeNiveles fabrica;
	public Puerta puerta;

	public Juego(){
		obsVivos = new ObstaculosVivos();
		articulosVivos = new ArticulosVivos();
		enemigosVivos = new EnemigosVivos();
		armamentosVivos = new ArmamentosVivos();
		fuegosvivos = new FuegosVivos();
		jugador = new Jugador(0,0);
		fabrica = new FabricadeNiveles();
		puerta = new Puerta();	
		
		fabrica.cargarNivel(this);

	}
	public Juego(String passnombrearchivo) {
		obsVivos = new ObstaculosVivos();
		articulosVivos = new ArticulosVivos();
		enemigosVivos = new EnemigosVivos();
		armamentosVivos = new ArmamentosVivos();
		fuegosvivos = new FuegosVivos();
		jugador = new Jugador(0,0);
		fabrica = new FabricadeNiveles();
		puerta = new Puerta();	
		
		try {
			this.recuperar(passnombrearchivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*********************MOVIMIENTO JUGADOR******************************/
	public void jugadorfijarDestinoDerecha() {jugador.fijarDestinoDerecha();}
	public void jugadorfijarDestinoIzquierda() {jugador.fijarDestinoIzquierda();}
	public void jugadorfijarDestinoAbajo() {jugador.fijarDestinoAbajo();}
	public void jugadorfijarDestinoArriba() {jugador.fijarDestinoArriba();}

	public boolean validarjugadorvida(){
		return (jugador.getvida()>0);}	

	public void moverJugador() {
		if (validarjugadorvida()){
			for(int i = 0; i < jugador.getvelocidad(); i++){
				mover(jugador);
			}	
		}
		jugador.setPasosEnCero();
	}
	/*********************FIN DE MOVIMIENTO JUGADOR******************************/


	/*********************MOVIMIENTO ENEMIGO******************************/
	private boolean validarenemigovida(Enemigo enemigo){
		return enemigo.getvida()>0;
	}
	
	public void moverEnemigos(){
		Enemigo enemigoActual;
		Iterator <Enemigo> it = enemigosVivos.Iterator();
		while(it.hasNext()){
			enemigoActual = it.next();
			if(validarenemigovida(enemigoActual)){		
				for(int j = 0; j < enemigoActual.getvelocidad(); j++){
					mover(enemigoActual);
				}
			}
		}
	}
	/*********************FIN MOVIMIENTO ENEMIGO******************************/


	/*********************PONER ARMAMENTOS ENEMIGO******************************/	
	public void EnemigosVivosponerArmamentos() {
		Iterator <Enemigo> it = enemigosVivos.Iterator();
		while(it.hasNext()){
			Enemigo enemigoTemporal = it.next();
			EnemigoponerArmamentos(enemigoTemporal);
		}
	}	

	public void EnemigoponerArmamentos(Enemigo enemigo) {
		if (enemigo.debePonerArmamento()){
			Armamento bomba = enemigo.ponerArmamento();
			Coordenadas coordbomba = bomba.get_coordenadas();
			if (validarDestinoDentroDelMapa(coordbomba)) armamentosVivos.agregar_proyectil(enemigo.ponerArmamento()); 
		}
	}
	/*********************FIN PONER ARMAMENTOS ENEMIGO******************************/


	/********************* PONER ARMAMENTOS JUGADOR******************************/
	public void jugadorponerBomba() {
		if(jugador.puedeponerbomba())
			if(jugador.getBuffActivo())armamentosVivos.agregar_proyectil(jugador.ponerBombaToleTole());
			else armamentosVivos.agregar_proyectil(jugador.ponerBombaMolotov());
	}
	/********************* FIN PONER ARMAMENTOS JUGADOR******************************/


	public void explotarArmamentos() {
		/*Explota los armamentos, por cada armamento q tiene q explotar crea 
		 * una explosion y la hace interactuar con todos los Vivos.*/
		Armamento armamentoTemporal;
		for (int i=0; i< armamentosVivos.getSize();i++){
			armamentoTemporal = armamentosVivos.get(i);
			if (armamentoTemporal.yaExploto()){
				Explosion tempexp = armamentoTemporal.explotar(obsVivos);
				tempexp.interactuar_con(obsVivos);
				tempexp.interactuar_con(jugador);
				tempexp.interactuar_con(enemigosVivos);
				tempexp.agregarAFuegosVivos(fuegosvivos);

				armamentosVivos.eliminar(armamentoTemporal);
			}			 
		}		
	}


	/**********************MOVIMIENTO GENERAL *******************************/
	public <U extends Elemento & Movible> void moverAlado(U e){
		Coordenadas nuevascoord = e.obtenerDestino();
		if (validarDestinoDentroDelMapa(nuevascoord) &&
				validarNoDiagonal(e, nuevascoord))
			e.mover(nuevascoord);
	}

	public  <U extends Elemento &  Movible> void mover(U e){
		Coordenadas nuevascoord = e.obtenerDestino();
		if (validarDestino(e,nuevascoord)) e.mover(nuevascoord);
	}

	private <U extends Elemento &  Movible> boolean validarDestino(U e, Coordenadas nuevascoord) {
		/* Decide si el destino es valido */
		if (validarDestinoAdyacente(e, nuevascoord) && 
			validarDestinoObstaculos(nuevascoord) &&
			validarDestinoDentroDelMapa(nuevascoord) &&
			validarDiferentes(e, nuevascoord) && 
			validarNoDiagonal(e, nuevascoord) &&
			validarVuelo(e)) {
			e.puedeSeguirCaminando();
			return true;
		}
		e.noPuedeSeguirCaminando();
		return false;

	}


	/* Si el elemento puede volar debe moverse de acuerdo
	 * a moverAlado y no se debe seguir haciendo validaciones.
	 */
	private <U extends Elemento &  Movible> boolean validarVuelo(U e){
		if (e.puedeVolar()){	
			moverAlado(e);
			return false;
		}
		return true;
	}


	private boolean validarDiferentes(Elemento e, Coordenadas nuevascoord){
		/*Verifica si es diferente a donde se quiere mover de donde esta*/
		return !e.get_coordenadas().equals(nuevascoord);
	}

	private boolean validarDestinoAdyacente(Elemento e,Coordenadas nuevascoord){
		/* Decide si el movimiento hacia un destino adyacente es legal. */
		int x, nuevax, y, nuevay;

		x = e.coordenadas.getx();
		y = e.coordenadas.gety();

		nuevax = nuevascoord.getx();
		nuevay = nuevascoord.gety();

		if ( (nuevax > x+jugador.getvelocidad()) || (nuevax < x-jugador.getvelocidad()) || (nuevay > y+jugador.getvelocidad()) || (nuevay < y-jugador.getvelocidad()) )	return false;

		return true;
	}


	private boolean validarDestinoDentroDelMapa(Coordenadas nuevacoord){
		/*Verifica si esta dentro del mapa el prox mov*/
		int nuevax, nuevay;

		nuevax = nuevacoord.getx();
		nuevay = nuevacoord.gety();

		if(nuevax < 0 || nuevax >= xMax || nuevay < 0 || nuevay >= yMax){ return false; }
		return true;		
	}


	private boolean validarDestinoObstaculos(Coordenadas nuevacoord){
		/*Validar el movimiento, verificando si no hay una pared*/		
		if(obsVivos!=null)return ! obsVivos.existeBloqueEn(nuevacoord);
		return true;
	}


	private boolean validarNoDiagonal(Elemento e, Coordenadas nuevacoord){

		/* Valida que no se esté moviendo en diagonal. */		
		int diferenciaX = nuevacoord.getx() - e.get_coordenadas().getx();
		int diferenciaY = nuevacoord.gety() - e.get_coordenadas().gety();
		int sumaDiferencias = diferenciaX + diferenciaY;

		//Si la suma es 2 significa que se está moviendo en diagonal. */
		if (sumaDiferencias > 2) return false;

		//Si el valor absoluto del movimiento en una coordenada es igual
		//al que quiere hacer en la otra se estará moviendo en diagonal
		if(Math.abs(diferenciaX) == Math.abs(diferenciaY)) return false;

		return true;		
	}
	/*********************FIN DE MOVIMIENTO GENERAL******************************/

	/**********************PERSITENCIA**************************/
    public Element guardar() {
        Element elemJuego = DocumentHelper.createElement("Juego");
        jugador.serializar(elemJuego);
        enemigosVivos.serializar(elemJuego);
        obsVivos.serializar(elemJuego);
        articulosVivos.serializar(elemJuego);
        armamentosVivos.serializar(elemJuego);
        //fuegosvivos.serializar(elemJuego);
        
        
        return elemJuego;
    }
    
    public  void recuperar(Element elemJuego) {
		fabrica.cargarNivelGuardado(elemJuego,this);
}    
    
    public void guardar(String archivo) throws IOException{
        Document doc = DocumentHelper.createDocument();
        doc.add(this.guardar());
        FileWriter writer = new FileWriter(archivo);
        doc.write( writer);
        writer.close();
        System.out.println("Juego Guardado");
    }

    public  void recuperar(String archivo) throws IOException{
        SAXReader reader = new SAXReader();
        try{
	        Document document = reader.read(archivo);
	        Element elemJuego = document.getRootElement();
	        recuperar(elemJuego);
	        System.out.println("Juego Cargado");
        }catch(DocumentException ex){
            throw new IOException();
        }
    }
    /**********************FIN DE PERSITENCIA**************************/	
	
	
	//getters
	public Jugador getJugador() {return jugador;}
	public ObstaculosVivos getObsVivos(){return obsVivos;}
	public EnemigosVivos getEnemigosVivos(){return enemigosVivos;}
	public ArticulosVivos getArticulosVivos(){return articulosVivos;}
	public ArmamentosVivos getArmamentosVivos(){return armamentosVivos;}
	public FuegosVivos getFuegosVivos(){return fuegosvivos;}
	public Puerta getPuerta() {return puerta;}
	public FabricadeNiveles getFabrica(){ return fabrica; }

}
