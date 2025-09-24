package org.example.dao;

import org.example.model.Bitacora;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class BitacoraDAO {

    private Connection conexion;

    public  BitacoraDAO(Connection conexion) {
        this.conexion = conexion;
    }

    //Registro de actividades
    public void insertar(Bitacora bitacora) throws SQLException {
        String sqlSentencia = "INSERT INTO bitacora(formulario, accion, datos, fecha, usuario) VALUES (?, ?, ?, ?, ?) ";//???

        try (PreparedStatement stmt = conexion.prepareStatement(sqlSentencia)){
            stmt.setString(1, bitacora.getFormulario());
            stmt.setString(2, bitacora.getAccion());
            stmt.setString(3, bitacora.getDatos());
            stmt.setTimestamp(4, Timestamp.valueOf(bitacora.getFecha()));
            stmt.setString(5, bitacora.getUsuario());

            stmt.executeUpdate();
        }


    }


//
//    private int id;
//    private String accion;
//    private LocalDateTime fecha;
//    private String usuario;
//    private String datos;
//    private String formulario;

}
