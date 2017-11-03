package com.dis.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by diego.severini on 7/25/2017.
 */
@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paciente_id;
    
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String mail;
    
    @ManyToMany(targetEntity = com.dis.model.Turno.class, mappedBy = "pacientes")
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getPaciente_id() { return paciente_id; }
}
