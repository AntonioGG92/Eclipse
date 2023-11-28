import java.util.Scanner;

public class sfdasfd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la base de la pirámide: ");
        int base = leer.nextInt();
        leer.close();

        // Pirámide rellena de asteriscos
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= base - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pirámide invertida con bordes de asteriscos
        for (int i = base - 1; i >= 1; i--) {
            for (int j = 1; j <= base - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

	}


