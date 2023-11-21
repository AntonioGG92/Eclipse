import java.util.*;
public class Practica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe tu año de nacimiento ");
		
		int añonacimiento = leer.nextInt(); // guardamos en la variable añonacimiento el año indicado por el usuario */
		
		System.out.println("Escribe el año actual ");
		
		int añoactual = leer.nextInt(); // guardamos en otra variable el año indicado por el usuario */
		
		int edad = añoactual-añonacimiento; // hacemos la operacion de restar el año actual menos el año de nacimiento */
		
		System.out.println("La edad de la persona es : " + edad); // imprimimos la edad de la persona */
		
		leer.close();
	}

}
