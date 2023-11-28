import java.util.*;
public class Practica_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingresa en numeros tu edad."); // preguntamos la edad
		
		int edad = leer.nextInt(); // guardamos la edad en una variable
		
		if (edad>=18) { // si tiene 18 años o mas 
			
			System.out.println("Puedes Votar en las proximas elecciones. "); // puede votar
		}
		else { //si no tiene 18 años o mas 
			
			System.out.println("No puedes Votar en las proximas elecciones. "); // no puede votar
			
			leer.close();
		}
		 
		
		
	}

}
