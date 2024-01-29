
public class Disco extends Multimedia{
	
	private Genero genero;
	
	public Disco(Genero genero) {
		super();
		this.genero=genero;
	}
	
	public Disco() {
		super();
	}
	
	public Disco(String titulo, String autor, Formato formato, int duracion, Genero genero) {
		super(titulo, autor, formato, duracion);
		this.genero=genero;
	}
	
	@Override
	public String toString() {
		return "Disco [genero=" + genero + ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor()
				+ ", getFormato()=" + getFormato() + ", getDuracion()=" + getDuracion() + "]";
	}

	
	
}