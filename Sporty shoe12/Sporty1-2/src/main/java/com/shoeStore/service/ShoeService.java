package com.shoeStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoeStore.entity.Shoe;
import com.shoeStore.repository.ShoeRepository;

@Service
public class ShoeService {
    
	@Autowired
	private ShoeRepository sRepo;
	
	public void  save(Shoe s) {
		sRepo.save(s);
	}
	
	public List<Shoe> getAllshoe(){
		return sRepo.findAll();
	}
public Shoe getShoeById(int id) {
	return sRepo.findById(id).get();
}

     public void  deleteById(int id) {
    	 sRepo.deleteById(id);
     }
}
