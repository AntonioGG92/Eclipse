public class Ejercicio3 {

	public static void main(String[] args) {
		
		int filas = 6;
		int columnas = 10;
		int[][] numeros = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {

				numeros[i][j] = (int) (Math.random() *1001);	
			}
		}
		int maxfilas = 0;
		int minfilas = 0;
		int maxcolum = 0;
		int mincolum = 0;
		int maximo = numeros[0][0];
		int minimo = numeros[0][0];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {

				if (numeros[i][j] < minimo) {
					minimo = numeros[i][j];
					minfilas = i;
					mincolum = j;
				}
				if (numeros[i][j] > maximo) {
					maximo = numeros[i][j];
					maxfilas = i;
					maxcolum = j;
				}
			}
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.println();
		} 
		System.out.println();
		System.out.println(
				"El máximo es " + maximo + " y esta en la posición (" + (maxfilas+1) + "," + (maxcolum+1) + ")");
		System.out.println(
				"El mínimo es " + minimo + " y se encuentra en la posición (" + (minfilas+1) + "," + (mincolum+1) + ")");
	}
}
