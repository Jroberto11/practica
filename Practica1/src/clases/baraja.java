package clases;

import java.util.ArrayList;
import java.util.Iterator;

public class baraja {
	private ArrayList<cartas>carta;
	private String nombre;


	public baraja(String nombre) {
		this.carta=new ArrayList<cartas>();
		this.nombre = nombre;
	}
	public String getnombre(){
		return nombre;
	}
	public void setnombre(String nombre){
		this.nombre=nombre;
	}
	public ArrayList<cartas>getcarta(int i){
		
		return carta;
	}
	public void anadir(cartas j){
		this.carta.add(j);
	}
	
	

	
}
	       
		

