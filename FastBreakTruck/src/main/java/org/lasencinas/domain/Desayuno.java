package org.lasencinas.domain;

import java.util.ArrayList;

import org.lasencinas.interfaces.Item;

public class Desayuno {
	
	private ArrayList<Item> items = new ArrayList<>();
	
	public Desayuno() {
		
	}
	
	public void insertarItem(Item item) {
		this.items.add(item);
	}
	
	public void mostrarItems() {
		for(int i=0; i<items.size(); i++) {
			System.out.print("\nItem: "+items.get(i).nombre()+
							   ", Empaquetado: "+items.get(i).empaquetado().envoltorio()+
							   ", Precio: "+items.get(i).pvp());
		}
		System.out.println();
	}
	
	public Float getCoste() {
		Float total = (float) 0;
		for(int i=0; i<items.size(); i++) {
			total = total + items.get(i).pvp();
		}
		return total;
	}
	
}
