package zooAnimales;

import gestion.Zona;
import java.util.*;

public class Mamifero extends Animal {

	static private Vector<Mamifero> listado = new Vector<Mamifero>();
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public void crearCaballo(String nombre, int edad, String genero) {
		listado.add(new Mamifero(nombre, edad, "pradera", genero, true, 4));
		caballos++;
	}
	
	public void crearLeon(String nombre, int edad, String genero) {
		listado.add(new Mamifero(nombre, edad, "selva", genero, true, 4));
		leones++;
	}
	
	static public int cantidadMamiferos() {
		return listado.size();
	}
	
	
}
