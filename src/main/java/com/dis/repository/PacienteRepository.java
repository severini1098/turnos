package com.dis.repository;

import com.dis.model.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by diego.severini on 7/25/2017.
 */
@RepositoryRestResource
public interface PacienteRepository extends CrudRepository<Paciente, Long> {
 
}
