
public class Ejercicio3 {

	public static void main(String[] args) {

		int maximo = 0;

		int minimo = 0;

		int media = 0;

		for(int i=1;i<=50;i++) {
			int a = (int) (Math.random()*100+100);

			System.out.println(i+": "+a+" ");

			media = media +a;
			if (a>maximo) {
				maximo=a;
				if (i==1) {
					minimo=a;
				}
			}
			else if (a<minimo) {
				minimo=a;
			}
			if (i%10==0) {
				System.out.println();
			}
		}
		media= media /50;

		System.out.println("El numero maximo es : "+ maximo);

		System.out.println("El numero minimo es : "+ minimo);

		System.out.println("La media de los numeros es : "+ media);
	}

}
