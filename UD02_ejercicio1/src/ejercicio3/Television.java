package ejercicio3;

public class Television extends Electrodomestico{

	private double pulgadas;
	private boolean TDT;
	private final double pulgadasDefault=20;
	private final boolean TDTDefault=false;
	
public Television() {
	super();
	this.pulgadas=pulgadasDefault;
	this.TDT=TDTDefault;
}

public Television(int precioBase, int peso) {
	super(precioBase,peso);
	this.pulgadas=pulgadasDefault;
	this.TDT=TDTDefault;
}


public Television(int precioBase, String color, char consumoEnergetico, int peso, int pulgadas, boolean TDT) {
	super(precioBase,color,consumoEnergetico,peso);
	this.pulgadas=pulgadas;
	this.TDT=TDT;
}

public double getPulgadas() {
	return pulgadas;
}

public boolean isTDT() {
	return TDT;
}



@Override
public int precioFinal() {
	int precioFinal=super.precioFinal();
	if(pulgadas>40) {
		precioFinal *=1.3;
	}
	if(TDT==true) {
		precioFinal += 50;
		
	}
	return precioFinal;
}
}
