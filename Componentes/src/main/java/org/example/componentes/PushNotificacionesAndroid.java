package org.example.componentes;

import org.example.interfaz.InterfazNotificacion;
import org.example.model.Destinatario;
import org.example.model.Mensaje;

public class PushNotificacionesAndroid implements InterfazNotificacion {

    @Override
    public void enviar(Destinatario destinatario, Mensaje mensaje) {
        System.out.println("Enviando Telefono Android: " + destinatario.getTelefono() + " , Mensaje: " + mensaje.getCuerpoMensaje());
    }


}
