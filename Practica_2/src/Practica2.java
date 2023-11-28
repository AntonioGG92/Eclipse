import java.util.*;
public class Practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce las horas trabajadas, por favor."); // preguntamos horas trabajadas
		
		int horastra = leer.nextInt(); // guardamos las horas trabajadas en una variable
		
		System.out.println("Introduce el pago por hora."); // preguntamos el sueldo por hora
		
		double pagohora = leer.nextDouble(); //guardamos el sueldo en una variable
		
		double pagosinhextra = horastra*pagohora; // calculamos el sueldo sin horas extras
		
		if (horastra<=40) { // si las horas trabajadas son 40 o menos 
			
			System.out.println("Tu sueldo es de: " + pagosinhextra + " € "); //su sueldo será este
			
		}else { // si las horas trabajadas son mas de 40
		
				double pagohextra = horastra - 40; //el pago de las horas extras sera las horas trabajadas menos 40
				
				double sueldo =  40 * pagohora + pagohextra * pagohora * 2; // el pago total sera 40 horas de sueldo base mas las horas extras que se multiplican por el sueldo por hora por 2
				
				System.out.println("El pago total es de :" + sueldo + " € "); // escribimos al cliente su sueldo total
				
				leer.close();
			}
		}
		
	}

