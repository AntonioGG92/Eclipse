import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner leer = new Scanner(System.in);

	        System.out.println("¡Bienvenido al programa de Horóscopo!");
	        
	        System.out.print("Por favor, ingresa tu día de nacimiento (1-31): ");
	        int dia = leer.nextInt();

	        System.out.print("Ahora, ingresa tu mes de nacimiento (1-12): ");
	        int mes = leer.nextInt();
	        
	        String signozodiaco = " ";
	        
	        switch (mes) {
	        	case 1:
	        		if (dia >= 1 && dia <= 19) {
	        			signozodiaco = "Capricornio";
	        		}else if (dia >= 20 && dia <= 31) {
	        			signozodiaco = "Acuario";
	        		}
	        		break;
	        	case 2:
	        		if (dia >= 1 && dia <= 18) {
	        			signozodiaco = "Acuario";
	        		}else if (dia >= 19 && dia <= 29) {
	        			signozodiaco = "Piscis";
	        		}
	        		break;
	        	case 3:
	        		if (dia >= 1 && dia <= 20) {
	        			signozodiaco = "Piscis";
	        		}else if (dia >= 21 && dia <= 31) {
	        			signozodiaco = "Aries";
	        		}
	        		break;
	        	case 4:
	        		if (dia >= 1 && dia <= 19) {
	        			signozodiaco = "Aries";
	        		}else if (dia >= 20 && dia <= 30) {
	        			signozodiaco = "Tauro";
	        		}
	        		break;
	        	case 5:
	        		if (dia >= 1 && dia <= 20) {
	        			signozodiaco = "Tauro";
	        		}else if (dia >= 21 && dia <= 31) {
	        			signozodiaco = "Géminis";
	    }
	        		break;
	        	case 6:
	        		if (dia >= 1 && dia <= 20) {
	        		   signozodiaco = "Géminis";
	        		}else if (dia >= 21 && dia <= 30) {
	        			signozodiaco = "Cancer";
	        		}
	        		break;
	        	case 7:
	        		if (dia >= 1 && dia <= 22) {
	        			signozodiaco = "Cancer";
	        		}else if (dia >= 23 && dia <= 31) {
	        			signozodiaco = "Leo";
	        		}
	        		break;
	        	case 8:
	        		if (dia >= 1 && dia <= 22) {
	        			signozodiaco = "Leo";
	        		}else if (dia >= 23 && dia <= 31) {
	        			signozodiaco = "Virgo";
	        		}
	        		break;
	        	case 9:
	        		if (dia >= 1 && dia <= 22) {
	        			signozodiaco = "Virgo";
	        		}else if (dia >= 23 && dia <= 30) {
	        			signozodiaco = "Libra";
	        		}
	        		break;
	        	case 10:
	        		if (dia >= 1 && dia <= 22) {
	        			signozodiaco = "Libra";
	        		}else if (dia >= 23 && dia <= 31) {
	        			signozodiaco = "Escorpio";
	        		}
	        		break;
	        	case 11:
	        		if (dia >= 1 && dia <= 21) {
	        			signozodiaco = "Escorpio";
	        		}else if (dia >= 23 && dia <= 30) {
	        			signozodiaco = "Sagitario";
	        		}
	        		break;
	        	case 12:
	        		if (dia >= 1 && dia <= 21) {
	        			signozodiaco = "Sagitario";
	        		}else if (dia >= 23 && dia <= 31) {
	        			signozodiaco = "Capricornio";
	        		}
	        		break;
	        }
	        System.out.println("El horóscopo para el día y mes insertados es : " +signozodiaco);
	        
	        leer.close();
	}
}