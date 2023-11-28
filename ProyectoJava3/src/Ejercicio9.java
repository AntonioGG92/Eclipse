import java.util.*;

public class Ejercicio9 {

	private static final int NUMERO_SECRETO = 50;
	private static int INTENTOS = 5;
	private static int MAXIMO = 100;
	private static int MINIMO = 0;

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		int numeroAleatorio = 0;

		while (NUMERO_SECRETO != numeroAleatorio && INTENTOS != 0) {
			numeroAleatorio = (int) (Math.random() * (MAXIMO - MINIMO) + MINIMO);

			if (numeroAleatorio < NUMERO_SECRETO) {
				MINIMO = numeroAleatorio;
				System.out.println("El número " + numeroAleatorio + " es menor al número secreto. Te quedan: " + INTENTOS + " intentos.");

			}else if (numeroAleatorio > NUMERO_SECRETO) {
				MAXIMO = numeroAleatorio;
				System.out.println("El número " + numeroAleatorio + " es mayor al número secreto. Te quedan:" + INTENTOS + " intentos.");

			}else {
				System.out.println("Has adivinado el número!, el número secreto era : " + numeroAleatorio);

			}
			INTENTOS--;
		}
		if (numeroAleatorio != NUMERO_SECRETO) {
			System.out.println("La máquina no ha podido adivinar tu número secreto. ");
		}else {
			System.out.println("La máquina ha acertado tu número secreto. ");

			leer.close();
		}
	}
}    