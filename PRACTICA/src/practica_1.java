import java.util.*;

public class practica_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime la base del triángulo: ");
		
		int base = leer.nextInt(); //Almacenamos la base introducida por el usuario */
		
		System.out.println("Dime la altura del triangulo: ");
		
		int altura = leer.nextInt(); // Almacenamos la altura introducida por el usuario */
		
		int area = (base*altura)/2; // Decimos que el area es igual a la base por la altura entre 2 */
		
		System.out.println("El área del triángulo es: " + area);
		
		leer.close();
	}

}
