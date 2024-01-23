package Nif;

import java.util.Scanner;

public class Nif {

	private int numero;
	private char letra;

	public Nif() {

	}

	public Nif(int numero) {
		this.numero=numero;

	}

	public char leer() {
		int numerodado;
		Scanner leer = new Scanner(System.in);

		System.out.println("Por favor, introduce tu numero de DNI");
		numerodado=leer.nextInt();

		return letra;
	}
}
