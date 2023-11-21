import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		int[] temperatura = new int[12];
		
		for (int i=0;i<temperatura.length;i++) {
			System.out.println("Dime la temperatura media del mes " + (i+1));
			temperatura [i] = leer.nextInt();
		}
		for (int i=0;i<temperatura.length;i++) {
			System.out.println("_____________________________________________________________");
			System.out.println("");
			System.out.println("Mes ");
			System.out.printf("%02d | ", (i+1));
			for (int a=0;a<temperatura[i];a++) {
				System.out.print("*");
			}
			System.out.println("");
		}
			leer.close();
			
			System.out.println("______________________________________________________________");
	}

}
