package com.dis.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Ing. Diego Ignacio Severini on 22/7/2017.
 */
@Entity
public class Profesional implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long profesional_id;
    private String nombre;
    private String apellido;
    
    @OneToMany(targetEntity = com.dis.model.Turno.class, mappedBy = "profesional")
    private List<Turno> turnos;

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
