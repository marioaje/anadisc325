package org.example.services;

import org.example.interfaz.InterfazNotificacion;
import org.example.model.Destinatario;
import org.example.model.Mensaje;

public class Authservicio {

    private InterfazNotificacion notificacion;


    //propiedades y otros ajustes

    public Authservicio(InterfazNotificacion notificacion) {
        this.notificacion = notificacion;
    }
//
//
//
//    public interface InterfazNotificacion {
//        void enviar(Destinatario destinatario, Mensaje mensaje );
//    }



}
