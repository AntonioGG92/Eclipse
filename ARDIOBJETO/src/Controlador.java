
public class Controlador {

	public static void ataca(Dinosaurio atacante, Dinosaurio atacado) {
		atacado.setVida(atacado.getVida()-atacante.getBiteforce());

		System.out.println("El dinosaurio " + atacante.getNombre() + " daña a " + atacado.getNombre());
		System.out.println("La vida restante del " + atacado.getNombre() + " es " +atacado.getVida());
		if (atacado.getVida()<=0) {
			muere(atacado);
		}
	} 
	public static void muere(Dinosaurio muerto) {
		System.out.println("El dinosaurio " + muerto.getNombre() + " SE MURIÓ");
	}
}
