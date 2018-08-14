package com.labeng.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PainelController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String painel() {
	return "pages/painel-home.html";
    }
    
    
}
