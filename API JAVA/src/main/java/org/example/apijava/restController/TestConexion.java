package org.example.apijava.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConexion {

    @Autowired
    private JdbcTemplate jdbcTemplate;


//        @RequestMapping("/probarConexion")
        @GetMapping("probarConexion")
        public String probarConexion(){


            try {
                jdbcTemplate.execute("Select 1");
                return "Conexion establecida";
            } catch (Exception e) {
                return "Conexion no establecida";
            }

            // =====
//           String URL = "jdbc:mysql://45.88.196.5:3306/u484426513_anac325";
//           String usuario = "u484426513_anac325";
//           String password = "*3bC1A&nt6Y$";
//
//
//                try(Connection conn = DriverManager.getConnection(URL, usuario, password))
//                {
//
//                    return "Conexion establecida";
//                }catch(SQLException e){
//                  //  System.err.println("Error al conectar con la base de datos");
//                    return "Conexion no establecida";
//                }

        }

}
