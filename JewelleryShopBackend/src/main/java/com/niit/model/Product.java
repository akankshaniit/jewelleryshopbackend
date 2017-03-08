package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
@Id	
private String id;
@Column(name="name")
private String name;
private String price;
private String qty;
private String image;


public String getId() {
	return id;
}

public String getImage() {
	return image;
}
public String getName() {
	return name;
}
public String getPrice() {
	return price;
}
public String getQty() {
	return qty;
}
public void setId(String id) {
	this.id = id;
}
public void setImage(String image) {
	this.image = image;
}
public void setName(String name) {
	this.name = name;
}
public void setPrice(String price) {
	this.price = price;
}
public void setQty(String qty) {
	this.qty = qty;
}

}
