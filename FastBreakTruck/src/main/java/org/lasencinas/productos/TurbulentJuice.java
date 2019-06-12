package org.lasencinas.productos;

import org.lasencinas.abstracts.Bebida;

public class TurbulentJuice extends Bebida {
	Float pvp = (float) 30.0;
	
	public String nombre() {
		return "Turbulent juuuuuice";
	}
	
	public Float pvp() {
		return pvp;
	}
}
