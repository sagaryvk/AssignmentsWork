import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.actionbazaar.persistence.Bid;
import com.actionbazaar.persistence.Item;
import com.mtc.app.util.HibernateUtil;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item = new Item(113L,"iPhone7",new Date(),new BigDecimal(300),new Date(),new Date());
	
		Bid bid1 = new Bid(99901L,new BigDecimal(200),new Date());	
		
		Bid bid2 = new Bid(99902L,new BigDecimal(210),new Date());
		Set<Bid> bids = new HashSet<Bid>();
		bids.add(bid1);
		bids.add(bid2);
		item.setBids(bids);
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		org.hibernate.Transaction transaction = session.getTransaction();
		/*
		Item itemObj = session.get(Item.class, 111L);
		System.out.println("Item Name"+itemObj.getItemName());
		Set<Bid> it = itemObj.getBids();
		for(Bid Obj: it)
		{
			System.out.println("Bid Id:"+ Obj.getBidId());
		}
	
		
		//System.out.println(itemObj.);
		//System.out.println();
		//Bid bidObj = session.get(Bid.class, 111);
		//System.out.println(bidObj.getBidId());
		*/
		transaction.begin();
		
		session.save(item);
			
		transaction.commit();
		
		session.close();
		
		sessionFactory.close();
	}

}
