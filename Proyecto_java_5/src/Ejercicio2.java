public class Ejercicio2 {

	public static void main(String[] args) {
		
		int filas=4;
		int columnas=5;
		int suma=0;
		int [][] numeros= new int [filas][columnas];


		for (int i=0;i<filas; i++) {
			for(int j=0;j<columnas;j++) {

				numeros[i][j]=(int)(Math.random()*100+100);
			}
		}
		for (int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				System.out.printf("%d\t\t", numeros [i][j]);
				suma+=numeros[i][j];
			}
			System.out.print("Fila "+ (i+1) + ": " + suma);
			suma=0;
			System.out.println();
		}

		for (int j = 0; j < columnas; j++) {
			for (int i = 0; i < filas; i++) {
				suma+= numeros[i][j];
			}
			System.out.print("Col " + (j+1) + ":" + suma + "       ");

			suma=0;
		}
	}

}