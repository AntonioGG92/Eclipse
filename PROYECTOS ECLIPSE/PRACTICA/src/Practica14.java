import java.util.*;
public class Practica14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime un lado del cuadrado ");
		
		double lado1 = leer.nextDouble();
		
		System.out.println("Dime el otro lado del cuadrado ");
		
		double lado2 = leer.nextDouble();
		
		double area = lado1*lado2;
		
		System.out.println("El área del cuadrado es : " + area);
		
		leer.close();
	}

}
