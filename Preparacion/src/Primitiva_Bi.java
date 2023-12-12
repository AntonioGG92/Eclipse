import java.util.*;

public class Primitiva_Bi {

	public static void main(String[] args) {
	
		int [][] numeros= new int [6][1];
		
		numeros(numeros);
		System.out.println("Columna 1: " );
		imprimir(numeros);
		System.out.println();
		System.out.println("Columna 2: ");
		numeros(numeros);
		imprimir(numeros);
	}
	
	
	public static void numeros(int [][] numeros) {
		
		Set <Integer> numerosGenerados= new HashSet <>();
		int aleatorio;
		for (int i=0; i<6; i++) {
			for (int j=0; j<1; j++) {
				
				
				do {
				if(i==5 && j==0) {
				aleatorio= (int) (Math.random()*10);
				}else {
				aleatorio= (int) (Math.random()*50)+1;
				}
				}while (numerosGenerados.contains(aleatorio));
				
				numeros[i][j]=aleatorio;
				numerosGenerados.add(aleatorio);
				
			}
		
			}
		
	}
	
public static void numeros2(int [][] numeros) {
		
		Set <Integer> numerosGenerados= new HashSet <>();
		int aleatorio;
		for (int i=0; i<6; i++) {
			for (int j=0; j<1; j++) {
				
				
				do {
				if(i==5 && j==0) {
				aleatorio= (int) (Math.random()*10);
				}else {
				aleatorio= (int) (Math.random()*50)+1;
				}
				}while (numerosGenerados.contains(aleatorio));
				
				numeros[i][j]=aleatorio;
				numerosGenerados.add(aleatorio);
				
			}
		
			}
		
	}
	
	public static void imprimir (int [][] numeros) {
		
		
		for (int i=0; i<6; i++) {
			for (int j=0; j<1; j++) {
				
				if(i==5 && j==0) {
				System.out.println("El reintegro es: "+ numeros[i][j]);
				}else {
				System.out.println("El numero "+(i+1)+" es: " + numeros[i][j]);
				}
				
				
			}
		}
		
	}

}