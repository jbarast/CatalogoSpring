//RolRepository.java

package com.jbarast.CatalogoSpring.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jbarast.CatalogoSpring.models.ROL;

/**
 * Repositorio para la clase ROL.
 * 
 * @author jbarast
 * @version 26/09/2017
 *
 *          Created 26/09/2017
 */
@RepositoryRestResource(collectionResourceRel = "role", path = "roles")
public interface RolRepository extends PagingAndSortingRepository<ROL, Long> {

}
