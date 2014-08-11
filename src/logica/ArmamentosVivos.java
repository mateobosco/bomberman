package logica;

import java.util.Iterator;
import java.util.Vector;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class ArmamentosVivos {

	static Vector<Armamento> proyectiles;

	public ArmamentosVivos() {
		proyectiles = new Vector<Armamento>();
	}

	public void agregar_proyectil(Armamento armamento) {
		proyectiles.add(armamento);
	}

	public int getSize() {
		return proyectiles.size();
	}

	public void eliminar(Armamento armamentotemporal) {
		proyectiles.remove(armamentotemporal);
	}

	/* Cuenta el tiempo que lleva cada armamento. */
	public void contarTiempo() {
		for(int i = 0; i < proyectiles.size(); i++){
			proyectiles.elementAt(i).contarTiempo();
		}
	}
	
	/* Devuelve true si todos los armamentos ya explotaron
	 * o false en caso contrario. */
	public boolean yaExplotaronTodos() {
		for(int i = 0; i < proyectiles.size(); i++) {
			if(!proyectiles.get(i).yaExploto()) return false;
		}
		return true;
	}

	public void serializar(Element elemJuego) {
        Element elemArmaVivos =DocumentHelper.createElement("ArmamentosVivos");
        elemJuego.add(elemArmaVivos);
        Iterator it = iterator();
        while(it.hasNext()){
            Armamento temp = (Armamento)it.next();
            elemArmaVivos.add(temp.serializar());
        }		
	}

	public Iterator <Armamento> iterator() {
		return proyectiles.iterator();
	}

	public Armamento get(int i) {
		return proyectiles.elementAt(i);
	}
}
