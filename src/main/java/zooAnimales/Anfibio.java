package zooAnimales;

import java.util.Vector;

import gestion.Zona;

public class Anfibio extends Animal {
	
	static private Vector<Anfibio> listado = new Vector<Anfibio>();
	static public int ranas;
	static public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(){
		
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	
	
	public void crearRana(String nombre, int edad, String genero) {
		listado.add(new Anfibio(nombre, edad, "selva", genero, "rojo", true));
		ranas++;
	}
	
	public void crearSalamandra(String nombre, int edad, String genero) {
		listado.add(new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false));
		salamandras++;
	}
	
	static public int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
}
