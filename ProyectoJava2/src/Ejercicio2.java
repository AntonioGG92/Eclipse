import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

		System.out.println("Escribe un numero");

		int num = leer.nextInt();
		int h = num;
		int k = 2;
		for(int i =1; i <= num; i++) {
			for(int a = h; a > 0; a--) {
				System.out.print("    ");
			}
			h--;
			for(int b = 1; b < k; b++) {
				if (b<10) {
					System.out.print(" "+0+b+" ");
				}
				else {
					System.out.print(" "+b+" ");
				}
			}
			k = k+2;

			System.out.println("");

			leer.close();
		}

	}

}
