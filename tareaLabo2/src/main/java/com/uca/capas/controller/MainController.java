package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import com.uca.capas.domain.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login(Usuario usuario) {
		return "login";
	}
	
	@PostMapping("/validacion")
	public String val(@Valid Usuario usuario) {

		if (usuario.Validacion(usuario.getNombre(), usuario.getContra())== false) {
			return "MostrarMensajeF";
		}

		return "redirect:/MostrarMensajeV";
	}
}
