package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import com.uca.capas.domain.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login(Usuario usuario) {
		return "LOGIN";
	}
	
	@PostMapping("/validacion")
	public String validacion (Usuario usuario) {
		return "validando";
	}
}
