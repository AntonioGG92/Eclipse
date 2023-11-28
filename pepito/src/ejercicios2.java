import java.util.Scanner;

public class ejercicios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		System.err.println("Escribe el año");
		int Anyo = leer.nextInt();
		if (Anyo%4 == 0 & Anyo%100!=0) {
		System.out.println("Es bisiesto el año" + Anyo);
		}
		else if (Anyo%400 == 0) {

			System.out.println("Es bisiesto el año " + Anyo); }
			else {
				System.out.println("No es bisiesto el año" + Anyo); }
		leer.close(); }
}


