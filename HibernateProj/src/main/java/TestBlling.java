import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import com.actionbazaar.persistence.Address;
import com.actionbazaar.persistence.Billing;
import com.actionbazaar.persistence.CreditCard;
import com.mtc.app.util.HibernateUtil;

public class TestBlling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Billing billingObj = session.get(Billing.class, 100);
		System.out.println("Billing Id: "+billingObj.getBillingId());
		CreditCard creditObj = billingObj.getCreditcardId();
		System.out.println("Account Number: "+creditObj.getAccountNumber());
		System.out.println("Name: "+creditObj.getNameOnCard());
		System.out.println("----------------------");
		Address addressObj = billingObj.getBllingAddress();
		
		System.out.println("Address ID: "+addressObj.getAddressId());
		System.out.println("City: "+addressObj.getCity());
	}

}
