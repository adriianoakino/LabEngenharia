package com.labeng.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.labeng.entities.Usuarios;
import com.labeng.services.UsuariosServices;


@Controller
public class UsuariosController {

    @Autowired
    private UsuariosServices _usuarioService;
    
    @RequestMapping(value = "/registrar", method = RequestMethod.POST)
    public String registrar(@ModelAttribute("usuario") Usuarios usuario,  Model model) {
	
	try {
	    System.out.println(usuario.toString());
	    this._usuarioService.registrarUsuario(usuario);
	    
	} catch (Exception e) {
	    System.out.println(e);
	    throw e;
	}
	
	return "pages/registro.html";
    }

    @RequestMapping(value = "/conectar", method = RequestMethod.POST)
    public String conectar(@ModelAttribute("usuario") Usuarios usuario) {
	
	try {
	    Usuarios user = this._usuarioService.searchUsuarioByUsername(usuario.getUsername());
	    
	    if(user.getUsername().equals(usuario.getUsername()) && user.getPassword().equals(usuario.getPassword())) {
		System.out.println("LOGOU");
	    } else {
		System.out.println("NÃO LOGOU");
	    }
	} catch(Exception e) {
	    throw e;
	}
	
	return "";
    }

}
