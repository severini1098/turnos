package com.dis.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Ing. Diego Ignacio Severini on 22/7/2017.
 */
@Entity
@Table(name = "PROFESIONAL")
public class Profesional implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long profesional_id;
    private String nombre;
    private String apellido;

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
