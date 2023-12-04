package practicas_de_ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicita al usuario la posición del alfil
		System.out.print("Ingresa la posicion del alfil (de a-h): ");
		String posicionAlfil = scanner.next();

		// Obtiene y muestra los movimientos posibles del alfil
		ArrayList movimientos = obtenerMovimientosAlfil(posicionAlfil);
		System.out.println("Los movimientos posibles del alfil en " + posicionAlfil + " son: ");
		mostrarMovimientos(movimientos);
	}

	// Funcion para obtener los movimientos posibles del alfil
	public static ArrayList obtenerMovimientosAlfil(String posicion) {
		ArrayList movimientos = new ArrayList();

		// Obtiene la posicion en forma de  coordenadas (fila, columna)
		int fila = obtenerFilaDesdePosicion(posicion);
		int columna = obtenerColumnaDesdePosicion(posicion);

		// Calcula movimientos en diagonal superior izquierda
		agregarMovimientosDiagonales(movimientos, fila, columna, -1, -1);

		// Calcula movimientos en diagonal superior derecha
		agregarMovimientosDiagonales(movimientos, fila, columna, -1, 1);

		// Calcula movimientos en diagonal inferior izquierda
		agregarMovimientosDiagonales(movimientos, fila, columna, 1, -1);

		// Calcula movimientos en diagonal inferior derecha
		agregarMovimientosDiagonales(movimientos, fila, columna, 1, 1);

		return movimientos;
	}

	// Funcion  para agregar movimientos en una dirección diagonal
	public static void agregarMovimientosDiagonales(ArrayList movimientos, int fila, int columna, int filaIncremento,
			int columnaIncremento) {
		// Iterar a lo largo de la diagonal hasta llegar al borde del tablero
		while (esCasillaValida(fila, columna)) {
			// Agregar la posición a la lista de movimientos
			movimientos.add(convertirCoordenadasAPosicion(fila, columna));

			// Mover a la siguiente casilla en la diagonal
			fila += filaIncremento;
			columna += columnaIncremento;
		}
	}

	// Funcion  para verificar si una casilla es valida en el tablero de
	// ajedrez
	public static boolean esCasillaValida(int fila, int columna) {
		return fila >= 1 && fila <= 8 && columna >= 1 && columna <= 8;
	}

	// Funcion para convertir coordenadas a una posicion en el tablero
	public static String convertirCoordenadasAPosicion(int fila, int columna) {
		char letraColumna = (char) (columna - 1 + 'a');
		return letraColumna + Integer.toString(fila);
	}

	// Funcion  para obtener la fila desde una posicion en el tablero
	public static int obtenerFilaDesdePosicion(String posicion) {
		return Character.getNumericValue(posicion.charAt(1));
	}

	// Funcion  para obtener la columna desde una posición en el tablero
	public static int obtenerColumnaDesdePosicion(String posicion) {
		return posicion.charAt(0) - 'a' + 1;
	}

	// Función  para mostrar los movimientos en la consola
	public static void mostrarMovimientos(ArrayList movimientos) {
		for (Object movimiento : movimientos) {
			System.out.println(movimiento);
		}
	}
}
