import java.util.*;
import java.util.Random;
public class Ejercicio06 {

	
	    public static void main(String[] args) {
	     
	        int[] NUMERO = new int[20];
	        int[] CUADRADO = new int[20];
	        int[] CUBO = new int[20];

	        cargarArrayAleatorio(NUMERO, 1, 100);

	        cargarCuadrados(NUMERO, CUADRADO);

	        cargarCubos(NUMERO, CUBO);

	        mostrarArrays(NUMERO, CUADRADO, CUBO);
	    }

	    public static void cargarArrayAleatorio(int[] array, int min, int max) {
	        Random rand = new Random();
	        for (int i = 0; i < array.length; i++) {
	            array[i] = rand.nextInt(max - min + 1) + min;
	        }
	    }

	    public static void cargarCuadrados(int[] original, int[] cuadrados) {
	        for (int i = 0; i < original.length; i++) {
	            cuadrados[i] = original[i] * original[i];
	        }
	    }

	    public static void cargarCubos(int[] original, int[] cubos) {
	        for (int i = 0; i < original.length; i++) {
	            cubos[i] = original[i] * original[i] * original[i];
	        }
	    }

	    public static void mostrarArrays(int[] array1, int[] array2, int[] array3) {
	        System.out.printf("%-15s%-15s%s%n", "NUMERO", "CUADRADO", "CUBO");
	        for (int i = 0; i < array1.length; i++) {
	            System.out.printf("%-15d%-15d%d%n", array1[i], array2[i], array3[i]);
	        }
	    }
	}