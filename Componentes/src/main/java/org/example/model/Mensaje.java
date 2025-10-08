package org.example.model;

public class Mensaje {
//    id, cuerpoMensaje, plantilla
    private int id;

    private String cuerpoMensaje;

    private String plantilla;

    public Mensaje(int id, String cuerpoMensaje, String plantilla) {
        this.id = id;
        this.cuerpoMensaje = cuerpoMensaje;
        this.plantilla = plantilla;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuerpoMensaje() {
        return cuerpoMensaje;
    }

    public void setCuerpoMensaje(String cuerpoMensaje) {
        this.cuerpoMensaje = cuerpoMensaje;
    }

    public String getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(String plantilla) {
        this.plantilla = plantilla;
    }
}
