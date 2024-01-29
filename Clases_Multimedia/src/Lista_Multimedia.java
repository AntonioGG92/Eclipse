import java.util.Arrays;

public class Lista_Multimedia extends Multimedia {
	private Multimedia [] miLista;
	private int capacidad;
	private int contador;
	
	public Lista_Multimedia(int capacidad) {
		this.capacidad=capacidad;
		this.miLista=new Multimedia[capacidad];
		this.contador=0;
	}
	public int size() {
		return contador;
	}
	public boolean add(Multimedia m) {
		if(contador<capacidad) {
			miLista[contador]= m;
			contador++;
			return true;
		}else {
			return false;
		}
	}
	public Multimedia get(int posicion) {
		
		return miLista[posicion];
	}
	
	public int indexOf(Multimedia m) {
		for(int i=0; i<capacidad; i++) {
			if(miLista[i].equals(m)) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public String toString() {
		return "Lista_Multimedia [miLista=" + Arrays.toString(miLista) + ", capacidad=" + capacidad + ", contador=" + contador + "]";
	}
	
}
