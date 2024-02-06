package PooMultimediaArray;

import java.util.Arrays;

public class Multimedia {
	private String titulo;
	private String autor;
	private FORMATO formato;
	private int duracion;
	private GENERO genero;
	
	
	public Multimedia() {
		
	}
	
	public Multimedia(String titulo,String autor,FORMATO formato, int duracion) {
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

	public FORMATO getFormato() {
		return formato;
	}

	public int getDuracion() {
		return duracion;
	}

	
	
	@Override
	public String toString() {
		
		return "Multimedia " + " [titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion + "]";
	}

	public boolean equals() {
		if(this.titulo.equals(this.autor)) {
			return true;
		}else {
			return false;
		}
	}
}