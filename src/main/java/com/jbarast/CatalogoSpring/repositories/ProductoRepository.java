//ProductoRepository.java

package com.jbarast.CatalogoSpring.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jbarast.CatalogoSpring.models.Producto;

/**
 * 
 * @author jbarast
 * @version 26/09/2017
 * 
 *          Created 26/09/2017
 *
 */
@RepositoryRestResource(collectionResourceRel = "producto", path = "productos")
public interface ProductoRepository extends PagingAndSortingRepository<Producto, Long> {

}
