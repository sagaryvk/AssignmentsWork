import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.classicmodels.persistence.OrderDetails;
import com.classicmodels.persistence.Products;
import com.mtc.app.util.HibernateUtil;

public class TestProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Products prodObj = session.get(Products.class, "S50_1514");
		System.out.println("Product Code: "+prodObj.getProductCode());
		System.out.println("Descripton: "+ prodObj.getProductDescription());
		Set<OrderDetails> ordersObj = prodObj.getOrderDetails();
		for(OrderDetails Obj: ordersObj)
		{
			System.out.println("Line Number: "+Obj.getOrderLineNumber());
			System.out.println("Price: "+Obj.getPriceEach());
			System.out.println("Quantity: "+Obj.getQuantityOrdered());
			System.out.println("---------------------------");
		}
	}

}
