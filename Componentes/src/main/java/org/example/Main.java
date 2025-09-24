package org.example;

import org.example.controller.UsuarioController;
import org.example.misc.Conexion;
import org.example.model.Usuario;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UsuarioController usuarioController = new UsuarioController();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Nuevo Sistema en MySQL!");

        //????
        //Conexion conexion = new Conexion();
        Connection conn = Conexion.getConnection();

        if ( conn != null ) {
            System.out.println("Conectado");
        }
        else{
            System.out.println("No Conectado");
        }
        Usuario usuario = new Usuario(0, "Alberto","Alberto@gmail.com", "Inactivo");
        usuarioController.insertar(usuario);



    }
}