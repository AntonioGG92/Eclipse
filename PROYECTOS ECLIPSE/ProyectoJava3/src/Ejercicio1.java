
public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("Primer dado : ");

		int suma;

		int a = (int) (Math.random()*6+1);

		System.out.println(a);

		System.out.println("Segundo dado : ");

		int b = (int) (Math.random()*6+1);

		System.out.println(b);

		System.out.println("Tercer dado : ");

		int c = (int) (Math.random()*6+1);

		System.out.println(c);

		suma=a+b+c;

		System.out.println("La suma de los numeros de los dados es : ");

		System.out.println(suma);
		
	}

}


