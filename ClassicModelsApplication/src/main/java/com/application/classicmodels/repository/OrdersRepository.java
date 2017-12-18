package com.application.classicmodels.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.classicmodels.entity.Orderdetails;
import com.application.classicmodels.entity.Products;

@Repository("classicmodels")
public class OrdersRepository implements IOrdersRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Orderdetails> listOrders() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Orderdetails");
		List<Orderdetails> orderList = query.list();
		return orderList;
	}
	public List<Products> listProducts()
	{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Products");
		List<Products> prodsList = query.list();
		return prodsList;
	}
	@Override
	public List<Orderdetails> getOrdersById(int id, String prodCode) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.openSession();
		Query query = session.createQuery("select o from Orderdetails o where o.orderId.orderNumber = ? and  o.orderId.productCode = ?");
		query.setParameter(0, id);
		query.setParameter(1, prodCode);
		List<Orderdetails> orderList = query.list();
		return orderList;
	}
	public List<Products> getProductsById(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("select p from Products p where p.productCode = ?");
		query.setParameter(0, id);
		List<Products> prodList = query.list();
		return prodList;
	}

}
