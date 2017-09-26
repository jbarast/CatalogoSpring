package com.jbarast.CatalogoSpring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Clase ROL
 *
 * @author jonBarnes
 * @version 19/09/2017
 *
 *          Created ...
 */
@Data
@AllArgsConstructor
@Entity
public class ROL {

	// atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String rol;
	private String descripcion;

}
