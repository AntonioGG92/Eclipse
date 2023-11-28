import java.util.*;
public class Practica10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime la cantidad de KW consumidos ");
		
		double kw = leer.nextDouble(); // guardamos en una variable la cantidad de KW introducidos por el usuario */
		
		System.out.println("Dime el precio del KW ");
		
		double precio = leer.nextDouble(); // guardamos el precio del KW introducido por el usuario */
		
		double preciototal = kw*precio; // hacemos el calculo matematico para saber el precio de los kW y guardarlos en una variable */
		
		System.out.println("El precio de su consumo en KW es de " + preciototal + " EUROS ");
		
		leer.close();
	}

}
