package PooMultimediaArray;

import java.util.Iterator;

import PooMultimediaArray.GENERO;

public class appMultimedia2 {

	public static void main(String[] args) {
	
		
		ListaMultimedia miLista2= new ListaMultimedia(10);
		Disco Disco1= new Disco ("Eminem The Marshall Mathers LP","Eminem",Formato.mp3,180,Genero.hiphop);
		Disco Disco2= new Disco ("Thriller", "Michael Jackson"),Formato.cdAudio,45,Genero.pop);
		Disco Disco3= new Disco ("Back in Black", "AC/DC", Formato.cdAudio,60,Genero.rock);
		Disco Disco4= new Disco ("Dark Side of the Moon", "Pink Floyd",Formato.mp3,55,Genero.pop);
		Disco Disco5= new Disco ("Abbey Road", "The Beatles",Formato.cdAudio,50,Genero.pop);
		Disco Disco6= new Disco ("Savior","Green day",Formato.mp3,180,Genero.pop);
		Disco Disco7= new Disco ("Led Zeppelin IV", "Led Zeppelin",Formato.cdAudio,45,Genero.rock);
		Disco Disco8= new Disco ("Born to Run", "Bruce Springsteen", Formato.cdAudio,60,Genero.rock);
		Disco Disco9= new Disco ("Canciones del corazón","Sol y Sombra",Formato.mp3,55,Genero.pop);
		Disco Disco10= new Disco ("Ritmos Urbanos","Callejones del Ritmo",Formato.cdAudio,50,Genero.fun);
		
		
		
		if(miLista2.capacidad()) {
			miLista2.getLista().add(Disco1);
			miLista2.getLista().add(Disco2);
			miLista2.getLista().add(Disco3);
			miLista2.getLista().add(Disco4);
			miLista2.getLista().add(Disco5);
			miLista2.getLista().add(Disco6);
			miLista2.getLista().add(Disco7);
			miLista2.getLista().add(Disco8);
			miLista2.getLista().add(Disco9);
			miLista2.getLista().add(Disco10);
		}
		
		
		System.out.println("Esta es el objeto de mi posicion 2");
		System.out.println(miLista2.indexOf(2));
		System.out.println();
		
		Iterator<Multimedia> iterator2= miLista2.getLista().iterator();
		
		while(iterator2.hasNext()) {
			Multimedia multimedia2= iterator2.next();
			System.out.println(multimedia2);
		}
		
		
	}

}
