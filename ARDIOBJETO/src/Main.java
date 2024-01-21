
public class Main {

	public static void main(String[] args) {
	
		 Utha utha = new Utha();
		
		Trodon trodon = new Trodon();
		
		
		Controlador.ataca(trodon,utha);
		Controlador.ataca(utha,trodon);
		Controlador.ataca(trodon,utha);
		Controlador.ataca(utha,trodon);
	}
		
}
