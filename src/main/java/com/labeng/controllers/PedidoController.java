package com.labeng.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.labeng.services.SorvetesService;

@Controller
public class PedidoController {

    @Autowired
    private SorvetesService _sorvetesService;
    
    @RequestMapping(value = "/pedidos", method = RequestMethod.GET)
    public String pedido(Model model) {
	
	//this._sorvetesService.criaSorvetes();
	
	model.addAttribute("sorvetes" , this._sorvetesService.findByAll());
	
	return "pages/painel-pedidos.html";
    }
   
}
