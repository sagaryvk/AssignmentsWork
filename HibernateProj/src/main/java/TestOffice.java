import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.classicmodels.persistence.Employee;
import com.classicmodels.persistence.Offices;
import com.mtc.app.util.HibernateUtil;

public class TestOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Offices officeObj = new Offices("91", "Chennai", "401", "OMR", "Sholingnallur", "TN", "INDIA", "6100", "Main");
		Employee emp1 = new Employee(51431, "R", "Raja", "044", "Raja@gmail.com",officeObj.getOfficeCode(), 1002, "Manager");
		Employee emp2 = new Employee(51430, "A", "Bharath", "045", "Bharath@gmail.com",officeObj.getOfficeCode(), 1002, "Lead");
		Set<Employee> empList = new HashSet<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		officeObj.setEmp(empList);
	*/	
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		
			transaction.begin();
		
			//session.save(officeObj);
			
		transaction.commit();
		Offices officeObj = session.get(Offices.class, "91");
		System.out.println("City: "+officeObj.getCity());
		System.out.println("State: "+officeObj.getState());
		System.out.println("Country: "+officeObj.getCountry());
		Set<Employee> empList = officeObj.getEmp();
		for(Employee Obj: empList)
		{
			System.out.println("Employee Number: "+Obj.getEmployeeNumber());
			System.out.println(Obj.getFirstName()+"  "+Obj.getLastName());
			System.out.println("E-Mail: "+Obj.getEmail());
			System.out.println("------------------");
		}
		
		
		
		session.close();
		sessionFactory.close();
	}

}
