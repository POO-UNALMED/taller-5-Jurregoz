package zooAnimales;
import gestion.Zona;
import gestion.Zoologico;
import java.util.*;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
		
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	
	
	
	public String totalPorTipo() {
		return("Mamiferos: " + Mamifero.cantidadMamiferos() + 
				"\nAves: " + Ave.cantidadAves() + 
				"\nReptiles: " + Reptil.cantidadReptiles() + 
				"\nPeces: " + Pez.cantidadPeces() + 
				"\nAnfibios: " + Anfibio.cantidadAnfibios() 
				);
	}
	
	public String toString() {
		return("Mi nombre es " + nombre + ", tengo una edad de #edad, habito en " + habitat + " y mi genero es " +
genero);
	}
	
	
}
