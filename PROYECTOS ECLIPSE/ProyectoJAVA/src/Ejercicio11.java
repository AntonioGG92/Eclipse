import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe el dia de la semana : ");
		
		int dia = leer.nextInt();
		
		String diasemana = null;
		
		int n=0;
		
		switch (dia) {
		
		case 1:
			diasemana = "Lunes";
			break;
		case 2:
			diasemana = "Martes";
			break;
		case 3:
			diasemana = "Miercoles";
			break;
		case 4:
			diasemana = "Jueves";
			break;
		case 5:
			diasemana = "Viernes";
			break;
		case 6:
			diasemana = "Sábado";
			break;
		case 7:
			diasemana = "Domingo";
			break;
			
			default :
				
				System.out.println("Ese día no existe");
				
				n=1;
				
				break;
		}
      if(n==0) {
    	  
    	  System.out.print("El día insertado es : ");
    	  
    	  System.out.print(diasemana);
    	  
    	  leer.close();
        }
    }
}
