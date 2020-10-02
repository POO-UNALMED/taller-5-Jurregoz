package zooAnimales;

import java.util.Vector;

import gestion.Zona;

public class Reptil extends Animal {

	static private Vector<Reptil> listado = new Vector<Reptil>();
	static public int iguanas;
	static public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public void crearIguana(String nombre, int edad, String genero) {
		listado.add(new Reptil(nombre, edad, "jungla", genero, "verde", 1));
		iguanas++;
	}
	
	public void crearSerpiente(String nombre, int edad, String genero) {
		listado.add(new Reptil(nombre, edad, "jungla", genero, "blanco", 1));
		serpientes++;
	}
	
	static public int cantidadReptiles() {
		return listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
}
