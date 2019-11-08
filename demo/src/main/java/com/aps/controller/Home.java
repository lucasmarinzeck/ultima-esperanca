package com.aps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Home {
	
	@GetMapping("/index")
	public String homeView() {
		return "index";
	}
	
}
