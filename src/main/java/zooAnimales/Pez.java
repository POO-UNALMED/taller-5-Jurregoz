package zooAnimales;

import java.util.Vector;

import gestion.Zona;

public class Pez extends Animal {
	static private Vector<Pez> listado = new Vector<Pez>();
	static public int salmones;
	static public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	public void crearSalmon(String nombre, int edad, String genero) {
		listado.add(new Pez(nombre, edad, "océano", genero, "rojo", 6));
		salmones++;
	}
	
	public void crearBacalao(String nombre, int edad, String genero) {
		listado.add(new Pez(nombre, edad, "océano", genero, "gris", 6));
		bacalaos++;
	}
	
	static public int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
}
