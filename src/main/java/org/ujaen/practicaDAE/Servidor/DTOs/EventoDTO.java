/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ujaen.practicaDAE.Servidor.DTOs;

import java.util.Date;
import org.ujaen.practicaDAE.Servidor.Evento;

/**
 *
 * @author javier
 */
public class EventoDTO {


    private int id;
    private Date fecha;
    private String lugar;
    private Evento.Tipo tipo;
    private String descripcion;
    private int numeroMaxAsistentes;

    public EventoDTO(int id, Date fecha, String lugar, Evento.Tipo tipo, String descripcion, int numeroMaxAsistente ) {
        this.id = id;
        this.fecha = fecha;
        this.lugar = lugar;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.numeroMaxAsistentes = numeroMaxAsistentes;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return the tipo
     */
    public Evento.Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Evento.Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the numeroMaxAsistentes
     */
    public int getNumeroMaxAsistentes() {
        return numeroMaxAsistentes;
    }

    /**
     * @param numeroMaxAsistentes the numeroMaxAsistentes to set
     */
    public void setNumeroMaxAsistentes(int numeroMaxAsistentes) {
        this.numeroMaxAsistentes = numeroMaxAsistentes;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
