package ejercicio3;

public class Electrodomestico {

	private int precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;

	private final int precioBaseDefault = 100;
	private final String colorDefault = "Blanco";
	private final char consumoEnergeticoDefault = 'F';
	private final int pesoDefault = 5;

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPrecioBaseDefault() {
		return precioBaseDefault;
	}

	public String getColorDefault() {
		return colorDefault;
	}

	public char getConsumoEnergeticoDefault() {
		return consumoEnergeticoDefault;
	}

	public int getPesoDefault() {
		return pesoDefault;
	}

	public Electrodomestico() {
		this.precioBase=precioBaseDefault;
		this.peso=pesoDefault;
		this.color=colorDefault;
		this.consumoEnergetico=consumoEnergeticoDefault;
		}

	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = getColorDefault();
		this.consumoEnergetico = getConsumoEnergeticoDefault();
	
		
	}

	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
	
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		
	}

	
	public String comprobarColor(String color) {

		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };

		for (int i = 0; i < colores.length; i++) {
			if (colores[i].equalsIgnoreCase(color)) {
				return colores[i];
			}
		}
		return "Tu color sera Blanco";

	}

	public int precioFinal() {
		
		int precioFinal=precioBase;
		switch (consumoEnergetico) {
		case 'A':
			precioFinal += 100;
			break;

		case 'B':
			precioFinal += 80;
			break;

		case 'C':
			precioFinal += 60;
			break;

		case 'D':
			precioFinal += 50;
			break;

		case 'E':
			precioFinal += 30;
			break;

		case 'F':
			precioFinal += 10;
			break;
		}
		if(peso >=0 && peso <=19) {
			precioFinal +=10;
		}else if(peso >=20 && peso <=49) {
			precioFinal +=50;
		}else if(peso >=50 && peso <=79) {
			precioFinal +=80;
		}else if(peso >=80) {
			precioFinal +=100;
		}
		
		return precioFinal;
	}

	
		
}
