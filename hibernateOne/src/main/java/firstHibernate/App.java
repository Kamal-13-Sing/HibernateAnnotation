package firstHibernate;


import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    /*
     * hibernate.cfg.xml is default name
     * if we want other name like hibernate.xml then we need to specify 
     * like ----- cfg.configure("hibernate.xml");
     *     
     */
       
        /*
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        */
        //---we can also write in this way---------
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
        
    }
}
