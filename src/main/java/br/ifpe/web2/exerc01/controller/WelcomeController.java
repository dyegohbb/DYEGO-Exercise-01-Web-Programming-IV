package br.ifpe.web2.exerc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String main(Model model) {
        return "start-page";
    }

    // /click?language={language selected without case sensitive}
    @GetMapping("/click")
    public String mainWithParam(
            @RequestParam(name = "language", required = false, defaultValue = "") 
			String language, Model model) {
    	
    		for (Languages t : Languages.values()) {
    			if(t.toString().toLowerCase().equals(language.toLowerCase())) {
    				model.addAttribute("text", t.getTexto());
    				return "home";
    			}
    		  }
    	model.addAttribute("text", "[ERR404 - Language not found]");
        return "start-page";
    }
}