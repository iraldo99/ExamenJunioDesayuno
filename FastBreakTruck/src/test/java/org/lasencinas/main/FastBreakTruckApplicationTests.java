package org.lasencinas.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.lasencinas.domain.Desayuno;
import org.lasencinas.productos.Eyeholes;
import org.lasencinas.productos.FleebJuice;
import org.lasencinas.productos.Smiggles;
import org.lasencinas.productos.TurbulentJuice;
import org.lasencinas.services.FastBreakTruck;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FastBreakTruckApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testGetCosteEyeholes() {
		Desayuno desayuno = new Desayuno();
		desayuno.insertarItem(new Eyeholes());
		assertEquals(desayuno.getCoste(),(float) 25);
	}
	@Test
	void testGetCosteSmiggles() {
		Desayuno desayuno = new Desayuno();
		desayuno.insertarItem(new Smiggles());
		assertEquals(desayuno.getCoste(),(float) 50);
	}
	@Test
	void testGetCosteFleebJuice() {
		Desayuno desayuno = new Desayuno();
		desayuno.insertarItem(new FleebJuice());
		assertEquals(desayuno.getCoste(),(float) 35);
	}
	@Test
	void testGetCosteTurbulentJuice() {
		Desayuno desayuno = new Desayuno();
		desayuno.insertarItem(new TurbulentJuice());
		assertEquals(desayuno.getCoste(),(float) 30);
	}
}
