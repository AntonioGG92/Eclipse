public class Ejercicio09 {

	public static void main(String[] args) {

		String[] notas = generarNotas(20);

		
		System.out.println("El resultado de las notas es:");

		mostrarNotas(notas);

		mostrarEstadisticas(notas);

		System.out.println();
	}

	public static String[] generarNotas(int cantidad) {
		String[] notas = new String[cantidad];
		for (int i = 0; i < cantidad; i++) {

			notas[i] = obtenerCalificacion((i % 5) + 1);
		}
		return notas;
	}

	public static String obtenerCalificacion(int valor) {
		return switch (valor) {
		case 1 -> "Suspenso";
		case 2 -> "Suficiente";
		case 3 -> "Bien";
		case 4 -> "Notable";
		case 5 -> "Sobresaliente";
		default -> "Error";
		};
	}

	public static void mostrarNotas(String[] notas) {
		for (String nota : notas) {
			System.out.println(nota);
		}
		
		System.out.println();
		
		System.out.println("la media total de las notas es: \n");
	}

	public static void mostrarEstadisticas(String[] notas) {
		
		for (String calificacion : new String[] { "Suspensos", "Suficientes", "Bienes", "Notables",
				"Sobresalientes" }) {
			System.out.println(
					calificacion + ": " + contarNotas(notas, calificacion.substring(0, calificacion.length() - 1)));
		}
	}

	public static int contarNotas(String[] notas, String notaBuscada) {
		int conteo = 0;
		for (String nota : notas) {
			if (nota.equals(notaBuscada)) {
				conteo++;
			}
		}
		return conteo;
	}
}