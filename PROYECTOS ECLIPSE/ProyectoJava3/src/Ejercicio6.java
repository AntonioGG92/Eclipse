
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		int i = 0;
		
		do {
			i++;
			num = (int) (Math.random()*100);
			
		}while(num!=24);
		System.out.println("Las repeticiones que se han dado son: "+ i);
	}

}
