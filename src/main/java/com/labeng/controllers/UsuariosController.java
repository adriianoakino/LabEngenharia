package com.labeng.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.labeng.entities.Usuarios;
import com.labeng.servicesImpl.UsuariosServiceImpl;


@Controller
public class UsuariosController {

    private UsuariosServiceImpl _usuarioService;
    
    @RequestMapping(value = "/registrar", method = RequestMethod.POST)
    public String registrar(@ModelAttribute("usuario") Usuarios usuario,  Model model) {
	
	try {
	    System.out.println("Bairro: " + usuario.getBairro() + "| CEP: " + usuario.getCep() 
		    + "\nCidade: " + usuario.getCidade() + "| Estado: " +  usuario.getEstado()+ "| Rua: " +usuario.getLogadouro()
		    + "\nNome: " + usuario.getNome()  + "| Numero: " + usuario.getNumero() 
		    + "\nPassword: " +usuario.getPassword()+ " | Username: " + usuario.getUsername());
	    this._usuarioService.registrarUsuario(usuario);
	    
	} catch (Exception e) {
	    System.out.println(e);
	    throw e;
	}
	
	return "pages/registro.html";
    }
}
