package ej3;

public class Electrodomestico {
	
	private double preciobase;
	private String color;
	private char consumo;
	private double peso;
	
	public Electrodomestico() {
		preciobase = 100;
		color = "blanco";
		this.consumo = 'F';
		peso = 5;
	}
	
	public Electrodomestico(double preciobase, java.lang.String color, char consumo, double peso) {
		this.preciobase = preciobase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}
	public double getPreciobase() {
		return preciobase;
	}
	public void setPreciobase(double preciobase) {
		this.preciobase = preciobase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getString() {
		return consumo;
	}
	public void setString(char consumo) {
		this.consumo = consumo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
