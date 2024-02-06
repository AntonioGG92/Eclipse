package PooMultimediaArray;

public class Disco extends Multimedia{
	
	private GENERO genero;
	
	public Disco(GENERO genero) {
		super();
		this.genero=genero;
	}
	
	public Disco(String titulo,String autor,FORMATO formato, int duracion, GENERO genero) {
		super( titulo, autor, formato,  duracion);
		this.genero=genero;
	}

	@Override
	public String toString() {
		return "Disco [genero=" + genero + ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor()
				+ ", getFormato()=" + getFormato() + ", getDuracion()=" + getDuracion() + "]";
	}

	
	
}
