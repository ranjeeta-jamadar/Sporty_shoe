package com.shoeStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.shoeStore.entity.MyShoesList;
import com.shoeStore.entity.Shoe;
import com.shoeStore.service.MyShoesListService;
import com.shoeStore.service.ShoeService;

@Controller
public class ShoeController {
	
	@Autowired
	private ShoeService service;
	
	@Autowired
	
	private  MyShoesListService  myShoesService;
	@GetMapping("/")
	public  String home() {
		return "home";
	}
	@GetMapping("/shoe_register")
	public String  shoeRegister() {
		return "shoeRegister";
		
	}
    @GetMapping("/available_shoes")
    public ModelAndView getAllshoe() {
		List<Shoe>list=service.getAllshoe();
//		ModelAndView m=new ModelAndView();
//	    m.setViewName("shoeList");
//		m.addObject("Shoe",list);
		return new ModelAndView("shoeList","Shoe",list);
		
     
    }
    @PostMapping("/save")
    public  String addShoe(@ModelAttribute Shoe s) {
    	service.save(s);
    	return "redirect:/available_shoes";
    	
    }
    @GetMapping("/my_shoes")
    public String getMyshoes(Model model) 
    {
    	
    	List<MyShoesList>list=myShoesService.getAllMyShoes();
    	model.addAttribute("Shoe",list);
    	return "myshoes";
    }
    @RequestMapping("/mylist/{id}")
       public String getMyList(@PathVariable("id")int id) {
    	Shoe s=service.getShoeById(id);
    	MyShoesList ms=new MyShoesList(s.getId(),s.getName(),s.getPrice());
    	myShoesService.saveMyShoes(ms);
    	return  "redirect:/my_shoes";
    }
    @RequestMapping("/editshoe/{id}")
    public String editshoe(@PathVariable("id") int id,Model model) {
    	Shoe s=service.getShoeById(id);
    	model.addAttribute("shoe",s);
    	return"ShoeEdit";
    }
    @RequestMapping("/deleteshoe/{id}")
    public String  deleteshoe(@PathVariable("id")int id) {
    	service.deleteById(id);
    	return"redirect:/available_shoes";
    }
}
    
