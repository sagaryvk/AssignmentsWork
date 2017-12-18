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
import com.application.classicmodels.service.IOrdersService;
@Controller
public class OrderController {
	
	@Autowired
	private IOrdersService orderService;
	@RequestMapping("/allOrders")
	public ModelAndView allOrders()
	{
		List<Orderdetails> orders = orderService.listOrders();
		ModelAndView modelAndView = new ModelAndView("ordersView");	
		modelAndView.addObject("orders", orders);
		return modelAndView;
	}
	@RequestMapping("/allProducts")
	public ModelAndView allProducts()
	{
		List<Products> products = orderService.listProducts();
		ModelAndView modelAndView = new ModelAndView("productsView");
		modelAndView.addObject("products", products);
		return modelAndView;
	}
	@RequestMapping("/searchOrders")
	public ModelAndView searchOrders(HttpServletRequest request)
	{
		
		
		List<Orderdetails> orders = orderService.getOrdersById(Integer.parseInt(request.getParameter("orderNumber")), request.getParameter("productCode"));
		List<Products> products = orderService.getProductsById(request.getParameter("productCode"));
		ModelAndView modelAndView = new ModelAndView("SearchOrders");
		if(orders.isEmpty())
		{
			modelAndView = new ModelAndView("failure");
		}
		else
		{
		modelAndView.addObject("orders", orders);
		modelAndView.addObject("products", products);
		}
		return modelAndView;
	}
	
}

/*
@Controller
public class OrderController {
	@Autowired
	private SessionFactory sessionFactory;
	@RequestMapping("/allOrders")
	public ModelAndView allOrders()
	{
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from Orderdetails");
		//Query query = session.createQuery("select * from orderdetails where orderNumber = '10425'");
		
		List<Orderdetails> orders = query.list();
		
		ModelAndView modelAndView = new ModelAndView("ordersView");
		
		modelAndView.addObject("orders", orders);
		
		return modelAndView;
		
	}
}
*/
