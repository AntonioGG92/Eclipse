public class Trodon extends Dinosaurio {

	public int alturasalto;
	

	public Trodon () {
		super.nombre="Trodon";
		super.peso=60;
		super.vida=60;
		super.biteforce=20;
		this.alturasalto=2;
		
	}


	public int getAlturasalto() {
		return alturasalto;
	}


	public void setAlturasalto(int alturasalto) {
		this.alturasalto = alturasalto;
	}
}