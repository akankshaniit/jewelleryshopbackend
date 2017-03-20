package com.niit.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="product")
public class Product {
	
@Id	
@NotBlank
private String id;
@Column(name="name")
@NotEmpty
private String name;



@Column
@NotEmpty
private String price;
@Column
@NotEmpty
private String qty;
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
public MultipartFile getFile() {
	return file;
}
public void setFile(MultipartFile file) {
	this.file = file;
}

}
