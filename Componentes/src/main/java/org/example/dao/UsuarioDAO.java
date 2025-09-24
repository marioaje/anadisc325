package org.example.dao;

import org.example.misc.Conexion;
import org.example.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {


    private Connection conexion;

    public UsuarioDAO() {
        conexion = Conexion.getConnection();
    }

    //Registro de actividades
    public void insertar(Usuario usuario){
        String sqlSentencia = "INSERT INTO usuario(nombre, correo, estado) VALUES (?, ?, ?) ";//???

        try (PreparedStatement stmt = conexion.prepareStatement(sqlSentencia)){
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getCorreo());
            stmt.setString(3, usuario.getEstado());


            stmt.executeUpdate();
        }catch (SQLException e){
            System.out.println("Error" + e.getMessage());
        }


    }

}
