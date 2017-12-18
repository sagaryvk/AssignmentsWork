package com.application.classicmodels.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.classicmodels.entity.Orderdetails;
import com.application.classicmodels.entity.Products;
import com.application.classicmodels.repository.IOrdersRepository;

@Service("ordersService")
public class OrdersService implements IOrdersService {
	@Autowired
	private IOrdersRepository orderRepository;

	public OrdersService() {
		super();
	}

	public IOrdersRepository getOrderRepository() {
		return orderRepository;
	}

	public void setOrderRepository(IOrdersRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public OrdersService(IOrdersRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}
	//@Transactional
	@Override
	public List<Orderdetails> listOrders() {
		// TODO Auto-generated method stub
		return this.orderRepository.listOrders();
	}

	@Override
	public List<Products> listProducts() {
		// TODO Auto-generated method stub
		return this.orderRepository.listProducts();
	}

	public List<Orderdetails> getOrdersById(int id, String prodCode) {
		// TODO Auto-generated method stub
		return this.orderRepository.getOrdersById(id, prodCode);
	}

	@Override
	public List<Products> getProductsById(String id) {
		// TODO Auto-generated method stub
		return this.orderRepository.getProductsById(id);
	}

}
