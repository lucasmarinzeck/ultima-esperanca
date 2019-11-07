package com.aps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.aps.model.Cliente;
import com.aps.repository.ClienteRepository;

@Controller
public class CadastroForm {

	@Autowired
	private ClienteRepository clienteRepo;
	
	@GetMapping("/cadastro")
	public String cadastroView() {
		return "cadastro";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/cadastro")
	public String cadastroSubmit(Cliente cliente) {
		clienteRepo.save(cliente);
		return "redirect:/login";
	}
}
