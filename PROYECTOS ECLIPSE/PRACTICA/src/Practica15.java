import java.util.*;

public class Practica15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime tu año de nacimiento: "); // preguntamos el año de nacimiento
		
		int añonacimiento = leer.nextInt(); // guardamos el dato en una variable
		
		System.out.println("Dime el año actual :"); // preguntamos el año actual
		
		int añoactual = leer.nextInt(); // guardamos el año actual en una variable
		
		int añosvividos = añoactual-añonacimiento; // hacemos el calculo de los años vividos por esa persona
		
		int diasvividos = añosvividos*365; // hacemos el calculo de los dias vividos por esa persona
		
		System.out.println("Los dias que esa persona lleva vivo son : " + diasvividos + " días."); // comunicamos los dias vividos al usuario
		
		leer.close();
	}

}
