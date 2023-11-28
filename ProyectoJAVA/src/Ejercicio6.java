import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Escribe un número");
		
		int num = leer.nextInt();
		
		int h = num/2;
		int k = -2;
		for(int i =1; i <= num; i=i+2) {
		for(int a = h;a > 0;a--) {
			System.out.print("   ");
			}
		if(i!=0) {
			System.out.print(" * ");
		}
		h--;
		for(int b = k; b>=0; b--) {
			if(i == num) {
				System.out.print(" * ");
			}
			else {
				System.out.print("   ");}
			}
			if(i==0||i== num) {
				System.out.print(" * ");
			}
			else {
				System.out.print("   ");
			}
			for(int b = k; b>=0; b--) {
				if(i == num) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");}
				}
			k++;
			if(i!=1) {
				System.out.print(" * ");
			}
			System.out.println(" ");
			
		leer.close();
		}
         }
	}

