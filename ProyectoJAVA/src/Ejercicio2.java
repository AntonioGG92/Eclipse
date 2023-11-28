import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner leer = new Scanner(System.in);
		
	        int numero1;
	        int numero2;
	        
	        System.out.println("Dime un numero");
	        
	        numero1 = leer.nextInt();
	        
	        System.out.println("Dime otro numero");
	        
	        numero2 = leer.nextInt();
	        
	        int sumadivisores1 = 0;
	        int sumadivisores2 = 0;

	        
	        for (int i = 1; i <= numero1 / 2; i++) {
	           
	            if (numero1 % i == 0) {
	                
	                sumadivisores1 += i;
	            }
	        }

	       
	        for (int i = 1; i <= numero2 / 2; i++) {
	            
	            if (numero2 % i == 0) {
	                
	                sumadivisores2 += i;
	            }
	        }

	        
	        if (sumadivisores1 == numero2 && sumadivisores2 == numero1) {
	            
	            
	            System.out.println(numero1 + " y " + numero2 + " son números amigos.");
	        } else {
	            
	            System.out.println(numero1 + " y " + numero2 + " no son números amigos.");
	        }
	        
	 
	        leer.close(); 
		 }
	}

