package practicas_de_ejercicios;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Realiza la tirada de dados y muestra el resultado
        int resultado = tirarDados();
        System.out.println("Primera tirada: " + resultado);

        // Continúa tirando los dados hasta que ambos tengan el mismo valor
        while (!dadosIguales()) {
            resultado = tirarDados();
            System.out.println("Siguiente tirada: " + resultado);
        }

        System.out.println("Ambos dados tienen el mismo valor");
    }

    // Función para simular la tirada de un dado
    public static int tirarDado() {
        return (int) (Math.random() * 6) + 1; // Genera un número aleatorio entre 1 y 6
    }

    // Función para tirar los dos dados y dvuelve la suma de sus valores
    public static int tirarDados() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        return dado1 + dado2;
    }

    // Función para verificar si los valores de los dados son iguales
    public static boolean dadosIguales() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        System.out.println("Tirada adicional: " + dado1 + ", " + dado2);
        return dado1 == dado2;
    }
}