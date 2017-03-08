package com.niit.dao;


import java.util.List;

import com.niit.model.Category;
import com.niit.model.Product;

public interface ProductDAO {
	
	
	   public List<Product> list();
	   public boolean save(Product product);
	  

		// update category

		public boolean update(Product product);

		// delete category by id

		public boolean delete(String id);

		// delete category by category

		public boolean delete(Product product);

		// get category by id

		public Product getProductByID(String id);

		// get category by name
		public Product getProductByName(String name);

	

}
