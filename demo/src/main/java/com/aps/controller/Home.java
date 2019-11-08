package com.aps.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Home {
	
	@GetMapping("/index")
	public String homeView() {
		return "index";
	}
	
}
