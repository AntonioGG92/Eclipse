import java.util.*;

public class DiasRamos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la fecha para calcular los días restantes para Domingo de Ramos de 2024:");

        System.out.print("Día: ");
        int dia = leer.nextInt();

        System.out.print("Mes: ");
        int mes = leer.nextInt();

        System.out.print("Año: ");
        int anyo = leer.nextInt();

        int diasRestantes = calcularDiasParaDomingoDeRamos(dia, mes, anyo);

        if (diasRestantes >= 0) {
            System.out.println("Faltan " + diasRestantes + " días para Domingo de Ramos de 2024.");
        } else {
            System.out.println("La fecha ingresada ya pasó.");
        }
    }

    private static int calcularDiasParaDomingoDeRamos(int dia, int mes, int anno) {
        // Domingo de Ramos de 2024 es el 24 de marzo
        int diaDomingoDeRamos = 24;
        int mesDomingoDeRamos = 3;
        int anyoDomingoDeRamos = 2024;

        // Calcular los días restantes
        int diasRestantes = 0;

        while (dia != diaDomingoDeRamos || mes != mesDomingoDeRamos || anno != anyoDomingoDeRamos) {
            diasRestantes++;
            dia++;

            if (dia > obtenerDiasEnMes(mes, anno)) {
                dia = 1;
                mes++;

                if (mes > 12) {
                    mes = 1;
                    anno++;
                }
            }
        }

        return diasRestantes;
    }

    private static int obtenerDiasEnMes(int mes, int anno) {
        int[] diasEnMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return diasEnMes[mes];
    }
}
