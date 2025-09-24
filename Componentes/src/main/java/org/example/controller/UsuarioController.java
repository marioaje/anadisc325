package org.example.controller;

import org.example.dao.UsuarioDAO;
import org.example.model.Usuario;

import java.sql.SQLException;

public class UsuarioController {

    private UsuarioDAO usuarioDAO;

    public  UsuarioController() {
        usuarioDAO = new UsuarioDAO();
    }

    public void insertar(Usuario usuario) {
        usuarioDAO.insertar(usuario);
    }

}
