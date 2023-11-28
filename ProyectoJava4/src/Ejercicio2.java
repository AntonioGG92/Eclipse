
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numero = new int [20];
		int [] cuadrado = new int [20];
		int [] cubo = new int [20];
		
		for (int i=0;i<numero.length;i++) {
			numero [i] = (int) (Math.random() *99+1);
		}
		for (int i=0;i<cuadrado.length;i++) {
			cuadrado [i] = numero [i] * numero [i];
		}
		for (int i=0;i<cubo.length;i++) {
			cubo [i] = cuadrado [i] * numero [i];
		}
		for (int i=0;i<20;i++) {
			System.out.printf("%02d | ", i+1);
			System.out.printf("%03d | ", numero [i]);
			System.out.printf("%5d | ", cuadrado [i]);
			System.out.printf("%7d | ", cubo [i]);
			System.out.println("");
		}
			
	}

}
