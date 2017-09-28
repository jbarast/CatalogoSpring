//roles.js

/**
 * 	JavaScript para la vista roles.js
 * 
 * 	autor: jbarast
 * 	version: 28/09/2017
 * 
 *   Created 28/09/2017
 */

//TODO Rellenar roles.js

$(function(){
	
	$('#buscarPorID').click(function(e){
		e.preventDefault();
		
		$.ajax({
			type: 'GET',
			url: 'roles/' + $('#id').val()
		}).done(function(rol){
			rellenarRolEnPantalla(rol);
		}).fail(function(jqXHR,textStatus,errorThrown){
			alert("ERROR: "+jqXHR.responseText);
			console.log(jqXHR,textStatus,errorThrown);
		});
	});
	
	$('#insertar').click(function(e){
		e.preventDefault();
		
		rol = crearRolDesdePantalla();
		
		$.ajax({
			type: 'POST',
			url: 'roles',
			contenType: 'application/json; charset=utf-8',
			dataType: 'json'
		}).done(function(rol){
			alert("Se a insertado "+rol.rol);
		}).fail(function(jqXHR, textStatus, errorThrown){
			alert("ERROR: "+jqXHR.responseText);
			console.log(jqXHR,textStatus,errorThrown);
		});
	});
	
	$('#modificar').click(function(e){
		e.preventDefault();
		
		rol = crearRolDesdePantalla();
		
		$.ajax({
			type: 'PUT',
			url: 'roles/' + $('#id').val(),
			data: JSON.stringify(rol),
			contentType: 'application/json; charset=utf-8',
			dataType: 'json'
		}).done(function(rol){
			alert("Se ha modificado " + rol.rol);
		}).fail(function(jqXHR, textStatus, errorThrown){
			alert("ERROR: " + jqXHR.responseText);
			console.log(jqXHR, textStatus, errorThrown);
		});
	});
	
	$('#borrar').click(function(e){
		e.preventDefault();
		
		$.ajax({
			type: 'DELETE',
			url: 'roles/' + $('#id').val()
		}).done(function(){
			alert("Se ha borrado el rol");
		}).fail(function(jqXHR, textStatus, errorThrown){
			alert("ERROR: " + jqXHR.responseText);
			console.log(jqXHR, textStatus, errorThrown);
		});
	});
	
	
	$('#buscarTodos').click(function(e){
		e.preventDefault();
		
		$.ajax({
			type: 'GET',
			url: 'roles'
		}).done(function(datos){
			console.log(datos);
			var rol = datos._embedded.role;
			rolesATabla(rol);
		}).fail(function(jqXHR, textStatus, errorThrown){
			alert("ERROR: " + jqXHR.responseText);
			console.log(jqXHR, textStatus, errorThrown);
		});
	});
	
	$('#buscarPorRol').click(function(e){
		e.preventDefault();
		
		$.ajax({
			type: 'GET',
			url: 'roles/search/findByRol?rol=' + $('#rol').val()
		}).done(function(datos){
			var rol = datos._embedded.role;
			rolesATabla(rol);
		}).fail(function(jqXHR, textStatus, errorThrown){
			alert("ERROR: " + jqXHR.responseText);
			console.log(jqXHR, textStatus, errorThrown);
		});
	});	
});

//FUNCIONES

/**
 * Funcion para rellenar la pantalla
 */
function rellenarRolEnPantalla(rol){
	$('#rol').val(rol.rol);	
	$('#descripcion').val(rol.descripcion);
}

/**
 * Con esta funcion, creamos el objeto rol.(JSON)
 * @returns {___anonymous_usuario}
 */
function crearRolDesdePantalla(){
	rol = {};
	
	rol.rol = $('#rol').val();	
	rol.descripcion = $('#descripcion').val();
	
	return rol;
}

/**
 * Funcion para mostrar por pantalla la tabla de roles.
 * @param rol
 */
function rolesATabla(rol) {
	console.log(rol);
	$('table').remove();
	var tabla = $('<table border=1>');
	
	$.each(rol, function(indice, rol){
		tabla.append('<tr><td>' + rol.rol + '</td><td>' + rol.descripcion + '</td></tr>');
	});
	
	$(tabla).insertAfter('form');			
}
