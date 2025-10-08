package org.example;

import org.example.componentes.EmailNotificacion;
import org.example.componentes.PushNotificacionesAndroid;
import org.example.componentes.SMSNotificacion;
import org.example.componentes.WhatsAppNotificacion;
import org.example.controller.UsuarioController;
import org.example.interfaz.InterfazNotificacion;
import org.example.misc.Conexion;
import org.example.model.Destinatario;
import org.example.model.Mensaje;
import org.example.model.Usuario;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //UsuarioController usuarioController = new UsuarioController();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Nuevo Sistema en MySQL!");
//
//        //????
//        //Conexion conexion = new Conexion();
//        Connection conn = Conexion.getConnection();
//
//        if ( conn != null ) {
//            System.out.println("Conectado");
//        }
//        else{
//            System.out.println("No Conectado");
//        }
//        Usuario usuario = new Usuario(0, "Alberto","Alberto@gmail.com", "Inactivo");
//        usuarioController.insertar(usuario);
//        this.id = id;
//        this.nombre = nombre;
//        this.correo = correo;
//        this.telefono = telefono;
        Destinatario destinatario = new Destinatario(
                0, "Mario", "mario@cenfotec.com", "61383453"
        );
//
//        private int id;
//
//        private String cuerpoMensaje;
//
//        private String plantilla;
        Mensaje mensaje = new Mensaje(
                     0, "Bienvenido a nuestro sistema", "Mensaje de Inicio de session"
        );


        //Componentes tienen un punto en comun???
        //Interfaz el secreto de que todos usen lo mismo pero diferente
        InterfazNotificacion email = new EmailNotificacion();
        email.enviar(destinatario, mensaje );

        System.out.println("---------------------------------------------");


        InterfazNotificacion sms = new SMSNotificacion();
        sms.enviar(destinatario, mensaje );

        System.out.println("---------------------------------------------");

        InterfazNotificacion android = new PushNotificacionesAndroid();
        android.enviar(destinatario, mensaje );

        System.out.println("---------------------------------------------");

        InterfazNotificacion whatsapp = new WhatsAppNotificacion();
        whatsapp.enviar(destinatario, mensaje );

        System.out.println("---------------------------------------------");

    }
}