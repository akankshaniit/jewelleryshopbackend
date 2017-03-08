package com.niit.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.Category;
import com.niit.model.Product;

public abstract class ProductDAOImpl implements ProductDAO{


	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	public List<Product> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from product").list() ;
	}

	public boolean save(Product product) {
		try
		{
		sessionFactory.getCurrentSession().save(product);
		return true;
		} catch(Exception e)
		{
			e.printStackTrace(); //it will print the error in the console - similar to SOP
			          //package, class, method line number from which place you are calling
			return false;
		}
	}
	
	
	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		}catch (Exception e)
		{
			e.printStackTrace();
			return false;
			
		}	
	}

	public boolean delete(String id) {
		try {
			sessionFactory.getCurrentSession().delete(getProductByID(id));
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean delete(Product product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			
		}
	}

	public Product getProductByID(String id) {
		//select * from Category where id ='mobile'
		//  return	(Category)  sessionFactory.getCurrentSession().get(Category.class, id);
		  
		  return  (Product) sessionFactory.getCurrentSession().createQuery("from Product where id = '"+id + "'").uniqueResult();
			
	}

	public Product getProductByName(String name) {
		 return  (Product) sessionFactory.getCurrentSession().createQuery("from Product where name = '"+name + "'").list().get(0);
			

	}
	
	
}
