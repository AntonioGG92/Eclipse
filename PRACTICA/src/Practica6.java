import java.util.*;
public class Practica6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime cuanto mide el primer cateto ");
		
		double cateto1 = leer.nextDouble();//guardamos el valor del primer cateto introducido por el usuario*/
		
		System.out.println("Dime cuanto mide el otro cateto ");
		
		double cateto2 = leer.nextDouble();//guardamos el valor del segundo cateto introducido por el usuario*/
		
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));//calculamos la hipotenusa */
		
		System.out.println("La hipotenusa es : " + hipotenusa);
		
		leer.close();
	}

}
