package zooAnimales;

import java.util.Vector;

import gestion.Zona;

public class Ave extends Animal{

	static private Vector<Ave> listado = new Vector<Ave>();
	static public int halcones;
	static public int aguilas;
	private String colorPlumas;
	
	public Ave() {
		super();
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
	}
	
	public void crearHalcon(String nombre, int edad, String genero) {
		listado.add(new Ave(nombre, edad, "montañas", genero, "cafe glorioso"));
		halcones++;
	}
	
	public void crearAguila(String nombre, int edad, String genero) {
		listado.add(new Ave(nombre, edad, "montanas", genero, "blanco y amarillo"));
		aguilas++;
	}
	
	static public int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
}
