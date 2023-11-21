import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);

        System.out.print("Por favor ingresa la hora (solo la hora en formato 24 horas): ");
        
        int hora = leer.nextInt();

        if (hora >= 6 && hora <= 12) {
        	
            System.out.println("Buenos días");
            
        } else if (hora >= 13 && hora <= 20) {
        	
            System.out.println("Buenas tardes");
            
        } else if ((hora >= 21 && hora <= 24) || (hora >= 0 && hora <= 5)) {
        	
            System.out.println("Buenas noches");
            
        } else {
            System.out.println("Hora no válida");
            
        }

        leer.close();
    }

	}


