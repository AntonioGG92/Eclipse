import java.util.*;

public class Practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime la cantidad de euros que quieres cambiar: ");
		
		double euros = leer.nextInt(); // guardamos los euros introducidos por el usuario*/
		
		double dolares = euros*1.09; // decimos que los dolares son igual a la cantidad de euros por 1.09 que es el valor del dolar en este momento */
		
		System.out.println("Su cantidad de dolares es: " + dolares);
		
		
		leer.close();
	}

}
