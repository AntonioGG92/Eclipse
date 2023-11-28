import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leer = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		int num = leer.nextInt();
		
		System.out.println("Introduce otro número: ");
		int num2 = leer.nextInt();
				
		int MCD = 0;
		int MCM = 0;
		int i = 1;
		do {
			if (num % i == 0 & num2 % i == 0) {
				MCD=i;
			}
		i++;	
		}while(i<=num/2 || i<=num2/2);
		i=1;
		do {
			if (i % num == 0 & i % num2 == 0) {
				MCM=i;
			}
		i++;	
		}while (MCM == 0);
		
		System.out.println(MCD);
		
		System.out.println(MCM);
		
		leer.close();
	}
}
