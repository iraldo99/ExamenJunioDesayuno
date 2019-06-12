package org.lasencinas.services;

import org.lasencinas.domain.Desayuno;
import org.lasencinas.productos.Eyeholes;
import org.lasencinas.productos.Smiggles;
import org.lasencinas.productos.TurbulentJuice;

public class FastBreakTruck {
	
	
	
	public FastBreakTruck(){
		
	}
	
	public static Desayuno prepararEyeHoles() {
		Desayuno desayuno = new Desayuno();
		Eyeholes eyes = new Eyeholes();
		TurbulentJuice turb = new TurbulentJuice();
		
		desayuno.insertarItem(eyes);
		desayuno.insertarItem(turb);
		return desayuno;
	}

	public static Desayuno prepararSmiggles() {
		Desayuno desayuno = new Desayuno();
		Smiggles smig = new Smiggles();
		TurbulentJuice turb = new TurbulentJuice();
		
		desayuno.insertarItem(smig);
		desayuno.insertarItem(turb);
		return desayuno;
	}
	
}
