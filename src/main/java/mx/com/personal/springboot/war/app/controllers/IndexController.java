package mx.com.personal.springboot.war.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class IndexController {
	
	@Value("${application.controller.titulo}")
	private String titulo;
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo", titulo);
		
		return "index";
	}
}
