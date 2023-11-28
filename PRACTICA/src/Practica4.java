import java.util.*;
public class Practica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Cuantas horas vas a estar en la habitación? ");
			
		double horas = leer.nextDouble(); //guardamos en una variable de tipo double las horas ingresadas por el usuario */
		
		int euros=4; // decimos que el precio por hora son 4 euros */
		
		double tarifa = horas*euros; //hacemos el problema matematico de multiplicar horas por euros */
		
		System.out.println("El precio de la habitacion es: " + tarifa + " EUROS ");
		
		leer.close();
	} 

}
