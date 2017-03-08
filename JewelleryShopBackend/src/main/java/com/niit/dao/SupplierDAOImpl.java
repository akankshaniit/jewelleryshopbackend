package com.niit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.Supplier;
import com.niit.model.User;

public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	

	public List<Supplier> list() {
		
		 return sessionFactory.getCurrentSession().createQuery("from supplier").list();	
	}

	public Supplier getSupplier(String id) {
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, id);
	}

	public boolean save(Supplier supplier) {
		try
		{
			getSession().save(supplier);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		}catch (Exception e)
		{
			e.printStackTrace();
			return false;
			
		}	
	}


	public boolean delete(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}catch (Exception e)
		{
			e.printStackTrace();
			return false;
			
		}	
	}

}
