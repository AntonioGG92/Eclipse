package PooMultimediaArray;

import java.util.Iterator;

import PooElectrodomestico.miEnum;

public class appMultimedia {

	public static void main(String[] args) {
		
		
		ListaMultimedia miLista=new ListaMultimedia(10);
		Pelicula Pelicula1=new Pelicula("Las Dos Torres","Peter Jackson",Formato.dvd,180,"Elijah Wood", null);
		Pelicula Pelicula2=new Pelicula("La Piedra Filosofal", "Chris Columbus", Formato.dvd,120,"Daniel Radcliffe",null);
		Pelicula pelicula3 = new Pelicula("El Padrino", "Francis Ford Coppola", Formato.dvd, 175, "Marlon Brando", null);
		Pelicula pelicula4 = new Pelicula("Titanic", "James Cameron", Formato.dvd, 195, "Leonardo DiCaprio", null);
		Pelicula pelicula5 = new Pelicula("Matrix", "Lana Wachowski y Lilly Wachowski", Formato.dvd, 136, "Keanu Reeves", null);
		Pelicula pelicula6 = new Pelicula("El Señor de los Anillos: La Comunidad del Anillo", "Peter Jackson", Formato.dvd, 178, "Elijah Wood", null);
		Pelicula pelicula7 = new Pelicula("La lista de Schindler", "Steven Spielberg", Formato.dvd, 195, "Liam Neeson", null);
		Pelicula pelicula8 = new Pelicula("Pulp Fiction", "Quentin Tarantino", Formato.dvd, 154, "John Travolta", null);
		Pelicula pelicula9 = new Pelicula("Forrest Gump", "Robert Zemeckis", Formato.dvd, 142, "Tom Hanks", null);
		Pelicula pelicula10 = new Pelicula("El Rey León", "Roger Allers y Rob Minkoff", Formato.dvd, 88, "Matthew Broderick", null);
		
	
		if(miLista.capacidad()) {
			miLista.getLista().add(Pelicula1);
			miLista.getLista().add(Pelicula2);
			miLista.getLista().add(Pelicula3);
			miLista.getLista().add(Pelicula4);
			miLista.getLista().add(Pelicula5);
			miLista.getLista().add(Pelicula6);
			miLista.getLista().add(Pelicula7);
			miLista.getLista().add(Pelicula8);
			miLista.getLista().add(Pelicula9);
			miLista.getLista().add(Pelicula10);
		}
		
		System.out.println("Esta es mi posicion 1 "+ miLista.indexOf(1));
		System.out.println();
		
		Iterator<Multimedia> iterator= miLista.getLista().iterator();
		
		while(iterator.hasNext()) {
			Multimedia multimedia= iterator.next();
			System.out.println(multimedia);
		}
		
	}

}
