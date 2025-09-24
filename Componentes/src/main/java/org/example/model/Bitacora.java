package org.example.model;

import java.time.LocalDateTime;
import java.util.Locale;

public class Bitacora {

    private int id;
    private String accion;
    private LocalDateTime fecha;
    private String usuario;
    private String datos;
    private String formulario;

    public Bitacora(int id, String accion, LocalDateTime fecha, String usuario, String datos, String formulario) {
        this.id = id;
        this.accion = accion;
        this.fecha = fecha;
        this.usuario = usuario;
        this.datos = datos;
        this.formulario = formulario;
    }

    //aca

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String datos) {
        this.formulario = formulario;
    }



//    Bitacora
//            id,
//            accion=CRUD,
//            fecha,
//            usuariocreacion,
//            detalle

}
