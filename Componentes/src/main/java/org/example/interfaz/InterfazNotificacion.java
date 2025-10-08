package org.example.interfaz;

import org.example.model.Destinatario;
import org.example.model.Mensaje;
//Validara que todas las notificaciones se cumplan
public interface InterfazNotificacion {
    void enviar(Destinatario destinatario, Mensaje mensaje );
}
