import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {

    	Scanner leer = new Scanner (System.in);
    	
    	int intento = 5;
    	int clave;
    	int contraseña = (int) (Math.random() *100);
    	boolean caja = false;
    	while (caja == false & intento > 0) {
    		System.out.println("Tienes " + intento + " intentos.");
    		System.out.println("Escribe la contraseña :");
    		clave = leer.nextInt();
    		if (clave == contraseña) {
    			caja = true;
    		}
    		else if (contraseña > clave) {
    			System.out.println("La contraseña es mayor");
    			intento--;
    		}
    		else {
    			System.out.println("La contraseña es menor");
    			intento--;
    		}
    	}
    	if (caja) {
    		System.out.println("Felicidades la caja se ha abierto *");
    	}
    	else {
    		System.out.println("La caja se ha bloqueado");
    	}
    	leer.close();
    }
}