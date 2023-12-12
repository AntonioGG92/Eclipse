import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

        System.out.println("Piensa en un numero entre 0 y 100.");

        int intento = 1;
        int lSuperior = 100;
        int lInferior = 0;

        while (intento <= 5) {
            int nAdivinado = adivinarNumero(lInferior, lSuperior);
            System.out.println("Es " + nAdivinado + " el numero que estas pensando? (s/n)");
            char respuesta = leer.next().charAt(0);

            if (respuesta == 's' || respuesta == 'S') {
                System.out.println("El numero ha sido adivinado");
                break;
            } else {
                System.out.println("El numero es mayor o menor? " + nAdivinado + "?");
                char rMayorMenor = leer.next().charAt(0);

                if (rMayorMenor == 'm' || rMayorMenor == 'M') {
                    lSuperior = nAdivinado - 1;
                } else {
                    lInferior = nAdivinado + 1;
                }
            }

            intento++;
        }

        if (intento > 5) {
            System.out.println("No se ha logrado adivinar el numero en 5 intentos.");
        }

        leer.close();
    }

    public static int adivinarNumero(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
