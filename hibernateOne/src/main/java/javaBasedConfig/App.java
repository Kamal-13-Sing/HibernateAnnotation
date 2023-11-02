package javaBasedConfig;

import org.hibernate.SessionFactory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil.getSessionFactory();

		System.out.println(factory);
	}

}
