import java.util.*;

public class Otro_Bi {

	public static void main(String[] args) {
	
		int[] numeros = new int[5];

		Set<Integer> numerosGenerados = new HashSet<>();
		
		// Bucle para generar un codigo al azar sin repetición
		for (int i = 0; i < numeros.length; i++) {
			int aleatorio;
			do {
				aleatorio = (int) (Math.random() * 100);
				numeros[i] = aleatorio;
			} while (numerosGenerados.contains(aleatorio));
		}
		
		// Impresion del primer array sin repetición
		System.out.println("Numeros sin ordenar");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		
		// Se ordena el array con un sort
		Arrays.sort(numeros);

		// Se crea un numero array donde guardaremos ya los numeros ordenados
		int[] nuevosNumeros = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			nuevosNumeros[i] = numeros[i];
		}

		// Por ultimo imprimos el array ordenado
		System.out.println("Numeros ordenados:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(nuevosNumeros[i] + " ");
		}
	}
}