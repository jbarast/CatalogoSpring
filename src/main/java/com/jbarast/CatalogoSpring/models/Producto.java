package com.jbarast.CatalogoSpring.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Clase producto
 *
 * @author jbarast
 * @version 18/09/2017
 */
@Data
@AllArgsConstructor
@Entity
public class Producto {

	// atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nombre;
	private String descripcion;
	private int stock;
	private BigDecimal precio;
	private String rutaImagen;
}
