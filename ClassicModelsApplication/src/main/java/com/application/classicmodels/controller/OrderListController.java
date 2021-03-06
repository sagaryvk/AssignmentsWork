/*package com.application.classicmodels.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.classicmodels.service.IProductService;
import com.application.classicmodels.vo.Order;

@Controller
public class OrderListController {
	@Autowired
	private IProductService productService;
	@RequestMapping("orderProcess")
	public ModelAndView requestOrder(HttpServletRequest request)
	{
ModelAndView modelAndView = null;
		
		Order order = new Order();
		
		order.setOrderId(Integer.parseInt(request.getParameter("orderId")));
		order.setProductId(Integer.parseInt(request.getParameter("productId")));
		order.setOrderQuantiy(Integer.parseInt(request.getParameter("orderQuantiy")));
		
		boolean result = productService.processOrder(order);
		
		if(result) {
			                              //view name
			modelAndView = new ModelAndView("success");
			modelAndView.addObject("order",order);
			
			return modelAndView;
		}
		
		                             //view name
		modelAndView = new ModelAndView("failure");
		
		return modelAndView;
	}
}
*/
