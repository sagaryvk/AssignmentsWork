package com.mtc.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.InheritanceMapping.Bidder;
import com.InheritanceMapping.Seller;
import com.InheritanceMapping.Users;
import com.actionbazaar.persistence.Address;
import com.actionbazaar.persistence.Bid;
import com.actionbazaar.persistence.Billing;
import com.actionbazaar.persistence.CreditCard;
import com.actionbazaar.persistence.Item;
import com.classicmodels.persistence.Employee;
import com.classicmodels.persistence.Offices;
import com.classicmodels.persistence.OrderDetails;
import com.classicmodels.persistence.ProductLines;
import com.classicmodels.persistence.Products;
import com.mtc.app.entity.Product;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static{
		
		Configuration configuration = new Configuration();
		
		//Loads hibernate.cfg.xml
		configuration.configure();
		
		configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(Item.class);
		configuration.addAnnotatedClass(Bid.class);
		configuration.addAnnotatedClass(ProductLines.class);
		configuration.addAnnotatedClass(Products.class);
		configuration.addAnnotatedClass(OrderDetails.class);
		configuration.addAnnotatedClass(Offices.class);
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Billing.class);
		configuration.addAnnotatedClass(CreditCard.class);
		configuration.addAnnotatedClass(Address.class);
		configuration.addAnnotatedClass(Users.class);
		configuration.addAnnotatedClass(Seller.class);
		configuration.addAnnotatedClass(Bidder.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
