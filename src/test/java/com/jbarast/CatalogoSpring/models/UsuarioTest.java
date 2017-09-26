package com.jbarast.CatalogoSpring.models;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Test para la clase Usuario.
 *
 * @author jbarast
 * @version 18/09/2017
 */
@RunWith(SpringRunner.class)
public class UsuarioTest {

	ROL rolMock = mock(ROL.class);

	/**
	 * Test para comprobar el constructor.
	 */
	@Test
	public void constructorShouldWork() {

		// Creamos el mock de la clase ROL.

		// Objeto
		Usuario usuario = new Usuario(1, rolMock, "usuario", "password", "nombreCompleto");

		// Hacemos los tests.
		assertEquals(String.format("Error en getId se esperaba 1 ,siendo el resultado %d", usuario.getId()), 1,
				usuario.getId());
		assertEquals(String.format("Error en getROL"), rolMock, usuario.getRol());
		assertEquals(String.format("Error en getPassword"), "password", usuario.getPassword());
		assertEquals(
				String.format("Error en getPersona, se esperaba \"nombreCompleto\" cuando el resultado es %s",
						usuario.getNombreCompleto()), "nombreCompleto", usuario.getNombreCompleto());

	}

}