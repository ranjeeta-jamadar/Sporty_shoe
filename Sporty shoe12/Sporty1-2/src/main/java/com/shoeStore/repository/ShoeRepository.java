package com.shoeStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoeStore.entity.Shoe;



@Repository
public interface ShoeRepository extends JpaRepository<Shoe,Integer>{

}
