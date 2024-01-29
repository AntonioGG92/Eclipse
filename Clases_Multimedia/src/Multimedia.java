
public class Multimedia {

	private String titulo;
	private String autor;
	private Formato formato;
	private int duracion;
	private Genero genero;
	
	
	public Multimedia() {
	}
	public Multimedia(String titulo, String autor, Formato formato, int duracion) {
		this.titulo=titulo;
		this.autor=autor;
		this.formato=formato;
		this.duracion=duracion;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Formato getFormato() {
		return formato;
	}

	public int getDuracion() {
		return duracion;
	}
	
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Multimedia [titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion" + duracion + "]";
	}
	
	public boolean equals() {
		if(this.titulo.equals(this.autor)) {
			return true;
		}else {
			return false;
		}

	}
}
