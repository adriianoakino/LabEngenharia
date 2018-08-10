package com.labeng.servicesImpl;

import com.labeng.entities.Usuarios;
import com.labeng.repository.UsuariosRepository;
import com.labeng.services.UsuariosServices;

public class UsuariosServiceImpl implements UsuariosServices {

    private UsuariosRepository _usuarioRepository;
    
    @Override
    public void registrarUsuario(Usuarios usuario) {
	this._usuarioRepository.save(usuario);
    }

    @Override
    public void updateUsuario(Usuarios usuario) {
	this._usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Usuarios usuario) {
	this._usuarioRepository.delete(usuario);
	
    }

}
