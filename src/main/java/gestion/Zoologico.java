package gestion;

import java.util.*;
public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private Vector <Zona> zonas = new Vector<Zona>();
	
	public Zoologico() {
	
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre= nombre;
		this.ubicacion = ubicacion;
	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		int numeroAnimales=0;
		for(int i=0; i<zonas.size(); i++) {
			numeroAnimales += zonas.get(i).cantidadAnimales();
		}
		return numeroAnimales;
		
	}
	
	public String getNombre() {
		return(nombre);
	}
	
	public String getUbicacion() {
		return(ubicacion);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}
