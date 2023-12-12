import java.util.*;

public class Bonoloto {

	public static void main(String[] args) {
	
		int [] numeros= new int [6];
		
		numeros(numeros);
		imprimir(numeros);
	}

	
	public static void numeros (int [] numeros) {
		
		Set<Integer> numGenerados= new HashSet<>();
		int aleatorios;
		
		for (int i=0;i<6;i++) {
			
			do {
				aleatorios=(int)(Math.random()*50);
			}while(numGenerados.contains(aleatorios));
		numeros[i]=aleatorios;
		numGenerados.add(aleatorios);
		}
		
		Arrays.sort(numeros);
		}

	public static void imprimir (int [] numeros) {
		System.out.println("Numeros de la bonoloto:");
		System.out.println();
		for (int i=0;i<6;i++) {
			if(i==5) {
				System.out.println(numeros[i]);
			}else {
			System.out.print(numeros[i] + " - ");
			}
		}
	
	System.out.println("------------------------------");
}
}