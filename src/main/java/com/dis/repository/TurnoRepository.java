package com.dis.repository;

import com.dis.model.Turno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Ing. Diego Ignacio Severini on 21/7/2017.
 */
@RepositoryRestResource
public interface TurnoRepository extends CrudRepository<Turno, Long> {
}
