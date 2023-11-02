package annotation;

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
		
		
		Student st = new Student();
		
		st.setId(1);
		st.setName("kamal");
		st.setEmail("kamal23@gmail.com");
		st.setAddress("Butwal");
		
		session.save(st);	//---save method to insert new data
		tr.commit();
		session.close();
		
	}

}
