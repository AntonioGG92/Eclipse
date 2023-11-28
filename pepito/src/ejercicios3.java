import java.util.Scanner;

public class ejercicios3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner leer = new Scanner(System.in);
	        System.out.print("Ingrese el tamaño de la base de la pirámide: ");
	        int tamanobase = leer.nextInt();
	        leer.close();

	        for (int i = 1; i <= tamanobase; i++) {
	            for (int j = 1; j <= tamanobase - i; j++) {
	                System.out.print(" ");
	            }

	            if (i == 1 || i == tamanobase) {
	                for (int k = 1; k <= 2 * i - 1; k++) {
	                    System.out.print("*");
	                }
	            } else {
	                System.out.print("*");
	                for (int k = 1; k <= 2 * (i - 1) - 1; k++) {
	                    System.out.print(" ");
	                }
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
	

	}


