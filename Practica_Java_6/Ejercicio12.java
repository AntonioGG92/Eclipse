package practicas_de_ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Combinación de la caja fuerte
		int[] combinacion = { 1, 0, 1, 2 };

		System.out.println("Bienvenido al sistema de control de acceso a la caja fuerte.");

		// bucle de hasta 4 intentos
		for (int intento = 1; intento <= 4; intento++) {
			System.out.print("Introduce la combinacion (4 números de una sola cifra): ");
			int[] intentoUsuario = obtenerCombinacionUsuario(scanner);

			// Verifica si la combinación es correcta
			if (compararCombinaciones(combinacion, intentoUsuario)) {
				System.out.println("Caja fuerte abierta!");
				break;
			} else {
				System.out.println("Combinacion incorrecta. Intento " + intento + " de 4.");
			}
		}

		System.out.println("Fin del programa.");

		scanner.close();
	}

	// Función para obtener la combinación ingresada por el usuario
	public static int[] obtenerCombinacionUsuario(Scanner scanner) {
		int[] combinacionUsuario = new int[4];

		for (int i = 0; i < 4; i++) {
			combinacionUsuario[i] = scanner.nextInt();
		}

		return combinacionUsuario;
	}

	// Función para comparar dos combinaciones introducidas con la principal.
	public static boolean compararCombinaciones(int[] combinacion1, int[] combinacion2) {
		for (int i = 0; i < 4; i++) {
			if (combinacion1[i] != combinacion2[i]) {
				return false;
			}
		}

		return true;
	}
}
