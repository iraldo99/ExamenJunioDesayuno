package org.lasencinas.productos;

import org.lasencinas.abstracts.Cereales;

public class Eyeholes extends Cereales {

	private Float pvp = (float) 25.0;
	private String nombre = "Eyeholes";
	
	public Eyeholes() {
		
	}
	
	public Float pvp() {
		return pvp;
	}
	
	public String nombre() {
		return nombre;
	}
	
}
