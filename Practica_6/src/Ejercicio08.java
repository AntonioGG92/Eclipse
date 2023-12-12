import java.util.*;

public class Ejercicio08 {

	public static void main(String[] args) {

        int[] temperaturas = pedirTemperaturas();


        mostrarDiagrama(temperaturas);
    }

    public static int[] pedirTemperaturas() {
    	
        Scanner leer = new Scanner(System.in);
        
        int[] temperaturas = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese la temperatura media del mes " + (i + 1) + ": ");
            temperaturas[i] = leer.nextInt();
        }

        return temperaturas;
    }
    
    public static void mostrarDiagrama(int[] temperaturas) {
        System.out.println("Diagrama de Barras Horizontales:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Mes " + (i + 1) + ": ");
            dibujarBarra(temperaturas[i]);
        }
    }

    public static void dibujarBarra(int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}