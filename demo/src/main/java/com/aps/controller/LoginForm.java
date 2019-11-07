package com.aps.controller;

import javax.annotation.PostConstruct;

import org.hibernate.hql.internal.ast.tree.IsNullLogicOperatorNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.aps.model.Cliente;
import com.aps.repository.ClienteRepository;

@Controller
public class LoginForm {

	private String senha;
	private String email;
	
	@Autowired
	private ClienteRepository clienteRepo;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String loginValida(String email, String senha) {
		this.email = email;
		this.senha = senha;
		
		Cliente cliente = new Cliente(this.email, this.senha);
		
		
		return null;
	}
	
	private boolean validaLogin(Cliente form) throws Exception{
		Cliente cliente = this.clienteRepo.findByEmail(cliente);
		if(cliente == null) {
			throw new Exception("Cliente não encontrado");
		}
		else if(this.senha.equals(cliente.getSenha())) {
			return true;
		}
	}
}
