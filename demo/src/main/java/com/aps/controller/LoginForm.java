package com.aps.controller;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aps.model.Cliente;
import com.aps.repository.ClienteRepository;

@Controller
public class LoginForm {
	
	@Autowired
	ClienteRepository ClienteRepository;
	
	@PostMapping("/loginValida")
	public String loginValida(@RequestParam("email") String email, @RequestParam("senha") String senha) {
		System.out.println(email + " " + senha);
		Cliente cliente = ClienteRepository.findByEmail(email);
		if(cliente == null){
			System.out.println("-----------------------------------------------------------");
			System.out.println("...... Usuario não encontrado na nossa base de dados ......");
			System.out.println("-----------------------------------------------------------");
			return "redirect:/login-erro";
		} else {
			if(cliente.getSenha().equals(senha)) {
				System.out.println("Dados do usuario batem, encaminhando para a HomePage");
				System.out.println("------------------------- CLIENTE -------------------------");
				System.out.println(cliente);
				System.out.println("-----------------------------------------------------------");
				return "redirect:/login-sucesso";
			} else {
				return "redirect:/login-erro";
			}
		}
		
//		return "/cadastro";
	}
	
	@GetMapping("login-sucesso")
	public String sucesso() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("SUCESSO ......");
		System.out.println("-----------------------------------------------------------");
		return "index";
	}
	
	@GetMapping("login-erro")
	public String erro() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("ERRO ......");
		System.out.println("-----------------------------------------------------------");
		return "redirect:/cadastro";
	}

}
