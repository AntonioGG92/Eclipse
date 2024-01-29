

public class appMultimedia {

	public static void main(String[] args) {
		
		Lista_Multimedia miLista=new Lista_Multimedia(10);
		Pelicula Pelicula1=new Pelicula("Las Dos Torres","Peter Jackson",Formato.dvd,180,"Elijah Wood", null);
		Pelicula Pelicula2=new Pelicula();
		Pelicula Pelicula3=new Pelicula();
		miLista.add(Pelicula1);
		miLista.add(Pelicula2);
		miLista.add(Pelicula3);
		//System.out.println(miLista.get(0));//
		//System.out.println(miLista.get(1));//
		System.out.println("Posicion " + miLista.indexOf(Pelicula1));
		System.out.println(Pelicula1.toString());
	}

}