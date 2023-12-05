public class Ejercicio10 {

	public static void main(String[] args) {

        int resul = tirarDados();
        System.out.println("Primera tirada: " + resul);

        while (!dadosIguales()) {
            resul = tirarDados();
            System.out.println("Siguiente tirada: " + resul);
        }

        System.out.println("Ambos dados tienen el mismo valor");
    }

    public static int tirarDado() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int tirarDados() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        return dado1 + dado2;
    }

    public static boolean dadosIguales() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        System.out.println("Tirada adicional: " + dado1 + ", " + dado2);
        return dado1 == dado2;
    }
}
