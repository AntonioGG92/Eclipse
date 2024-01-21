import java.util.*;

public class BinarioDecimal {

    public static void main(String[] args) {
        // Declaramos las variables necesarias
        int opcion;
        String numero;
        int resultado;

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);

        // Mostramos el menú principal
        do {
            System.out.println("1- Convertir Binario a Decimal");
            System.out.println("2- Convertir Decimal a Binario");
            System.out.println("0- Salir");
            System.out.println("Introduce una opción: ");
            opcion = leer.nextInt();

            // Procesamos la opción seleccionada
            switch (opcion) {
                case 1:
                    // Convertimos un número binario a decimal
                    System.out.println("Introduce un número binario: ");
                    numero = leer.next();
                    resultado = convertirBinarioADecimal(numero);
                    System.out.println("El número decimal es " + resultado);
                    break;
                case 2:
                    // Convertimos un número decimal a binario
                    System.out.println("Introduce un número decimal: ");
                    int decimal = leer.nextInt();
                    numero = convertirDecimalABinario(decimal);
                    System.out.println("El número binario es " + numero);
                    break;
                case 0:
                    // Salimos del programa
                    break;
                default:
                    // Mostramos un mensaje de error
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

    // Función para convertir un número binario a decimal
    private static int convertirBinarioADecimal(String binario) {
        int numero = 0;
        int potencia = 0;

        for (int i = binario.length() - 1; i >= 0; i--) {
            // Multiplicamos el dígito actual por la potencia de 2 correspondiente
            numero += (binario.charAt(i) - '0') * Math.pow(2, potencia);
            potencia++;
        }

        return numero;
    }

    // Función para convertir un número decimal a binario
    private static String convertirDecimalABinario(int numero) {
        StringBuilder binario = new StringBuilder();

        while (numero > 0) {
            // Obtenemos el resto de la división de numero entre 2
            int resto = numero % 2;

            // Añadimos el resto al principio del número binario
            binario.insert(0, resto);

            // Dividimos numero entre 2
            numero /= 2;
        }

        return binario.toString();
    }
}