package practicas_de_ejercicios;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] numeros = generarNumerosAleatorios(100, 0, 20);

	        // Muestra los números generados
	        System.out.println("Números generados:");
	        mostrarNumeros(numeros);

	        // pide por teclado los valores
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el primer valor a cambiar: ");
	        int primerValor = scanner.nextInt();
	        System.out.print("Ingrese el segundo valor: ");
	        int segundoValor = scanner.nextInt();

	        // Cambia el primer valor por el segundo
	        cambiarValores(numeros, primerValor, segundoValor);

	        // printea la lista de cambios
	        System.out.println("Lista con cambios:");
	        mostrarNumeros(numeros);
	    }

	    public static int[] generarNumerosAleatorios(int cantidad, int min, int max) {
	        int[] numeros = new int[cantidad];
	        Random rand = new Random();
	        for (int i = 0; i < cantidad; i++) {
	            numeros[i] = rand.nextInt(max - min + 1) + min;
	        }
	        return numeros;
	    }

	    public static void mostrarNumeros(int[] numeros) {
	        for (int numero : numeros) {
	            System.out.print(numero + " ");
	        }
	        System.out.println();
	    }

	    public static void cambiarValores(int[] numeros, int primerValor, int segundoValor) {
	        for (int i = 0; i < numeros.length; i++) {
	            if (numeros[i] == primerValor) {
	                numeros[i] = segundoValor;
	                System.out.print("'" + primerValor + "' ");
	            } else {
	                System.out.print(numeros[i] + " ");
	            }
	        }
	        System.out.println();
	    }
	}
	


