import java.util.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		
		System.out.println("Ingrese el tipo de pan que desea preparar: ");
		
		String tipoDePan = leer.nextLine();

		System.out.println("Ingrese el tiempo de horneado en minutos: ");
		
		int tiempoDeHorneado = leer.nextInt();

		
		System.out.println("Preparando una barra de pan de tipo " + tipoDePan);
		
		System.out.println("Horneando durante " + tiempoDeHorneado + " minutos...");

		System.out.println("¡La barra de pan está lista! Disfrute su pan recién horneado.");

		leer.close();
	}
}