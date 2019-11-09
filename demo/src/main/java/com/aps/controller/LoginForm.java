package com.aps.controller;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aps.model.Cliente;
import com.aps.repository.ClienteRepository;

@Controller
public class LoginForm {
	
	@Autowired
	ClienteRepository ClienteRepository;
	
	@RequestMapping("/login")
	public String login(String email, String senha) {
		System.out.println(email + " " + senha);
		Cliente cliente = ClienteRepository.findByEmail("");
		if(cliente == null){
			return "/login-erro";
		} else {
			if(cliente.getSenha().equals(senha)) {
				return "/login-sucesso";
			} else {
				return "/";
			}
		}
	}
	
	@PostMapping("/login-erro")
	public String loginValida(Model model) {
		model.addAttribute("loginError", true);
		return "/cadastro";
	}

}
