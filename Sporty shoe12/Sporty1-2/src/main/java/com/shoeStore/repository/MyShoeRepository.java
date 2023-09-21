package com.shoeStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoeStore.entity.MyShoesList;

@Repository
public interface MyShoeRepository extends JpaRepository<MyShoesList, Integer>{

}
