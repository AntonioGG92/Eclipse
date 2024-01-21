
public class Utha extends Dinosaurio {

	public int alturasalto;
	

	public Utha () {
		super.nombre="Utha";
		super.peso=500;
		super.vida=500;
		super.biteforce=50;
		this.alturasalto=2;
		
	}


	public int getAlturasalto() {
		return alturasalto;
	}


	public void setAlturasalto(int alturasalto) {
		this.alturasalto = alturasalto;
	}
}
