import java.util.*;
public class Practica8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime en minutos el tiempo de duracion de la llamada ");
		 
		int duracion = leer.nextInt();// guardamos en una variable llamada duracion el tiempo introducido por el usuario */
		
		System.out.println("Dime el precio por minuto de llamada ");
		 
		double precio = leer.nextDouble(); // guardamos en una variable llamada precio el dinero que cuesta por minuto la llamada */
		
		double preciototal = duracion*precio; // hacemos la operacion matematica para saber el resultado */
		
		System.out.println("El precio de tu llamada es de :" + preciototal + " EUROS ");
		
		leer.close();
	}

}
