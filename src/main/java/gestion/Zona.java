package gestion;
import java.util.Vector;

import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private Vector <Animal> animales = new Vector<Animal>();
	
	public Zona() {
		
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre= nombre;
		this.zoo = zoo;
	}
	
	public void agregarAnimales(Animal animal) {
		
		animales.add(animal);
		
	}
	
	public int cantidadAnimales() {
		return(animales.size());
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Zoologico getZoo() {
		return zoo;
	}
	
}
