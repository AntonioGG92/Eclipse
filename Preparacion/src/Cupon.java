public class Cupon {

	public static void main(String[] args) {
		
		int [] numeros= new int [5];
		int serie;
		
		numeros(numeros);
		serie(numeros);
		imprimir(numeros);
		imprimir2(numeros);
	}

	public static void numeros(int [] numeros) {
		
		int aleatorio;
		
		for (int i=0; i<5; i++) {
			
			aleatorio= (int)(Math.random()*10);
			numeros[i]=aleatorio;
			
		}
	}
	
	public static int serie(int [] numeros) {
	
	
	int aleatorio;
	
	return aleatorio=(int)(Math.random()*100);
	
	}
	
	
	
	public static void imprimir(int [] numeros) {
		
	
	System.out.println("Numeros del cupon");
	for (int i=0; i<5; i++) {
		
		System.out.print(numeros[i]);
	}
	}
	
	public static void imprimir2(int[] numeros) {
	System.out.println();
	System.out.println();
	System.out.println("Numero de la serie");
	System.out.println(serie(numeros));
		
	}
}