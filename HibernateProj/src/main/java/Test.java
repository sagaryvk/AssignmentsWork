import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("select p from Product p where p.id>200 and p.name like 'T%' ");
		List<Product> pordList = query.list();
		for(Product Obj: pordList)
		{
			System.out.println(Obj.getPrice() +"\t"+Obj.getId()+"\t"+Obj.getName());
			
		}
		System.out.println("--------------");
		Product product = session.get(Product.class, 201);
		System.out.println("PRODUCT ID:"+ product.getId());
		System.out.println("Name: "+product.getName());
		System.out.println("Price: "+product.getPrice());
		session.close();
		sessionFactory.close();
	}

}
