package org.lasencinas.productos;

import org.lasencinas.abstracts.Bebida;

public class FleebJuice extends Bebida {
	Float pvp = (float) 35.0;
	
	public String nombre() {
		return "Fleeb juice";
	}
	
	public Float pvp() {
		return pvp;
	}
}
