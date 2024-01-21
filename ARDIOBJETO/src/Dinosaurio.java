
public class Dinosaurio {

public String nombre;	
	public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
	public int vida;
	public int peso;
	public int biteforce;
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getBiteforce() {
		return biteforce;
	}
	public void setBiteforce(int biteforce) {
		this.biteforce = biteforce;
	}
	
	public Dinosaurio(String nombre, int vida, int peso, int biteforce) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.peso = peso;
		this.biteforce = biteforce;
	}
	public Dinosaurio() {
		super();
	}
	
}
