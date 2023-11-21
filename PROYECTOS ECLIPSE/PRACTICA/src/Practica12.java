import java.util.*;
public class Practica12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime tu sueldo del mes "); // Preguntamos el sueldo mensual
		
		double sueldomes = leer.nextDouble(); // guardar el suelto del mes en una variable
		
		double sueldosemana = sueldomes/4; //calculamos el sueldo semanal
		
		double ahorrosemana = sueldosemana*0.15; // aplicamos el ahorro semanal y lo guardamos en una variable
		
		double ahorroanual = ahorrosemana*52; // el ahorro semanal se multiplica por las semanas de un año para saber al ahorro anual
		
		
		System.out.println("Tu ahorro anual es de : " + ahorroanual + " EUROS "); // comunicamos al usuario el ahorro anual
		
		leer.close();
	}

}
