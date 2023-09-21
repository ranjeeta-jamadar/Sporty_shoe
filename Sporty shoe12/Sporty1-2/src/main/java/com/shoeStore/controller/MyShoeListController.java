package com.shoeStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shoeStore.service.MyShoesListService;

@Controller
public class MyShoeListController {
	
	
	@Autowired
	private MyShoesListService service;
	
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id")int id) {
		service.deleteById(id);
		return "redirect:/my_shoes";
	}

}
