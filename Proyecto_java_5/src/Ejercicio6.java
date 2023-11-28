import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		char[][] tablero = new char[3][3];
		char player = 'X';
		char pc = 'O';
		boolean finjuego = false;

		for (int fila = 0; fila < 3; fila++) {
			for (int columna = 0; columna < 3; columna++) {
				tablero[fila][columna] = ' ';
			}
		}
		while (!finjuego) {
			for (int fila = 0; fila < 3; fila++) {
				for (int columna = 0; columna < 3; columna++) {
					System.out.print("[" + tablero[fila][columna] + "]");
				}
				System.out.println();
			}
			System.out.println("Jugador 1, introduce una posición (fila 0-2 columna a-c):");
			int filajugador1 = leer.nextInt();
			String columnajugador1 = leer.next();

			int indicecolumnajugador1;
			switch (columnajugador1) {
			case "a":
				indicecolumnajugador1 = 0;
				break;
			case "b":
				indicecolumnajugador1 = 1;
				break;
			case "c":
				indicecolumnajugador1 = 2;
				break;
			default:
				System.out.println("Columna inválida. Inténtalo de nuevo.");
				return;
			}

			if (filajugador1 >= 0 && filajugador1 < 3 && indicecolumnajugador1 >= 0 && indicecolumnajugador1 < 3
					&& tablero[filajugador1][indicecolumnajugador1] == ' ') {
				tablero[filajugador1][indicecolumnajugador1] = player;
			} else if (tablero[filajugador1][indicecolumnajugador1] != ' ') {
				System.out.println("Hueco ocupado. Elige otra posición.");
				continue;
			} else {
				System.out.println("Posición inválida. Inténtalo de nuevo.");
				continue;
			}

			if (tablero[0][0] == player && tablero[0][1] == player && tablero[0][2] == player
					|| tablero[1][0] == player && tablero[1][1] == player && tablero[1][2] == player
					|| tablero[2][0] == player && tablero[2][1] == player && tablero[2][2] == player
					|| tablero[0][0] == player && tablero[1][0] == player && tablero[2][0] == player
					|| tablero[0][1] == player && tablero[1][1] == player && tablero[2][1] == player
					|| tablero[0][2] == player && tablero[1][2] == player && tablero[2][2] == player
					|| tablero[0][0] == player && tablero[1][1] == player && tablero[2][2] == player
					|| tablero[0][2] == player && tablero[1][1] == player && tablero[2][0] == player) {

				System.out.println("¡Jugador ha ganado!");

				for (int fila = 0; fila < 3; fila++) {
					for (int columna = 0; columna < 3; columna++) {
						System.out.print("[" + tablero[fila][columna] + "]");
					}
					System.out.println();
				}
				finjuego = true;
				break;
			}
			Random rand = new Random();
			int filapc = rand.nextInt(3);
			int columnapc = rand.nextInt(3);

			while (tablero[filapc][columnapc] != ' ') {
				filapc = rand.nextInt(3);
				columnapc = rand.nextInt(3);
			}
			tablero[filapc][columnapc] = pc;

			if (tablero[0][0] == pc && tablero[0][1] == pc && tablero[0][2] == pc
					|| tablero[1][0] == pc && tablero[1][1] == pc && tablero[1][2] == pc
					|| tablero[2][0] == pc && tablero[2][1] == pc && tablero[2][2] == pc
					|| tablero[0][0] == pc && tablero[1][0] == pc && tablero[2][0] == pc
					|| tablero[0][1] == pc && tablero[1][1] == pc && tablero[2][1] == pc
					|| tablero[0][2] == pc && tablero[1][2] == pc && tablero[2][2] == pc
					|| tablero[0][0] == pc && tablero[1][1] == pc && tablero[2][2] == pc
					|| tablero[0][2] == pc && tablero[1][1] == pc && tablero[2][0] == pc) {

				System.out.println("¡Ordenador ha ganado!");

				for (int fila = 0; fila < 3; fila++) {
					for (int columna = 0; columna < 3; columna++) {
						System.out.print("[" + tablero[fila][columna] + "]");
					}
					System.out.println();
				}
				finjuego = true;
				break;
			}
		}
		if (!finjuego) {
			System.out.println("Partida finalizada.");

			leer.close();
		}
	}

}
