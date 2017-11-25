package com.InheritanceMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

import org.hibernate.Query;

import com.classicmodels.persistence.ProductLines;
import com.classicmodels.persistence.Products;
import com.mtc.app.util.HibernateUtil;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		//Select Query
		org.hibernate.query.Query<Users> query = session.createQuery("from Users");
		List<Users> userList = query.list();
		for(Users Obj:userList)
		{
			System.out.println();
			System.out.println("Id: "+Obj.getUserId());
			System.out.println("Name: "+Obj.getFirstName()+" "+Obj.getLastName());
			System.out.println();
		}
		//Select Query using positional Bind parameters to filter by Id
		org.hibernate.query.Query<Users> query2 = session.createQuery(" select u from Users u where u.userId = ?");
		query2.setParameter(0, 401);
		List<Users> userList1 = query2.list();
		for(Users Obj:userList1)
		{
			System.out.println();
			System.out.println("Id: "+Obj.getUserId());
			System.out.println("Name: "+Obj.getFirstName()+" "+Obj.getLastName());
			System.out.println();
		}
		session.clear();
		
		org.hibernate.query.Query<Seller> query3 = session.createQuery("from Seller");
		List<Seller> sellerList = query3.list();
		for(Seller Obj:sellerList)
		{
			System.out.println();
			System.out.println("Id: "+Obj.getUserId());
			System.out.println("Commission: "+Obj.getCommisionRate());
			System.out.println("Maximum Items: "+Obj.getMaxItems());
			System.out.println();
		}
		session.clear();
		org.hibernate.query.Query<Bidder> queryBidder = session.createQuery("from Bidder");
		List<Bidder> bidList = queryBidder.list();
		for(Bidder Obj1: bidList)
		{
			System.out.println(Obj1.getUserId());
			System.out.println(Obj1.getBidderId());
			System.out.println("Name: "+Obj1.getFirstName()+" "+Obj1.getLastName());
		}
		//Join Tables
		/*org.hibernate.query.Query<Object> queryjoin = session.createQuery("select s,u from Seller s inner join Users u on s.userId = u.userId");
		List<Object[]> objList = queryjoin.list();
		for(Object Obj: objList)
		{
			Seller seler =(Seller)Obj[0];
			Users usr = (Users)Obj[1];
			System.out.println();
			System.out.println(seler.getUserId());
			System.out.println("Name:"+seler.getFirstName()+" "+seler.getLastName());
			System.out.println("Comission Rate:"+seler.getCommisionRate());
			System.out.println();
		}
		*/
		/*
		Query queryjoin1 = session.createQuery("select b,u from Bidder b inner join Users u on b.userId = u.userId");
		List<Object[]> objList1 = queryjoin1.list();
		for(Object[] Obj: objList1)
		{
			Bidder bid =(Bidder)Obj[0];
			Users usr = (Users)Obj[1];
			System.out.println();
			System.out.println(bid.getUserId());
			System.out.println("Name:"+bid.getFirstName()+" "+bid.getLastName());
			System.out.println("BidderId: "+bid.getBidderId());
			System.out.println();
		}
		*/
		
	
		
		//Inner join Tables
	
		session.close();
		sessionFactory.close();
	
	}

}
