package PooMultimediaArray;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaMultimedia extends Multimedia{

	private int maximo;
	private ArrayList <Multimedia> Lista;
	
	
	
	public ListaMultimedia(int maximo) {
		
		this.maximo = maximo;
		Lista = new ArrayList<Multimedia>();
		
	}


	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public ArrayList<Multimedia> getLista() {
		return Lista;
	}

	

	
	public void setLista(ArrayList<Multimedia> lista) {
		Lista = lista;
	}
	


	public Multimedia indexOf(int pos) {
		return Lista.get(pos);
		
	}
	
	
	public boolean capacidad() {
		boolean sitio=false;
		
		if(Lista.size()<maximo) {
			sitio=true;
		}
		
		return sitio;
	}

}
