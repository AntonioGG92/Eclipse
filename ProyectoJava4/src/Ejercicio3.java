import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);

		int valor1;
		int valor2;
		int[] lista = new int[100];
		
		for(int i=0;i<lista.length;i++) {
			lista[i] = (int) (Math.random() *20);
			if((i+1)%10==0) {
				System.out.println("");
			}
		}
		System.out.println("Escribe un valor");
		valor1 = leer.nextInt();

		System.out.println("Escribe otro valor");
		valor2 = leer.nextInt();

		leer.close();

		for (int i=0;i<lista.length;i++) {
			if(lista[i] == valor1 & valor2<10) {
				System.out.println("'0" +valor2+ "'");
			}
			else if(lista[i] == valor1 & valor2>=10) {

			}
			else {
				System.out.print(" ");
				System.out.printf("%02d", lista[i]);
				System.out.print(" ");

			}
			if ((i+1)%10==0) {
				System.out.println(" ");
			}
		}

	}

}
