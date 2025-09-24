package org.example.dao;

import com.google.gson.Gson;
import org.example.misc.Conexion;
import org.example.model.Bitacora;
import org.example.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

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

            System.out.println("Usuario insertado correctamente");

            //Seccion de guardar en bitacora
            Gson gson = new Gson();
            String json = gson.toJson(usuario);

            Bitacora bitacora = new Bitacora(0, "Insertar", LocalDateTime.now(),
                    "mario", json, "Usuario");

            BitacoraDAO bitacoraDAO = new BitacoraDAO(conexion);

            bitacoraDAO.insertar(bitacora);


        }catch (SQLException e){
            System.out.println("Error" + e.getMessage());
        }


    }


}
