import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;



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
			
			//Without HQL
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
					System.out.println("-----------------------------");
				}
			}
			// count to verify all records fetched correctly 
			System.out.println("Total records: "+ count);
			
			//USING HQL
			org.hibernate.Query query = session.createQuery(" select p from ProductLines p where p.ProductLine = 'Trains'");
			List<ProductLines> prodsList = query.list();
			for(ProductLines Obj: prodsList)
			{
				System.out.println("Product Line: "+Obj.getProductLine());
				System.out.println("Product Descripton: "+Obj.getTextDescription());
				System.out.println("----------------------");
			}
			org.hibernate.Query query1 = session.createQuery("select p from OrderDetails p where p.priceEach = 100.67");
			List<OrderDetails> orderList = query1.list();
			for(OrderDetails Obj: orderList)
			{
				//System.out.println("order Number: "+Obj.getOrderNumber());
				System.out.println("Price: "+Obj.getPriceEach());
				//System.out.println(Obj.getOrderLineNumber());
			}
			
			
			//org.hibernate.Query query2 = session.createQuery("select p from Products p where p.buyPrice>100 and p.productVendor like'G%'");
			//Positional bind parameters
			//org.hibernate.Query query2 = session.createQuery("select p from Products p where p.buyPrice>? and p.productVendor like ?");
			//Named bind parameters
			org.hibernate.Query query2 = session.createQuery("select p from Products p where p.buyPrice> :pprice and p.productVendor like :pname");
			//query2.setParameter(0, 100l);
			//query2.setParameter(1, "G%");
			query2.setParameter("pprice", 100l);
			query2.setParameter("pname", "G%");
			List<Products> pList = query2.list();
			for(Products Obj: pList)
			{
				System.out.println(Obj.getBuyPrice()+"\t"+Obj.getProductVendor());
			}
			org.hibernate.Query query3 = session.createQuery("select p.buyPrice,p.productVendor from Products p where p.buyPrice> :pprice and p.productVendor like :pname");
			query3.setParameter("pprice", 100l);
			query3.setParameter("pname", "G%");
			List<Object[]> objectArrayList = query3.list();
			for(Object[] obj: objectArrayList)
			{
				System.out.println(obj[0]+"\t"+obj[1]);
			}
			//Aggregate Function
			
			Query query4 = session.createQuery("select max(p.buyPrice) from Products p");
			
			long maxPrice = (Long) query4.uniqueResult();
			System.out.println("Max price: "+maxPrice);
			Query query5 = session.createQuery("select count(p) from Products p");
			long totalCount = (Long) query5.uniqueResult();
			System.out.println("Total count of rows in Product Table: "+totalCount);
			
			//Inner Join
			
			Query query6 = session.createQuery(" select p,l from Products p inner join p.prodLines l where p.prodLines = 'Trains' ");
			List<Object[]> objList = query6.list();
			for(Object[] Obj: objList)
			{
				Products prduct =(Products)Obj[0];
				ProductLines prodLines = (ProductLines)Obj[1];
				System.out.println();
				System.out.println("ProductCode: "+prduct.getProductCode());
				System.out.println("Price: "+prduct.getBuyPrice());
				System.out.println("Name: "+prduct.getProductName());
				
				System.out.println();
				System.out.println("ProductLine: "+prodLines.getProductLine());
				System.out.println("Description: "+prodLines.getTextDescription());
				System.out.println();
			}
			//LEFT Outer Join
			Query query7 =  session.createQuery("select p,l from Products p LEFT OUTER JOIN p.prodLines l");
			List<Object[]> fulljoinList = query7.list();
			for(Object[] Obj: fulljoinList)
			{
				Products prduct =(Products)Obj[0];
				ProductLines prodLines = (ProductLines)Obj[1];
				System.out.println();
				System.out.println("ProductCode: "+prduct.getProductCode());
				System.out.println("Price: "+prduct.getBuyPrice());
				System.out.println("Name: "+prduct.getProductName());
				
				System.out.println();
				System.out.println("ProductLine: "+prodLines.getProductLine());
				System.out.println("Description: "+prodLines.getTextDescription());
				System.out.println();
			}
			session.close();
			sessionFactory.close();
		
	}

}
