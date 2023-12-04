package practicas_de_ejercicios;
import java.util.Scanner;
public class Ejercicio08 {

	public static void main(String[] args) {
		  // Pide la temperatura media de cada mes
        int[] temperaturas = pedirTemperaturas();

        // Muestra al final del printeo de consola el diagrama de barras horizontales
        mostrarDiagrama(temperaturas);
    }

    // Función para pedir las temperaturas de cada mes
    public static int[] pedirTemperaturas() {
        Scanner scanner = new Scanner(System.in);
        int[] temperaturas = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese la temperatura media del mes " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextInt();
        }

        return temperaturas;
    }

    // Función para mostrar el diagrama de barras horizontales
    public static void mostrarDiagrama(int[] temperaturas) {
        System.out.println("Diagrama de Barras Horizontales:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Mes " + (i + 1) + ": ");
            dibujarBarra(temperaturas[i]);
        }
    }

    // Función para dibujar barra de lineas.
    public static void dibujarBarra(int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}