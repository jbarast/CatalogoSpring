//RolController.java

package com.jbarast.CatalogoSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador para la vista roles.html
 * 
 * @author JAVA
 * @version 28/09/2017
 * 
 *          Created 28/09/2017
 *
 */
@Controller
@RequestMapping("/app/roles")
public class RolController {

	@GetMapping
	public String rolCrud() {
		return "roles";
	}

}
