
  package com.shoeStore.entity;
  
  import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType; import javax.persistence.Id;
  
  @Entity 
  public class Shoe {
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY) 
  private int id;
  private String name;
  private String price;
public Shoe(int id, String name, String price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public Shoe() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
  
  }
 