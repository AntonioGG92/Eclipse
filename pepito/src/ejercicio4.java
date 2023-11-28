import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		double a;
		a = leer.nextInt();
		double b;
		b = leer.nextInt();
		double c;
		c = leer.nextInt();
		double d;
		d = leer.nextInt();
		double r = 2;
		r = leer.nextInt();
		double cuenta;
		cuenta = leer.nextInt();	   
		
		cuenta = ( 4/(3*(r+34))-9*(a+b*c)+(3+d*(2+a))/(a+b*d));
		
		System.out.println(cuenta); 
		
		

	}

}
