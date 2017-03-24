package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;


@Entity
@Table(name="product")
public class Product {
	
@Id	
@NotBlank
private String id;
@Column(name="name")
@NotBlank
private String name;
@Column
String categoryId;
@Column
@Min(value=100)
private double price;
@Column
@Min(value=1)
private int qty;
@Column(name="image")
private String image;
@NotNull
@Transient
private MultipartFile file;


public String getId() {
	return id;
}

public String getImage() {
	return image;
}
public String getName() {
	return name;
}
public double getPrice() {
	return price;
}
public int getQty() {
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
public void setPrice(double price) {
	this.price = price;
}
public void setQty(int qty) {
	this.qty = qty;
}
public MultipartFile getFile() {
	return file;
}
public void setFile(MultipartFile file) {
	this.file = file;
}
public String getCategoryId() {
	return categoryId;
}

public void setCategoryId(String categoryId) {
	this.categoryId = categoryId;
}

}
