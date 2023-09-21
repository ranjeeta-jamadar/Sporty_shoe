package com.shoeStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoeStore.entity.MyShoesList;
import com.shoeStore.repository.MyShoeRepository;

@Service
public class MyShoesListService {
        
	@Autowired
	private MyShoeRepository myshoes;
	
	
	public void saveMyShoes(MyShoesList Shoe) {
		myshoes.save(Shoe);
			}
	
	public  List<MyShoesList> getAllMyShoes(){
		return myshoes.findAll();
	}
	public void deleteById(int id) {
		myshoes.deleteById(id);
	}
}
