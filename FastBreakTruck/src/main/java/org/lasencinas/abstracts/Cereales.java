package org.lasencinas.abstracts;

import org.lasencinas.interfaces.Item;
import org.lasencinas.interfaces.Packing;
import org.lasnecinas.envoltorios.Caja;

public abstract class Cereales implements Item {
	
	Packing caja = new Caja();
	
	public Packing empaquetado() {
		return caja;
	}
	
	public String toString() {
		
		return null;
		
	};
	
}
