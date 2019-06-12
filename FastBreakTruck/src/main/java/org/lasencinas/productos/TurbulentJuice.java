package org.lasencinas.productos;

import org.lasencinas.abstracts.Bebida;

public class TurbulentJuice extends Bebida {
	Float pvp = (float) 30.0;
	private String nombre = "Turbulent juuuuuice";
	
	public TurbulentJuice() {
		
	}
	
	public String nombre() {
		return nombre;
	}
	
	public Float pvp() {
		return pvp;
	}
}
