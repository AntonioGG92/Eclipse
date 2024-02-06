public class Pelicula  extends Multimedia{
	
	private String actorP;
	private String actrizP;
	
	public Pelicula() {
		super();
	}
	
	public Pelicula (String titulo,String autor, Formato formato, int duracion, String actor,String actriz) {	
	super(titulo,autor,formato,duracion);
	if(actor==null && actriz==null) {
		throw new IllegalArgumentException("Debe de haber al menos un protagonista");
	}
	this.actorP=actor;
	this.actrizP=actriz;
	
	}
	public String getActor() {
		return actorP;
	}
	public String getActriz() {
		return actrizP;
	}
	
	@Override
	public String toString() {
		String s= "Protagonizado por... ";
		if (actrizP != null) {
			s+= actrizP;
			if (actorP != null) {
				s+= actorP;
			}
		}else {
			assert actorP != null;
			s+= actorP;
		}
		return super.toString() + "\n" + s;
	}
	
}
