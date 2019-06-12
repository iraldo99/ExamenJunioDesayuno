package org.lasencinas.abstracts;

import org.lasencinas.interfaces.Item;
import org.lasencinas.interfaces.Packing;
import org.lasnecinas.envoltorios.Tubo;

public abstract class Bebida implements Item {
	
	Packing tubo = new Tubo();
	
	public Packing empaquetado() {
		return tubo;
	}
	
}
