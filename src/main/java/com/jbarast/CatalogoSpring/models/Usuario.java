package com.jbarast.CatalogoSpring.models;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Clase Usuario.
 *
 * @author jonBarnes
 * @version 18/09/2017
 */
@Data
@AllArgsConstructor
public class Usuario implements Serializable {

	// atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private ROL rol;
	private String usuario;
	private String password;
	private String nombreCompleto;

}
