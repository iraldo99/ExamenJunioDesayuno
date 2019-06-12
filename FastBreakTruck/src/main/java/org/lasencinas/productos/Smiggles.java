package org.lasencinas.productos;

import org.lasencinas.abstracts.Cereales;

public class Smiggles extends Cereales {
	private Float pvp = (float) 50.0;
	private String nombre = "Smiggles";
	
	public Smiggles() {
		
	}
	
	public Float pvp() {
		return pvp;
	}
	
	public String nombre() {
		return nombre;
	}
	
}
