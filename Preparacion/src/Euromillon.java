import java.util.*;

public class Euromillon {

	public static void main(String[] args) {
		
		int [] numeros= new int [7];
		numeros(numeros);
		imprimir(numeros);
		
	}

	public static void numeros (int [] numeros) {
		
		Set<Integer> numGenerados= new HashSet<>();
		
		int aleatorio=0;
		
		for (int i=0;i<7;i++) {
		
				if(i<5) {
					do {
				aleatorio=(int)(Math.random()*50);
			}while(numGenerados.contains(aleatorio));
		}else if(i==5 || i==6){
			do {
			aleatorio=(int)(Math.random()*13);
			}while(numGenerados.contains(aleatorio));
			}numeros[i]=aleatorio;
		numGenerados.add(aleatorio);
		}
		
		Arrays.sort(numeros,0,5);
		
	}
	
	public static void imprimir (int [] numeros) {
		System.out.println("Numeros del euromillon:");
		System.out.println();
		for (int i=0; i<7; i++) {
			
			if(i<4) {
				System.out.print(numeros[i] + " - ");
			}else if(i==4) {
				System.out.println(numeros[i]);
			}
		else if(i==5){
				System.out.println();
				System.out.println("Estrella " + (i-4)+": " + numeros[i]);
			}else {
				System.out.println("Estrella " + (i-4)+": " + numeros[i]);
			}
		}
	}
}
