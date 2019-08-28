package com.labeng.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String index() {
	
	return "pages/index.html";
	
    }
    
    @RequestMapping("/conectar")
    public String logar() {
	
	return "pages/login.html";
	
    }
    
    @RequestMapping(value = "/registrar", method = RequestMethod.GET)
    public String registro() {
	
	return "pages/registro.html";
	
    }
    
    
    
}
