package com.niit.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.MyCart;

@Repository("cartDAO")
public class MyCartDAOImpl implements MyCartDAO {
	
	private static Logger log = LoggerFactory.getLogger(MyCartDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	public MyCartDAOImpl() {

	}

	public MyCartDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<MyCart> list(String userID) {
		log.debug("Starting of the method list");
		String hql = "from MyCart where userID=" + "'" + userID + "'  and status = " + "'N'";
		Query query = sessionFactory.openSession().createQuery(hql);
		log.debug("Ending of the method list");
		return query.list();

	}

	@Transactional
	public void save(MyCart mycart) {
		log.debug("Starting of the method save");

	//	mycart.setId(getMaxId());
		sessionFactory.openSession().save(mycart);
		log.debug("Ending of the method save");
	}

	@Transactional
	public Long getTotalAmount(String userID) {
		log.debug("Starting of the method getTotalAmount");
		String hql = "select sum(price) from MyCart where userID=" + "'" + userID + "' " + "  and status = " + "'N'";
		log.debug("hql" + hql);

		Query query = sessionFactory.openSession().createQuery(hql);
		log.debug("Ending of the method getTotalAmount");
		return (Long) query.uniqueResult();

	}

	public Long getMaxId() {
		log.debug("->->Starting of the method getMaxId");

		Long maxID = 100L;
		try {
			String hql = "select max(id) from MyCart";
			Query query = sessionFactory.openSession().createQuery(hql);
			maxID = (Long) query.uniqueResult();
		} catch (HibernateException e) {
			log.debug("It seems this is first record. setting initial id is 100 :");
			maxID = 100L;
			e.printStackTrace();
		}
		log.debug("Max id :" + maxID);
		return maxID + 1;

	}

	
	
}
