import java.util.*;
public class Practica5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime el número de metros cuadrados que hay que pintar :");
		
		int metros2 = leer.nextInt(); // guardamos en una variable el numero de metros a pintar para el cliente */
		
		int preciopormetro = 2; // guardamos en una variable el precio por metro cuadrado */
		
		int costetotal; //declaramos una variable que sera el precio total por los metros a pintar */
		
		costetotal = metros2*preciopormetro; // multiplicamos los metros por el precio */
		
		System.out.println("El coste total es de : " + costetotal + " EUROS ");
		
		leer.close();
	}

}
