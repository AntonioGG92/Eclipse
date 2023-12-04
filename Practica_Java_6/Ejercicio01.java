package practicas_de_ejercicios;
import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[4][5];
        int[] sumaFila = new int[4];
        int[] sumaColumna = new int[6];

        // Pide al usuario los datos
        pedirNumeros(scanner, numeros, sumaFila, sumaColumna);

        // imprime las filas y columnas  del array
        imprimirTabla(numeros, sumaFila, sumaColumna);
    }

    // Función para pedir números al usuario
    public static void pedirNumeros(Scanner scanner, int[][] numeros, int[] sumaFila, int[] sumaColumna) {
        System.out.println("Escribe 20 numeros.");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Introduce el numero de la fila " + (i + 1) + " y la columna " + (j + 1) + ": ");
                numeros[i][j] = scanner.nextInt();
                sumaColumna[5] += numeros[i][j];
                sumaFila[i] += numeros[i][j];
                sumaColumna[j] += numeros[i][j];
            }
        }
    }

    // Función para imprimir la tabla de filas y columnas
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


