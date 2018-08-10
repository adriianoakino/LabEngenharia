package com.labeng.services;

import com.labeng.entities.Usuarios;

public interface UsuariosServices {

    void registrarUsuario(Usuarios usuario);
    void updateUsuario(Usuarios usuario);
    void deleteUsuario(Usuarios usuario);
    Usuarios searchUsuarioByUsername(String username);
}
