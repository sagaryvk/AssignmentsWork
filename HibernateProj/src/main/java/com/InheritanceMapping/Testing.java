package com.InheritanceMapping;

import java.util.List;
import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.util.HibernateUtil;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query<Bidder> queryBidder = session.createQuery("from Bidder");
		List<Bidder> bidList = queryBidder.list();
		for(Bidder Obj1: bidList)
		{
	System.out.println(Obj1.getUserId());
	System.out.println(Obj1.getBidderId());
		}
		session.clear();
		
		Query<Seller> query3 = session.createQuery("from Seller");
		List<Seller> sellerList = query3.list();
		for(Seller Obj:sellerList)
		{
			System.out.println();
			System.out.println("Id: "+Obj.getUserId());
			System.out.println("Commission: "+Obj.getCommisionRate());
			System.out.println("Maximum Items: "+Obj.getMaxItems());
			System.out.println();
		}
		/*
		Seller selerObj = session.get(Seller.class, 101);
		
		System.out.println("UserID:"+selerObj.getUserId());
		System.out.println(selerObj.getCommisionRate());
		System.out.println(selerObj.getUserName());
		System.out.println("First Name:"+selerObj.getFirstName());
		System.out.println("Last Name:"+ selerObj.getLastName());
		*/
		//Bidder bidObj = session.get(entityType, id)
				
			
		session.close();
		sessionFactory.close();

	}

}
