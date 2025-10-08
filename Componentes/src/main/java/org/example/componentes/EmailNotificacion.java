package org.example.componentes;

import org.example.interfaz.InterfazNotificacion;
import org.example.model.Destinatario;
import org.example.model.Mensaje;

public class EmailNotificacion implements InterfazNotificacion {
    //Datos de procesamiento

    @Override
    public void enviar(Destinatario destinatario, Mensaje mensaje) {
        System.out.println("Enviando correo: " + destinatario.getCorreo() + " , Mensaje: " + mensaje.getCuerpoMensaje());
    }

    //void enviar(Destinatario destinatario, Mensaje mensaje );

}
//
//EmailNotificacion(correo, texto )
//SMSNotificacion(numero, texto )
//
//WhatsAppNotificacion
//        PushNotificacionesAndroid
//
//PushNotificacionesIphone
//        PushNotificacionesWeb
