package org.lasencinas.productos;

import org.lasencinas.abstracts.Bebida;

public class FleebJuice extends Bebida {
	private Float pvp = (float) 35.0;
	private String nombre = "Fleeb juice";
	
	public FleebJuice() {
		
	}
	
	public String nombre() {
		return nombre;
	}
	
	public Float pvp() {
		return pvp;
	}
}
