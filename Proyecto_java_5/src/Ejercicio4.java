import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int filas = 6;
		int columnas = 10;
		int[][] numeros = new int[filas][columnas];
		
		Set<Integer> numerosgenerados = new HashSet<>();

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				int numeroaleatorio;

				do {
					numeroaleatorio = (int) (Math.random() * 60);
				} while (numerosgenerados.contains(numeroaleatorio));

				numeros[i][j] = numeroaleatorio;
				numerosgenerados.add(numeroaleatorio);
			}
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.println();
		}
	}
}