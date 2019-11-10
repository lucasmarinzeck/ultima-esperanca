package com.aps.controller;

import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aps.model.CarrinhoEntity;
import com.aps.model.Item;
import com.aps.repository.ItemRepository;

@Controller
public class Carrinho {

	@Autowired
	private ItemRepository itemRepo;

	@PostMapping("/carrinho-add")
	public String addCarrinho(@RequestParam("item") String item, @RequestParam("valor") String valor) {
		System.out.println("Acessou o carrinho...");
		System.out.println("Item: " + item + " Valor:" + valor);
		System.out.println("Adicionado ao carrinho");
		Item itemEntity = new Item(item, Double.valueOf(valor));
		itemRepo.save(itemEntity);
		return "redirect:/hamburger-carne";
	}

//	private void carrinhoEntrada(Item item) {
//		CarrinhoEntity carrinho = new CarrinhoEntity();
//		carrinho.setItens(itens);
//		carrinho.setDataCompra(new Date(System.currentTimeMillis()));
//	}

	@GetMapping("/list-itens")
	public ModelAndView listaritens() {
		Double total = 0.0;
		AtomicReference<Double> totalAtomic = new AtomicReference<>(total);
		ModelAndView view = new ModelAndView("listitem");
		Iterable<Item> itensIT = itemRepo.findAll();
		itensIT.forEach(i -> {
			totalAtomic.accumulateAndGet(i.getPreco(), (x1, x2) -> x1+x2);
		});
		view.addObject("total", totalAtomic.get().toString());
		view.addObject("itens", itensIT);
		return view;
	}
	
	@GetMapping("/carrinho-view")
	public String carrinhoView() {
		return "listitem";
	}
}
