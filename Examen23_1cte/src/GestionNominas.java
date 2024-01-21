import java.util.*;

public class GestionNominas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] empleados = null;
        double[][] nominasMensuales = null;
        double[] cobrosAnuales = null;
        int opcion;

        do {
            
            System.out.println("1. Cargar empleados");
            System.out.println("2. Cargar nóminas mensuales");
            System.out.println("3. Calcular nómina anual");
            System.out.println("4. Imprimir nóminas de un empleado");
            System.out.println("5. Calcular gastos totales");
            System.out.println("6. Salir");
            System.out.println("Ingrese la opción deseada: ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    empleados = cargarEmpleados(leer);
                    break;
                case 2:
                    if (empleados != null) {
                        nominasMensuales = cargarNominasMensuales(empleados, leer);
                    } else {
                        System.out.println("Error: Primero carga los empleados.");
                    }
                    break;
                case 3:
                    if (nominasMensuales != null) {
                        cobrosAnuales = calcularNominaAnual(nominasMensuales);
                        System.out.println("Nómina anual calculada correctamente.");
                        for (int i = 0; i < empleados.length; i++) {
                            System.out.println("Nómina anual de " + empleados[i] + ": €" + cobrosAnuales[i]);
                        }
                    } else {
                        System.out.println("Error: Primero carga las nóminas mensuales.");
                    }
                    break;
                case 4:
                    if (empleados != null && nominasMensuales != null) {
                        imprimirNominasEmpleado(empleados, nominasMensuales, leer);
                    } else {
                        System.out.println("Error: Primero carga los empleados y las nóminas mensuales.");
                    }
                    break;
                case 5:
                    if (cobrosAnuales != null) {
                        double gastosTotales = calcularGastosTotales(cobrosAnuales);
                        System.out.println("Los gastos totales de la empresa son: €" + gastosTotales);
                    } else {
                        System.out.println("Error: Primero calcula la nómina anual.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 6);

        leer.close();
    }

    private static String[] cargarEmpleados(Scanner scanner) {
        System.out.println("Ingrese la cantidad de empleados: ");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine();
        String[] empleados = new String[numEmpleados];

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Ingrese el nombre del empleado #" + (i + 1) + ": ");
            empleados[i] = scanner.nextLine();
        }

        System.out.println("Empleados cargados correctamente.");
        return empleados;
    }

    private static double[][] cargarNominasMensuales(String[] empleados, Scanner scanner) {
        int numEmpleados = empleados.length;

        double[][] nominasMensuales = new double[numEmpleados][12];

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Ingrese las nóminas mensuales para " + empleados[i] + ": ");
            for (int j = 0; j < 12; j++) {
                System.out.println("Ingrese la nómina del mes " + (j + 1) + ": ");
                nominasMensuales[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Nóminas mensuales cargadas correctamente.");
        return nominasMensuales;
    }

    private static double[] calcularNominaAnual(double[][] nominasMensuales) {
        int numEmpleados = nominasMensuales.length;
        double[] cobrosAnuales = new double[numEmpleados];

        for (int i = 0; i < numEmpleados; i++) {
            for (int j = 0; j < 12; j++) {
                cobrosAnuales[i] += nominasMensuales[i][j];
            }
        }

        return cobrosAnuales;
    }

    private static void imprimirNominasEmpleado(String[] empleados, double[][] nominasMensuales, Scanner scanner) {
        System.out.println("Ingrese el nombre del empleado para imprimir las nóminas: ");
        scanner.nextLine();
        String nombreEmpleado = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].equalsIgnoreCase(nombreEmpleado)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Nóminas de " + nombreEmpleado + ": ");
            for (int j = 0; j < 12; j++) {
                System.out.println("Mes " + (j + 1) + ": €" + nominasMensuales[index][j]);
            }
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    private static double calcularGastosTotales(double[] cobrosAnuales) {
        double gastosTotales = 0;
        for (double cobro : cobrosAnuales) {
            gastosTotales += cobro;
        }
        return gastosTotales;
    }
}
