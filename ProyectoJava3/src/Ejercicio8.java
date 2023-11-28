
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int num2;
		int i = 0;
		do {
			i++;
			num = (int) (Math.random()*5+1);
			num2 = (int) (Math.random()*5+1);
		}while(num!=num2);
		System.out.println("Las repeticiones que se han dado son : " + i + " el número que se ha igualado es :" + num);
	}

}
