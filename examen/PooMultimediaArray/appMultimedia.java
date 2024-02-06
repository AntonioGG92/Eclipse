// Apartado 3
// Autor by @Rafa

package PooMultimediaArray;

import java.util.Iterator;

import PooElectrodomestico.miEnum;

public class appMultimedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// public Multimedia(String titulo,String autor,FORMATO formato, int duracion,actor,actriz)
		
		ListaMultimedia miLista=new ListaMultimedia(10);
		Pelicula Pelicula1=new Pelicula("Avatar","James Cameron",FORMATO.dvd,180,"Robien Heart", null);
		Pelicula Pelicula2=new Pelicula("Jungla de Cristal", "Bruce Willis", FORMATO.dvd,120,"Ronnie Heart",null);
		Pelicula Pelicula3=new Pelicula("Sombras del pasado", "Alejandro Martinez",FORMATO.dvd,120,null,"Laura Fernandez");
		Pelicula Pelicula4=new Pelicula("El último amanecer","Claudia Fernandez",FORMATO.avi,135,null,"Ana Gomez");
		Pelicula Pelicula5=new Pelicula("Entre dos mundos","Ricardo Morales",FORMATO.mpg,110,null,"Marta Diaz");
		Pelicula Pelicula6=new Pelicula("Avatar","James Cameron",FORMATO.dvd,180,"Robien Heart", null);
		Pelicula Pelicula7=new Pelicula("Jungla de Cristal", "Bruce Willis", FORMATO.dvd,120,"Ronnie Heart",null);
		Pelicula Pelicula8=new Pelicula("Sombras del pasado", "Alejandro Martinez",FORMATO.dvd,120,"Javier Rodriguez ",null);
		Pelicula Pelicula9=new Pelicula("El último amanecer","Claudia Fernandez",FORMATO.avi,135,null,"Ana Gomez");
		Pelicula Pelicula10=new Pelicula("Entre dos mundos","Ricardo Morales",FORMATO.mpg,110,null,"Marta Diaz");
		
	
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
