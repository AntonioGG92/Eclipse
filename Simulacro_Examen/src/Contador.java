package ej2;

public class Contador {
	private int cont;
	public Contador(){
	
	}
	public Contador(int num) {
		if(0<num) {
			cont = num;
		}
		else {
			cont = 0;
		}
	}
	public Contador(Contador miContador) {
		this.cont=miContador.getCont();
		
//		if(0<getCont()) {
//			Cont = getCont();}
//		else {
//			Cont =0;
//		}
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int numero) {
		this.cont = numero;
	}
	public void incrementar() {
		this.cont = getCont()+1;
	}
	public void decrementar() {
		// TODO Auto-generated method stub
		this.cont = getCont()+1;
	}
	
}
