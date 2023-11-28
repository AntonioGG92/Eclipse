import java.util.*;
public class Practica11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime el precio total del artículo ");
		
		double precio1 = leer.nextDouble(); // guardamos la el precio del articulo en una variable */
		
		double descuento = precio1 * 0.2; // hacemos el calculo para saber el descuento del 20% */
		
		double iva = precio1 * 0.15; // hacemos el calculo para aplicarle el 15% de iva al articulo */
		
		double preciototal = precio1+iva; // hacemos el calculo para saber el precio final */
		
		System.out.println("El descuento es de : " + descuento + " € ");
		
		System.out.println("El iva es de : " + iva + " € ");
		
		System.out.println("El precio total es de :" + preciototal + " € ");
		
		leer.close();
	}

}
