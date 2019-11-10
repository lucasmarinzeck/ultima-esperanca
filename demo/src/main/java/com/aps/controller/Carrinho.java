package com.aps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aps.model.Item;
import com.aps.repository.ItemRepository;

@Controller
public class Carrinho {

	@Autowired
	private ItemRepository itemRepo;
	
	@PostMapping("/carrinho-add")
	public String addCarrinho(@RequestParam("item") String item, @RequestParam("valor") String valor) {
		System.out.println("Acessou o carrinho...");
		System.out.println("Item: " +item + " Valor:" + valor);
		System.out.println("Adicionado ao carrinho");
		Item itemEntity = new Item(item, Double.valueOf(valor));
		itemRepo.save(itemEntity);
		return "redirect:/hamburger-carne";
	}
}
