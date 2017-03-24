package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="mycart")
public class MyCart {

	@Id
	@GeneratedValue
	private int id;
	@Column
	@NotEmpty
	private String userid;
	@Column
	@NotEmpty
	private String product_name;
	@Column
	@NotEmpty
	private double price;
	@Column
	@NotEmpty
	private char status;
	@Column
	@NotEmpty
	private int quantity;
	@Column
	@DateTimeFormat
	private int date_added;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getDate_added() {
		return date_added;
	}
	public void setDate_added(int date_added) {
		this.date_added = date_added;
	} 
	
	
	
}
