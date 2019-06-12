package org.lasencinas.productos;

import org.lasencinas.abstracts.Juguete;

public class Plumbus extends Juguete {
	private Float pvp = (float) 100.0;
	private String nombre = "Plumbus";
	
	public Plumbus() {
		
	}
	
	public String nombre() {
		return nombre;
	}
	
	public Float pvp() {
		return pvp;
	}
}
