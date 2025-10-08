package org.example.componentes;

import org.example.interfaz.InterfazNotificacion;
import org.example.model.Destinatario;
import org.example.model.Mensaje;

public class PushNotificacionesIphone implements InterfazNotificacion {

    @Override
    public void enviar(Destinatario destinatario, Mensaje mensaje) {
        System.out.println("Enviando Telefono Iphone: " + destinatario.getTelefono() + " , Mensaje: " + mensaje.getCuerpoMensaje());
    }


}
