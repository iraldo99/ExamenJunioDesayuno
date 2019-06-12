package org.lasencinas.domain;

import java.util.ArrayList;

import org.lasencinas.interfaces.Item;

public class Desayuno {
	
	private ArrayList<Item> items = new ArrayList<>();
	
	public Desayuno() {
		
	}
	
	public void mostrarItems() {
		for(int i=0; i<items.size(); i++) {
			System.out.println("Item: "+items.get(i).nombre()+
							   ", Empaquetado: "+items.get(i).empaquetado()+
							   ", Precio: "+items.get(i).pvp());
		}
	}
	
	public Float getCoste() {
		Float total = null;
		for(int i=0; i<items.size(); i++) {
			total = total + items.get(i).pvp();
		}
		return total;
	}
	
}
