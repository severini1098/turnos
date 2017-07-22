package com.dis.repository;

import com.dis.model.Profesional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Ing. Diego Ignacio Severini on 22/7/2017.
 */
@RepositoryRestResource
public interface ProfesionalRepository extends CrudRepository<Profesional, Long> {
}
