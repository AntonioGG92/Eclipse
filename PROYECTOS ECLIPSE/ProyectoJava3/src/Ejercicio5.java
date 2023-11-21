
public class Ejercicio5 {

	public static void main(String[] args) {

		int resultado_Partido;
		int columnas = 3;
		int fila;

		for(fila = 1; fila <= 14; fila++) {

			System.out.printf("%02d. |", fila);

			for (int apuesta = 1; apuesta <= columnas; apuesta++) {
				resultado_Partido = (int) (Math.random()*3) + 1;
				switch(resultado_Partido) {
				case 1:
					System.out.print(" 1 |");
					break;
				case 2:
					System.out.print(" 2 |");
					break;
				case 3:
					System.out.print(" X |");
				default:
				}
			}
			System.out.println();
		}
		System.out.print("Pleno al 15");
		resultado_Partido = (int) (Math.random() *3) + 1;
		switch (resultado_Partido) {
		case 1:
			System.out.print(" 1");
			break;
		case 2:
			System.out.print(" 2");
			break;
		case 3:
			System.out.print(" X");
			break;
		}
	}

}