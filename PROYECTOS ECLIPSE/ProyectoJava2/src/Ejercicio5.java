import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);

		System.out.println("Escribe un numero natural :");

		int num = leer.nextInt();

		int a;

		long par = 0;

		int b = 1;

		while (num>0) {
			a=num%10;
			if(a%2==0 & a!=0) {

				par = par + (a*b);
				b = b*10;
			}
			num = num/10;
		}
		System.out.println("Los numeros pares son : " +par);

		leer.close();
	}

}
