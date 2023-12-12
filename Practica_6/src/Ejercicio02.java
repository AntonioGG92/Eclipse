import java.util.*;
public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		
		int[][] numeros = new int[4][5];
		int[] sFila = new int[4];
		int[] sColumna = new int[6];

		generarNumerosAleatorios(numeros);

		imprimirTabla(numeros, sFila, sColumna);
	}

	public static int generarNumeroAleatorio() {
		return (int) (Math.random() * 100) + 100;
	}
	
	public static void generarNumerosAleatorios(int[][] numeros) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				numeros[i][j] = generarNumeroAleatorio();
			}
		}
	}

	public static void imprimirTabla(int[][] numeros, int[] sumaFila, int[] sumaColumna) {
		System.out.printf("%12s %10s %10s %10s %10s %10s %10s", "", "Columna 1", "Columna 2", "Columna 3", "Columna 4",
				"Columna 5", "Suma Fila");
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			if (i == 4) {
				System.out.printf("%12s", "Suma Columna");
			} else {
				System.out.printf("%12s", "Fila " + (i + 1));
			}
			for (int j = 0; j < 6; j++) {
				if (i == 4) {
					System.out.printf("%11d", sumaColumna[j]);
				} else if (j == 5) {
					System.out.printf("%11d", sumaFila[i]);
				} else {
					System.out.printf("%11d", numeros[i][j]);
				}
			}
			System.out.println("");
		
		}
	}
}