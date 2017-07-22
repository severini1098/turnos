package com.dis.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Ing. Diego Ignacio Severini on 21/7/2017.
 */
@Entity
@Table(name = "TURNO")
public class Turno implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "profesional_id")
    private Profesional profesional;

    @Column(name="DATE_CREATED")
    @Temporal(TemporalType.DATE)
    private java.util.Date date;
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

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }
}
