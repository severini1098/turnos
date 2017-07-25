package com.dis.model;

import com.dis.utils.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ing. Diego Ignacio Severini on 21/7/2017.
 */
@Entity
@Table(name = "TURNO")
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesional_id")
    private Profesional profesional;

    private Date horarioDeComienzo;
    private int sessionDuration;

    public int getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(int sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getHorarioDeComienzo() {
        return horarioDeComienzo;
    }

    public void setHorarioDeComienzo(Date horarioDeComienzo) {
        this.horarioDeComienzo = horarioDeComienzo;
    }
}
