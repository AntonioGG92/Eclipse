import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner (System.in);

		int suspenso = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		int cantidadNotas;
		int notasAleatorias;

		for (cantidadNotas = 1; cantidadNotas <= 20; cantidadNotas++) {
			notasAleatorias = (int) (Math.random() * (5 + 1));

			switch (notasAleatorias) {
			case 1:
				System.out.println("Suspenso");
				suspenso++;
				break;
			case 2:
				System.out.println("Suficiente");
				suficiente++;
				break;
			case 3:
				System.out.println("Bien");
				bien++;
				break;
			case 4:
				System.out.println("Notable");
				notable++;
				break;
			case 5:
				System.out.println("Sobresaliente");
				sobresaliente++;
				break;
			default:
				System.out.println("Rango no válido.");
				break;
				
				
			}
			leer.close();
		}
		System.out.println("El número de suspensos son :" + suspenso);
		System.out.println("El número de suficientes son :" + suficiente);
		System.out.println("El número de bien son :" + bien);
		System.out.println("El número de notables son :" + notable);
		System.out.println("El número de sobresalientes son :" + sobresaliente);
		
	}
	
}
