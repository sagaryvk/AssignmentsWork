import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.classicmodels.persistence.Offices;
import com.classicmodels.persistence.OrderDetails;
import com.classicmodels.persistence.ProductLines;
import com.classicmodels.persistence.Products;
import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class TestProductLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// TODO Auto-generated method stub
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			ProductLines product = session.get(ProductLines.class, "Trains");
			System.out.println("PRODUCTLINE: "+ product.getProductLine());
			System.out.println("Description: "+product.getTextDescription());
			System.out.println("-------------------------");
			//Filtering products By product Line
			Set<Products> prodList = product.getProducts();
			for(Products Obj: prodList)
			{
				System.out.println("Product Code: "+Obj.getProductCode());
				System.out.println("Product Name:" +Obj.getProductName());
				System.out.println("BuyPrice: "+Obj.getBuyPrice());
				System.out.println("Quantity: "+Obj.getQuantityInStock());
				System.out.println("MSRP: "+Obj.getMSRP());
				System.out.println("--------------------------");
			}
			
			//To get values of order details filter by product Line
			int count = 0;
			Set<Products> prodList1 = product.getProducts();
			for(Products Obj: prodList)
			{
				Set<OrderDetails> orderList = Obj.getOrderDetails();
				for(OrderDetails Obj1: orderList)
				{
					count ++;
					System.out.println("orderNumber: "+Obj1.getOrderNumber());
					System.out.println("product Code: "+Obj.getProductCode());
					System.out.println("Quantity Ordered: "+Obj1.getQuantityOrdered());
					System.out.println("Order Line Number:"+Obj1.getOrderLineNumber());
				}
			}
			// count to verify all records fetched correctly 
			System.out.println("Total records: "+ count);
			session.close();
			sessionFactory.close();
		
	}

}
