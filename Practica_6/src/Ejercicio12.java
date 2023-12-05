import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		int[] combi = { 1, 0, 1, 2 };

		System.out.println("Bienvenido al sistema de control de acceso a la caja fuerte.");

		for (int intento = 1; intento <= 4; intento++) {
			System.out.print("Introduce la combinacion (4 números de una sola cifra): ");
			int[] intentoUsuario = obtenerCombinacionUsuario(leer);

			if (compararCombinaciones(combi, intentoUsuario)) {
				System.out.println("Caja fuerte abierta!");
				break;
			} else {
				System.out.println("Combinacion incorrecta. Intento " + intento + " de 4.");
			}
		}

		System.out.println("Fin del programa.");

		leer.close();
	}

	public static int[] obtenerCombinacionUsuario(Scanner scanner) {
		int[] combiUsuario = new int[4];

		for (int i = 0; i < 4; i++) {
			combiUsuario[i] = scanner.nextInt();
		}

		return combiUsuario;
	}

	public static boolean compararCombinaciones(int[] combinacion1, int[] combinacion2) {
		for (int i = 0; i < 4; i++) {
			if (combinacion1[i] != combinacion2[i]) {
				return false;
			}
		}

		return true;
	}
}
