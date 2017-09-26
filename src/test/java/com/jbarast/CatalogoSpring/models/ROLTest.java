package com.jbarast.CatalogoSpring.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test para probar la clase TEST
 */
public class ROLTest {

	/**
	 * Probamos el constructor y los metodos get.
	 */
	@Test
	public void constructorShouldWork() {

		ROL rol = new ROL(1, "administrador", "Probando la descripcion");

		assertEquals("Error en getId, resultado " + rol.getId() + "cuando se esperaba 1.", 1, rol.getId());
		assertEquals("Error en getROL, resultado " + rol.getRol() + "cuando se esperaba administrador",
				"administrador", rol.getRol());
		assertEquals("Error en getDescripcion, resultado " + rol.getDescripcion()
				+ "cuando se esparaba 'Probando la descripcion'", "Probando la descripcion", rol.getDescripcion());
	}

}