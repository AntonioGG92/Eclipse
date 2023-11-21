import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner leer = new Scanner(System.in);

       
        System.out.print("Por favor, ingrese la cantidad en euros: ");
        double euros = leer.nextDouble();

        
        double valoreuroenpesetas = 166.386;

        
        double pesetas = euros * valoreuroenpesetas;

        
        System.out.println(euros + " euros equivalen a " + pesetas + " pesetas.");

       
        leer.close();
    }
}

