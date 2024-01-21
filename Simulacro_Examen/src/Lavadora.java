package ej3;

public class Lavadora extends Electrodomestico{
	private int carga;
	
	public Lavadora() {
		this.carga = 5;
	}
	public Lavadora(int carga) {
		this.carga =carga;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
}
