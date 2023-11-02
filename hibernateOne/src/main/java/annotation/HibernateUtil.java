package annotation;

import java.util.Properties;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			
			Properties properties  = new Properties();
			
			properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");//--8 must be used in new version
			properties.put(Environment.HBM2DDL_AUTO, "update");
			
			//--------<!-- below two line is option and avobe 6 is compalsory  -->

			properties.put(Environment.SHOW_SQL, true);
			properties.put(Environment.FORMAT_SQL, true);
			
			configuration.setProperties(properties);
			
			//--------for Student class--------------
			configuration.addAnnotatedClass(Student.class);
			//------####################----------
			
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
		}
		
		return sessionFactory;
	}

}
