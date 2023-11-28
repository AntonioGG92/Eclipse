import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner leer = new Scanner(System.in);

	        
	        System.out.print("Por favor, ingrese la cantidad en pesetas: ");
	        double pesetas = leer.nextDouble();

	       
	        double valoreuroenpesetas = 166.386;

	        
	        double euros = pesetas / valoreuroenpesetas;

	        
	        System.out.println(pesetas + " pesetas equivalen a " + euros + " euros.");

	       
	        leer.close();
	    }
	
	}


