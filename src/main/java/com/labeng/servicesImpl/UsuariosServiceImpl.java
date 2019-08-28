package com.labeng.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labeng.entities.Usuarios;
import com.labeng.repository.UsuariosRepository;
import com.labeng.services.UsuariosServices;

@Service
public class UsuariosServiceImpl implements UsuariosServices {

    @Autowired
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

    @Override
    public Usuarios searchUsuarioByUsername(String username) {
	return this._usuarioRepository.findByUsername(username);
	
    }

}
