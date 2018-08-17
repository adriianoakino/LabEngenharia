package com.labeng.controllers;



import static org.assertj.core.api.Assertions.withPrecision;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.labeng.entities.Sorvetes;

import com.labeng.services.SorvetesService;

@Controller
public class PedidoController {

    @Autowired
    private SorvetesService _sorvetesService;
    
    @RequestMapping(value = "/pedidos", method = RequestMethod.GET)
    public String pedido(Model model) {
	
	//this._sorvetesService.criaSorvetes();
	
	List<com.labeng.model.Sorvetes> sorvetes= new ArrayList<>();
	
	List<Sorvetes> s = this._sorvetesService.findByAll();
	for(int i = 0; i < s.size(); i ++) {
	    com.labeng.model.Sorvetes se= new com.labeng.model.Sorvetes();
	   se.setId_sorvete(s.get(i).getId_sorvete());
	   se.setEstoque(s.get(i).getEstoque());
	   se.setNome(s.get(i).getNome());
	   se.setPreco(s.get(i).getPreco());
	   se.setQuantidade(0);
	   
	   sorvetes.add(se);
	}
	
	//model.addAttribute("sorvetes" , this._sorvetesService.findByAll());
	model.addAttribute("sorvetes" , sorvetes);
	
	return "pages/painel-pedidos.html";
    }
    
    @RequestMapping(value = "/pedidos", method = RequestMethod.POST)
    public String pedido(@ModelAttribute("pedidos") com.labeng.model.Sorvetes pedido, BindingResult bind) {
	
	System.out.println(pedido.toString());

	return "pages/painel-pedidos.html";
    }
   
}
