package com.aps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.aps.model.Cliente;
import com.aps.repository.ClienteRepository;
@Controller
public class Cardapio {

	@GetMapping("/cardapio")
		public String cardapioView() {
			return "cardapio";
	}
	

	
	
	@GetMapping("/hamburger-carne")
		public String hamburgerCarneView() {
			return "hamburger-carne";
	}	
	
	@GetMapping("/hamburger-frango")
		public String hamburgerFrangoView() {
			return "hamburger-frango";
	}
	@GetMapping("/hamburger-vegano")
		public String hamburgerVeganoView() {
			return "hamburger-vegano";
	}
	@GetMapping("/drinks")
		public String drinksView() {
			return "drinks";
	}
	@GetMapping("/acompanhamento")
		public String acompanhamentoView() {
			return "acompanhamento";
	}
	@GetMapping("/sobremesa")
		public String sobremesaView() {
			return "sobremesa";
	}
}


	