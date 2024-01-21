package ejercicio3;

public class Lavadora extends Electrodomestico {
	private int carga;
	private final int cargaDefecto = 5;

	public Lavadora() {
		super();
		this.carga = cargaDefecto;
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = cargaDefecto;
	}

	public Lavadora(int precioBase,int peso, int carga, String color, char consumoEnergetico) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getCargaDefecto() {
		return cargaDefecto;
	}
	
	@Override
	public int precioFinal() {
		int precioFinal=super.precioFinal();
		if(carga>30) {
			precioFinal += 50;
			
		}
		return precioFinal;
		
		
	}
	
	
}
