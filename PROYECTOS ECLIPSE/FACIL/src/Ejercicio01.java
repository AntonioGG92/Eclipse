import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un número:");

        long num = leer.nextLong();

        System.out.println("Escribe un número:");

        long num2 = leer.nextLong();

        long a;

        String par = "";
        String impar = "";

        while (num > 0 || num2 > 0) {
            a = num % 10;
            if (a % 2 == 0 && a != 0) {
                par = par + a;
            }
            a = num2 % 10;
            if (a % 2 == 0 && a != 0) {
                par = par + a;
            } else if (a % 2 != 0) {
                impar = impar + a;
            }
            num2 = num2 / 10;
            num = num / 10;
        }
        
        String resultado = "";

        // Agregar los dígitos impares de ambos números a la cadena "resultado"
        while (!impar.isEmpty()) {
            resultado = resultado + impar.charAt(impar.length() - 1);
            impar = impar.substring(0, impar.length() - 1);
        }

        System.out.println("Dígitos pares: " + par);
        System.out.println("Dígitos impares: " + resultado);

        leer.close();
    }
}


