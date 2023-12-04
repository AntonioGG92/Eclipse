package practicas_de_ejercicios;

public class Ejercicio09 {

	public static void main(String[] args) {

		// Genera 20 notas , si modificas la cantidad te dara resultado de la cantidad que quieras en el parentesis
		String[] notas = generarNotas(20);

		
		System.out.println("El resultado de las notas es:");

		// Muestra las notas generadas anteriormente
		mostrarNotas(notas);

		// Muestra la cantidad de suspensos, suficientes, bien, notables y
		// sobresalientes individualmente
		mostrarEstadisticas(notas);

		
		System.out.println();
	}

	// Genera las notas al azar
	public static String[] generarNotas(int cantidad) {
		String[] notas = new String[cantidad];
		for (int i = 0; i < cantidad; i++) {
			// Asigna aleatoriamente valores de 1 al 5, se podria haber hecho en funcion pero no me quedaba claro
			notas[i] = obtenerCalificacion((i % 5) + 1);
		}
		return notas;
	}

	// funcion con swith para declarar los tipos de notas
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

	// Muestra las notas
	public static void mostrarNotas(String[] notas) {
		for (String nota : notas) {
			System.out.println(nota);
		}
		
		System.out.println();
		
		System.out.println("la media total de las notas es: \n");
	}

	// Muestra las estadísticas
	public static void mostrarEstadisticas(String[] notas) {
		// Utiliza un bucle for y array para simplificar el resultado
		for (String calificacion : new String[] { "Suspensos", "Suficientes", "Bienes", "Notables",
				"Sobresalientes" }) {
			System.out.println(
					calificacion + ": " + contarNotas(notas, calificacion.substring(0, calificacion.length() - 1)));
		}
	}

	// Cuenta la cantidad de una determinada nota para cerrar el bucle y printear.
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