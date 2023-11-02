package allAnnotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FetchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		
		//Employee emp = session.get(Employee.class, 1);
		Employee emp = session.load(Employee.class, 2);
		//--we can use both get and load for fetch---
		//System.out.println(emp);
		System.out.println("Name: "+emp.getEmpName());

	}

}
