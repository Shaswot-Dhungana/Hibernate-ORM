package com.shaswotdhungana.myhibernate;


import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        System.out.println( "Project Running." );
        
        
        
        // Building Session Factory :~  
        
//      SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//      OR
//        
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        
      Configuration cfg = new Configuration();
      cfg.configure("hibernate.cfg.xml");
      SessionFactory sessionFactory = cfg.buildSessionFactory();
        
      
      System.out.println(sessionFactory);
        System.out.println(sessionFactory.isClosed());
        
        
        
        // Taking data from input/keyboard/user.
        
        Scanner scanData = new Scanner(System.in);
        
        System.out.println("   Enter Student Name   :~  ");
		String st_name = scanData.nextLine();
        
		System.out.println("   ");
		System.out.println("   ");
		
		   System.out.println("   Enter Student Address   :~  ");
			String st_address = scanData.nextLine();
	        
		
      
        // creating student
        
        student st = new student();
        st.setName(st_name);
        st.setCountry(st_address);
        
        System.out.println(st);
        
        
        // saving in Database
        
        // opening  session.
        Session session = sessionFactory.openSession();
        
        // Starting transaction 
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        
        // committing transaction
        tx.commit();
        
        // killing session
        session.close();
        
        
        
        
        
        
    }
}
