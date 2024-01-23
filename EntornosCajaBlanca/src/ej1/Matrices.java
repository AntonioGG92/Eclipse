package ej1;

import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		//escaner
		Scanner sc = new Scanner(System.in);
		//tamaño de los arrays 
		boolean iguales = true;
		System.out.println("Introduce el ancho de la primera matriz");
		int a1 = sc.nextInt();
		System.out.println("Introduce el largo de la primera matriz");
		int l1 = sc.nextInt();
		int [] [] m1 = new int[a1] [l1];
		System.out.println("Introduce el ancho de la segunda matriz");
		a1 = sc.nextInt();
		System.out.println("Introduce el largo de la segunda matriz");
		l1 = sc.nextInt();
		int [] [] m2 = new int[a1] [l1];
		//introduccion de datos del array
		for(int i = 0; i<m1.length;i++) {
			for(int a = 0; a<m1[i].length;a++) {
				System.out.println("Introduce el numero de la primera matriz en la posicion"+(i+1)+","+(a+1));
				m1 [i] [a] = sc.nextInt();
			}
		}
		for(int i = 0; i<m2.length;i++) {
			for(int a = 0; a<m2[i].length;a++) {
				System.out.println("Introduce el numero de la segunda matriz en la posicion"+(i+1)+","+(a+1));
				m2 [i] [a] = sc.nextInt();
			}
		}
		//salida de los datos del array
		System.out.println("Numeros array 1");
		for(int i = 0; i<m1.length;i++) {
			for(int a = 0; a<m1[i].length;a++) {
				System.out.print(m1 [i] [a]);
			}
			System.out.println();
		}
		System.out.println("Numeros array 2");
		for(int i = 0; i<m2.length;i++) {
			for(int a = 0; a<m2[i].length;a++) {
				System.out.print(m2 [i] [a]);
			}
			System.out.println();
		}
		
		if(m1.length==m2.length){
			if(m1[0].length==m2[0].length){
				for(int i = 0; i<m1.length;i++) {
					for(int a = 0; a<m1[i].length;a++) {
						if(m2 [i] [a] != m1 [i] [a])iguales = false;
					}
				}
				if(iguales) {
					System.out.println("Las matrices son iguales");
				}
				else {
					System.out.println("Las matrices no son iguales");
				}
			}
			
			else {
				System.out.println("Las matrices no son comparables");
			}
		}
		else {
			System.out.println("Las matrices no son comparables");
		}	
	}
}
