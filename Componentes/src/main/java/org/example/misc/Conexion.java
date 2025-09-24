package org.example.misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
//Singleton + Factory
    private static final String URL = "jdbc:mysql://45.88.196.5:3306/u484426513_anac325";
    private static final String usuario = "u484426513_anac325";
    private static final String password = "*3bC1A&nt6Y$";


    public static Connection getConnection() {
        try{
            return DriverManager.getConnection(URL, usuario, password);
        }catch(SQLException e){
            System.err.println("Error al conectar con la base de datos");
            return null;
        }
    };

//
//    *3bC1A&nt6Y$
//    db u484426513_anac325
//    user u484426513_anac325
//45.88.196.5

}
