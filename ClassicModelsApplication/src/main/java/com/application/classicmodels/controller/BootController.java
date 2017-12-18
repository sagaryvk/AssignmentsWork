package com.application.classicmodels.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.classicmodels.entity.CompositeKeys;
import com.application.classicmodels.entity.Orderdetails;
import com.application.classicmodels.entity.Products;

@Controller

public class BootController {
	@Autowired
	private SessionFactory sessionFactory;
	@RequestMapping("/allModelOrders")
	public ModelAndView allModelOrders(HttpServletRequest request)
	{
		
		Session session = sessionFactory.openSession();
		//ModelAndView modelAndView = null;
		Products prods = new Products();
		prods.setProductCode(request.getParameter("productCode"));
		Orderdetails orderDetails = new Orderdetails();
		
		CompositeKeys comp = new CompositeKeys();
		comp.setOrderNumber(Integer.parseInt(request.getParameter("orderNumber")));
		comp.setProductCode(request.getParameter("productCode"));
		//orderDetails.setOrderId(CompositeKeys);;
		//orderDetails.setOrderLineNumber(Integer.parseInt(request.getParameter("orderLine")));
		Query query = session.createQuery("select o from Orderdetails o where o.orderId.orderNumber = ? and  o.orderId.productCode = ?");
		
		query.setParameter(0, comp.getOrderNumber());
		//query.setParameter(1, orderDetails.getOrderLineNumber());
		query.setParameter(1, comp.getProductCode());
		Query query1 = session.createQuery("select p from Products p where p.productCode = ?");
		query1.setParameter(0, prods.getProductCode());
		List<Orderdetails> orders = query.list();
		List<Products> prodList = query1.list();
		ModelAndView modelAndView = new ModelAndView("BootStrap");
		if(orders.isEmpty())
		{
			modelAndView = new ModelAndView("failure");
		}
		else
		{
			modelAndView.addObject("orders", orders);
			modelAndView.addObject("products",prodList);
			
		}
		
		return modelAndView;
		
		
	}
}
