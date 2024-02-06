package PooMultimediaArray;

import java.util.Iterator;

import PooMultimediaArray.GENERO;

public class appMultimedia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public Disco(String titulo,String autor,FORMATO formato, int duracion, GENERO genero)
		
		ListaMultimedia miLista2= new ListaMultimedia(10);
		Disco Disco1= new Disco ("Savior","Green day",FORMATO.mp3,180,GENERO.pop);
		Disco Disco2= new Disco ("Sueños de media noche","La luna sol",FORMATO.cdAudio,45,GENERO.rock);
		Disco Disco3= new Disco ("Maquinas del Tiempo", "Electronica Fantástica", FORMATO.cdAudio,60,GENERO.fun);
		Disco Disco4= new Disco ("Canciones del corazón","Sol y Sombra",FORMATO.mp3,55,GENERO.pop);
		Disco Disco5= new Disco ("Ritmos Urbanos","Callejones del Ritmo",FORMATO.cdAudio,50,GENERO.fun);
		Disco Disco6= new Disco ("Savior","Green day",FORMATO.mp3,180,GENERO.pop);
		Disco Disco7= new Disco ("Sueños de media noche","La luna sol",FORMATO.cdAudio,45,GENERO.rock);
		Disco Disco8= new Disco ("Maquinas del Tiempo", "Electronica Fantástica", FORMATO.cdAudio,60,GENERO.fun);
		Disco Disco9= new Disco ("Canciones del corazón","Sol y Sombra",FORMATO.mp3,55,GENERO.pop);
		Disco Disco10= new Disco ("Ritmos Urbanos","Callejones del Ritmo",FORMATO.cdAudio,50,GENERO.fun);
		
		
		
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
