package examen;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int operacion;

        do {
            System.out.println("CALCULADORA :");
            System.out.println();
            System.out.println("Suma________Opcion 1");
            System.out.println("Resta_______Opcion 2");
            System.out.println("Multiplicaciom___Opcion 3");
            System.out.println("Division____Opcion 4");
            System.out.println("Resto division (Modulo)________Opcion 5");
            System.out.println("Potencia a 2______Opcion 6");
            System.out.println("Salir___Opcion 0");

            System.out.println("Introduce el primer numero :");
            int numero1 = leer.nextInt();

            System.out.println("Introduce el segundo numero :");
            int numero2 = leer.nextInt();

            System.out.println("Elije una opcion :");
            operacion = leer.nextInt();

            switch (operacion) {
                case 0:
                    System.out.println("Saliendo___");
                    break;

                case 1:
                    int suma = numero1 + numero2;
                    System.out.println(suma);
                    break;

                case 2:
                    int resta = numero1 - numero2;
                    System.out.println(resta);
                    break;

                case 3:
                    int multiplicacion = numero1 * numero2;
                    System.out.println(multiplicacion);
                    break;

                case 4:
                    int division = numero1 / numero2;
                    System.out.println(division);
                    break;

                case 5:
                    int modulo = numero1 % numero2;
                    System.out.println(modulo);
                    break;

                case 6:
                    int potencia = (int) Math.pow(numero1, numero2);// Hola
                    System.out.println(potencia);
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (operacion != 0);

        leer.close();
    }
}