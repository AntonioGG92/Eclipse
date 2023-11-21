import java.util.Scanner;

public class EjerciciosPropuestos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		double a;
		a = leer.nextDouble();
		double b;
		b = leer.nextDouble();
		double c;
		c = leer.nextDouble();
		double sol;
		sol = Math.sqrt(Math.pow(b,2)-(4*c*a));
		if (sol > 0) {
		double Sol1 = (-b+Math.sqrt(sol))/(2*a);
		double Sol2 = (-b+Math.sqrt(sol))/(2*a);
		System.out.println(Sol1);
		System.out.println(Sol2);
	} else{ 
		System.out.println("No tiene Solucion");
	}
	
		leer.close();		

	}

}
