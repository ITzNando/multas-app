package com.prestamo.Multas.Modelos;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "prestamos")
public class Prestamos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Usuario;
    private String Equipo;
    private String Estado;
    private Date FechaInicio;
    private Date FechaFin;
    private Date FechaEntrega;
    private int multa;


    public Prestamos() {
    }


    public Prestamos(Integer id, String usuario, String equipo, String estado, Date fechaInicio, Date fechaFin,Date fechaEntrega, int multa) {
        this.id = id;
        Usuario = usuario;
        Equipo = equipo;
        Estado = estado;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
        FechaEntrega = fechaEntrega;
        this.multa = multa;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getUsuario() {
        return Usuario;
    }


    public void setUsuario(String usuario) {
        Usuario = usuario;
    }


    public String getEquipo() {
        return Equipo;
    }


    public void setEquipo(String equipo) {
        Equipo = equipo;
    }


    public String getEstado() {
        return Estado;
    }


    public void setEstado(String estado) {
        Estado = estado;
    }


    public Date getFechaInicio() {
        return FechaInicio;
    }


    public void setFechaInicio(Date fechaInicio) {
        FechaInicio = fechaInicio;
    }


    public Date getFechaFin() {
        return FechaFin;
    }


    public void setFechaFin(Date fechaFin) {
        FechaFin = fechaFin;
    }


    public Date getFechaEntrega() {
        return FechaEntrega;
    }


    public void setFechaEntrega(Date fechaEntrega) {
        FechaEntrega = fechaEntrega;
    }


    public int getMulta() {
        return multa;
    }


    public void setMulta(int multa) {
        this.multa = multa;
    }


    @Override
    public String toString() {
        return "Prestamos [Equipo=" + Equipo + ", Estado=" + Estado + ", FechaEntrega=" + FechaEntrega + ", FechaFin="
                + FechaFin + ", FechaInicio=" + FechaInicio + ", Usuario=" + Usuario + ", id=" + id + ", multa=" + multa
                + "]";
    }


    

    

}
