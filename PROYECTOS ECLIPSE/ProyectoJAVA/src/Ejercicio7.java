import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el número 1 para una pirámide rellena invertida y escribe el número 2 para una pirámide hueca invertida");
        int t = leer.nextInt();
        
        if (t == 1) {
            for (int i = 5; i >= 1; i--) {
                for (int j = 5; j > i; j--) {
                    System.out.print("   ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        } else if (t == 2) {
            int k = 5;
            int f = 0;
            int a;
            for (int i = 0; i <= 9; i = i + 2) {
                for (int j = 4; j >= 0 + k; j--) {
                    System.out.print("   ");
                }
                k--;
                a = 0;
                for (int c = 0; c < 9 - f; c++) {
                    if (a == 0 || i == 0 || c == 8 - f) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                    a++;
                }
                f = f + 2;
                System.out.println();
            }
        } else {
            System.out.println("Valor incorrecto");
        }
        leer.close();
    }
}
