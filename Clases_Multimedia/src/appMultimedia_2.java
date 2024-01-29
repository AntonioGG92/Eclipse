public class appMultimedia_2 {

	public static void main(String[] args) {


		Lista_Multimedia miLista2= new Lista_Multimedia(10);
		Disco Disco= new Disco ("Eminem The Marshall Mathers LP","Eminem",Formato.mp3,180,Genero.rap);
		Disco Disco2= new Disco ();
		Disco Disco3= new Disco ();
		miLista2.add(Disco);
		miLista2.add(Disco2);
		miLista2.add(Disco3);
		System.out.println("Posicion " + miLista2.indexOf(Disco));
		System.out.println(Disco.toString());
	
	}

}