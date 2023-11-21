import java.util.*;
public class Practica7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime cuantos km vas a recorrer");
		
		int km = leer.nextInt(); //guardamos la variable introducida por el usuario en km*/
		
		System.out.println("Dime cuanto es el coste por km");
		
		double costekm = leer.nextDouble();// guardamos la variable introducida por el usuario en costekm*/
		
		double costetotal = km*costekm; //calculamos el coste total */
		
		System.out.println("El coste de su billete es de : " + costetotal + " EUROS ");
		
		leer.close();
		
	}

}
