package com.jbarast.CatalogoSpring.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jbarast.CatalogoSpring.models.Usuario;

/**
 * Repositorio para la clase Usuario
 * 
 * @author jbarast
 * @version 26/09/2017
 * 
 *          Created 26/09/2017
 *
 */
@RepositoryRestResource(collectionResourceRel = "usuario", path = "usuarios")
public interface UserRepository extends PagingAndSortingRepository<Usuario, Long> {

}
