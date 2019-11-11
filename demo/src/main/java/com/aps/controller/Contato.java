package com.aps.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class Contato {

		
		@GetMapping("/contato")
		public String contatoView() {
			return "contato";
		}
		
	

}
