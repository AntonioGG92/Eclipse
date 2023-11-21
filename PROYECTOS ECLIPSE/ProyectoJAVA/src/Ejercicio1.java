import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Dime un numero");
		
		int num;
		int digitos;
		
		num = leer.nextInt();
		
		digitos = 0;
		if (num == 0) {
		digitos = 1;
		
		}else {
		while (num>0) {
			num = num/10;
			digitos++;
					
		}
		 
		
		}
			System.out.println("El numero tiene " +digitos+" digitos");
			
	 leer.close();
	}

}
