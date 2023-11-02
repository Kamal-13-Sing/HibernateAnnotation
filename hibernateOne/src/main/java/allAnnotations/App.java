package allAnnotations;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil.getSessionFactory();

		//System.out.println(factory);
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		
		/*
		 * Student st = new Student();
		 * 
		 * st.setId(1); st.setName("kamal"); st.setEmail("kamal23@gmail.com");
		 * st.setAddress("Butwal");
		 * 
		 * session.save(st); //---save method to insert new data tr.commit();
		 * session.close();
		 */
		
		Employee emp = new Employee();
		emp.setEmpName("Sapana");
		emp.setEmail("sapana@gmail.com");
		emp.setSalary(15000.00);
		emp.setJoiningDate(new Date());
		emp.setStatus(true);
		emp.setToken("sp98usj");	//--not insert because of transient
		
		session.save(emp);
		tr.commit();
		session.close();
		
	}

}
