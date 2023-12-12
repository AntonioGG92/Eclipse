import java.util.*;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.print("Ingresa la posicion del alfil (de A-H): ");
		String pAlfil = leer.next();

		ArrayList movimientos = obtenerMovimientosAlfil(pAlfil);
		System.out.println("Los movimientos posibles del alfil en " + pAlfil + " son: ");
		mostrarMovimientos(movimientos);
	}

	public static ArrayList obtenerMovimientosAlfil(String posicion) {
		ArrayList movimientos = new ArrayList();

		int fila = obtenerFilaDesdePosicion(posicion);
		int columna = obtenerColumnaDesdePosicion(posicion);

		agregarMovimientosDiagonales(movimientos, fila, columna, -1, -1);

		agregarMovimientosDiagonales(movimientos, fila, columna, -1, 1);

		agregarMovimientosDiagonales(movimientos, fila, columna, 1, -1);

		agregarMovimientosDiagonales(movimientos, fila, columna, 1, 1);

		return movimientos;
	}

	public static void agregarMovimientosDiagonales(ArrayList movimientos, int fila, int columna, int filaIncremento,
			int columnaIncremento) {
		
		while (esCasillaValida(fila, columna)) {
		
			movimientos.add(convertirCoordenadasAPosicion(fila, columna));

			fila += filaIncremento;
			columna += columnaIncremento;
		}
	}

	public static boolean esCasillaValida(int fila, int columna) {
		return fila >= 1 && fila <= 8 && columna >= 1 && columna <= 8;
	}

	public static String convertirCoordenadasAPosicion(int fila, int columna) {
		char lColumna = (char) (columna - 1 + 'a');
		return lColumna + Integer.toString(fila);
	}

	public static int obtenerFilaDesdePosicion(String posicion) {
		return Character.getNumericValue(posicion.charAt(1));
	}

	public static int obtenerColumnaDesdePosicion(String posicion) {
		return posicion.charAt(0) - 'a' + 1;
	}

	public static void mostrarMovimientos(ArrayList movimientos) {
		for (Object movimiento : movimientos) {
			System.out.println(movimiento);
		}
	}
}
