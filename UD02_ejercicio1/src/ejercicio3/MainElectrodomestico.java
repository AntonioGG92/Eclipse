package ejercicio3;

public class MainElectrodomestico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double total=0;
		double totalTV=0;
		double totalLavadora=0;
		Electrodomestico[ ] E = new Electrodomestico[10];
		
		E[0]  = new Lavadora();
		E[1]  = new Lavadora(100, 40, 20,"rojo",'B');
		E[2]  = new Lavadora(100, 40);
		E[3]  = new Television();
		E[4]  = new Television(800,"negro",'E',42,35, false);
		E[5]  = new Television(700, 12);
		E[6]  = new Electrodomestico();
		E[7]  = new Electrodomestico(350,"rojo", 'C', 17);
		E[8]  = new Electrodomestico(320, 6);
		E[9]  = new Electrodomestico(120,"azul", 'A', 60);
		
		for (int i=0;i<E.length;i++) {
			try {
				if (((Object)E[i]).getClass().getSimpleName().equals("Electrodomestico")) {
					total+=E[i].precioFinal();
					
					
				}else if (((Object)E[i]).getClass().getSimpleName().equals("Lavadora")) {
					totalLavadora+=E[i].precioFinal();
					
				}else {
					totalTV+=E[i].precioFinal();
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Precio total de los electrodomesticos: "+ total +" euros");
		System.out.println("Precio total de las lavadoras: "+ totalLavadora +" euros");
		System.out.println("Precio total de las televisiones: "+ totalTV +" euros");
		
		System.out.println();
		
		// Comprobamos si el metodo comprobar color funciona perfectamente.
		Electrodomestico electrodomestico = new Electrodomestico(200, "verde", 'A', 15);
		String colorVerificado = electrodomestico.comprobarColor(electrodomestico.getColor());
		System.out.println("Color verificado: " + colorVerificado);
 
	}

}
