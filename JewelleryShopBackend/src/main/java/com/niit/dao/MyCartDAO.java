package com.niit.dao;

import java.util.List;

import com.niit.model.MyCart;



public interface MyCartDAO {

	public List<MyCart> list(String UserID);
	public void save(MyCart mycart);
	public Long getTotalAmount(String UserId);
	public Long getMaxId();
	
}
