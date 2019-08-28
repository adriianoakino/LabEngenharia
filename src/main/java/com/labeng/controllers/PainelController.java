package com.labeng.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.labeng.services.PedidosService;

@Controller
public class PainelController {

	@Autowired
	private PedidosService _pedidosService;
	
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String painel(Model model) {
    	
    model.addAttribute("pedidos", this._pedidosService.findByAll());	
    System.out.println(this._pedidosService.findByAll());
	return "pages/painel-home.html";
    }
    
    
}
