package com.jbarast.CatalogoSpring.models;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * Test para la clase Producto.
 *
 * @author jbarast
 * @version 18/09/2017
 */
public class ProductoTest {

	/**
	 * Test del constructor y los getters.
	 */
	@Test
	public void constructorShouldWork() {

		// Objeto
		Producto producto = new Producto(1, "producto", "descripcion", 5, new BigDecimal(12), "rutaImagen");

		// Teses.
		assertEquals(String.format("Error en getId, se esperaba 1 cuando el resultado es %d", producto.getId()), 1,
				producto.getId());
		assertEquals(
				String.format("Error en getNombre, se esperaba \"producto\" cuando el resultado es %s",
						producto.getNombre()), "producto", producto.getNombre());
		assertEquals(
				String.format("Error en getDescripcion, se esperaba \"descripcion\" cuan el resultado es %s",
						producto.getDescripcion()), "descripcion", producto.getDescripcion());
		assertEquals(String.format("Error en getStock(), se espera 5 cuando el resulstado es %s", producto.getStock()),
				5, producto.getStock());
		assertEquals("Error en getPrecio, es esperaba 1 cuando el resultado es " + producto.getPrecio(),
				new BigDecimal(12), producto.getPrecio());
		assertEquals(
				String.format("Error en getDescripcion, se esperaba \"rutaImagen\" cuan el resultado es %s",
						producto.getRutaImagen()), "rutaImagen", producto.getRutaImagen());
	}

}