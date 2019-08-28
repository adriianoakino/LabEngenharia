package com.labeng.controllers;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.labeng.entities.Pedidos;
import com.labeng.entities.Sorvetes;
import com.labeng.services.PedidosService;
import com.labeng.services.SorvetesService;

@Controller
public class PedidoController {

    @Autowired
    private SorvetesService _sorvetesService;
    
    @Autowired
    private PedidosService _pedidosService;
    
    @RequestMapping(value = "/pedidos", method = RequestMethod.GET)
    public String pedido(Model model) {
	
	//this._sorvetesService.criaSorvetes();
	
	model.addAttribute("sorvetes" , this._sorvetesService.findByAll());
	
	return "pages/painel-pedidos.html";
    }
    
    @RequestMapping(value = "/pedidos", method = RequestMethod.POST)
    public String pedido(@ModelAttribute("sorvetes") Sorvetes sorvete, BindingResult bind) {

    	Pedidos novo = new Pedidos();
   		novo.setDate(new Date(System.currentTimeMillis()));
   		novo.setTotal(sorvete.getPreco() * sorvete.getQuantidade());
   		List<Sorvetes> sorvetes = new ArrayList<>();
   		sorvete.setEstoque(sorvete.getEstoque() - sorvete.getQuantidade());
   		sorvetes.add(sorvete);
   		novo.setStatus("Em Separação");
   		novo.setSorvetes(sorvetes);
   		
   		System.out.println(novo.toString());
    	try {

    		//novo.setId_pedido(this._pedidosService.findByAll().size()+1);
    		this._pedidosService.addPedido(novo);
    	} catch (Exception e) {
    		throw e;
    	}

    	return "pages/painel-pedidos.html";
    }
   
}
