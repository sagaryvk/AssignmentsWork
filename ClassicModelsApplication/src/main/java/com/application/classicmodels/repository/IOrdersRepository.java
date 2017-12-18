package com.application.classicmodels.repository;

import java.util.List;

import com.application.classicmodels.entity.Orderdetails;
import com.application.classicmodels.entity.Products;

public interface IOrdersRepository {

	public List<Orderdetails> listOrders();
	public List<Products> listProducts();
	public List<Orderdetails> getOrdersById(int id,String prodCode);
	public List<Products> getProductsById(String id);
	
	 
}
