package com.labeng.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.labeng.entities.Contato;
import com.labeng.services.ContatoService;

@Controller
public class ContatoController {

	
	@Autowired
	private ContatoService _contatoService;
	
	@RequestMapping(value = "/contato", method = RequestMethod.GET)
	public String contato() {
		return "pages/painel-contatos.html";
	}
	
	@RequestMapping(value = "/contato", method = RequestMethod.POST)
	public String contato(@ModelAttribute("contato") Contato contato) {
		
		System.out.println(contato.toString());
		
		try {
			this._contatoService.addContato(contato);
		}catch(Exception e) {
			throw e;
		}
		
		return "pages/painel-contatos.html";
	}
}
