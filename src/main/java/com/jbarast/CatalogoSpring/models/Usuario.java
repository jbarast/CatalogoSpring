package com.jbarast.CatalogoSpring.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase Usuario.
 *
 * @author jonBarnes
 * @version 18/09/2017
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8371568831617432554L;

	// atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "id_rol", nullable = false)
	private ROL rol;
	private String usuario;
	private String password;
	private String nombreCompleto;

}
