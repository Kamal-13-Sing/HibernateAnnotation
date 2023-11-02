package crudHibernate;

import java.util.List;

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
		
		
		//------------create table and data-------
		/*
		 * Student st = new Student(); st.setName("kamal"); st.setAddress("Butwal");
		 * st.setEmail("kamal23@gmail.com");
		 * 
		 * Student st2 = new Student(); st2.setName("Bimal"); st2.setAddress("Palpa");
		 * st2.setEmail("bimal3@gmail.com");
		 * 
		 * session.save(st); //---save method to insert new data tr.commit();
		 * session.save(st2);
		 * 
		 * tr.commit(); System.out.println("Sucess register student");
		 */
		  
		
		//---------read and display data-----------
		
		/*
		 * List<Student> list = session.createQuery("from Student",
		 * Student.class).list();
		 * 
		 * // list.forEach(e -> System.out.println("Name: "+e.getName()));
		 * 
		 * //-------another way foreach------------ for(Student s : list) {
		 * System.out.println("Name: "+s.getName());
		 * System.out.println("Address: "+s.getAddress());
		 * System.out.println("Email: "+s.getEmail());
		 * System.out.println("-----------------"); }
		 */
		
	//--------read with given value-----------
	/*
	 * Student st = session.get(Student.class, 1);//--whose id = 1
	 * System.out.println("Name: "+st.getName());
	 * System.out.println("Address: "+st.getAddress());
	 * System.out.println("Email: "+st.getEmail());
	 */
		
	//-----------update value--------------
	/*
	 * Student st = session.get(Student.class, 1); st.setName("kamal");
	 * st.setAddress("Bhirawa update"); st.setEmail("kamal23@gmail.com");
	 * session.saveOrUpdate(st); tr.commit(); System.out.println("Update Sucess");
	 */
		
	//------delete data---------
		Student st = session.get(Student.class, 2);
		
		session.delete(st);
		tr.commit();
		System.out.println("delete Sucess");
		
		  session.close();
		  factory.close();
		
	
		
	}

}
