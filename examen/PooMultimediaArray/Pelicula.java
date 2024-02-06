// Apartado 2
// Autor by @Rafa

package PooMultimediaArray;

public class Pelicula extends Multimedia{
	private String actorP;
	private String actrizP;
	
	
	public Pelicula() {
		super();
	}
	
	public Pelicula(String titulo,String autor,FORMATO formato, int duracion,String actorP,String actrizP) {
		super(titulo,autor,formato,duracion);
		if(actorP==null && actrizP==null) {
			throw new IllegalArgumentException("Debe de haber al menos un protagonista");
		}
		this.actorP=actorP;
		this.actrizP=actrizP;
	}

	public String getActorP() {
		return actorP;
	}

	public String getActrizP() {
		return actrizP;
	}

	@Override
	public String toString() {
		String s= "Protagonizado por ";
		if (actrizP != null) {
			s+= actrizP;
			if (actorP != null) {
				s+= actorP;
			}
		}else {
			assert actorP !=null;
			s += actorP;
		}
		return super.toString() + "\n" + s;
		
	}

	
	
	
}
