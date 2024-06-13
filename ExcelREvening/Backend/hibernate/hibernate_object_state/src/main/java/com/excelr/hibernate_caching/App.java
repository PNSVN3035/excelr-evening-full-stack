package com.excelr.hibernate_caching;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {    	    	
        Configuration cf = new Configuration();
        cf.configure("hibernate.cfg.xml");
        cf.addAnnotatedClass(Student.class);
        		
		SessionFactory sf = cf.buildSessionFactory(); 
		Session session1 = sf.openSession(); 
		Transaction tx = session1.beginTransaction();		 
        
        Student std = session1.get(Student.class, 1);
        session1.remove(std);
        std.setSemail("premsaivenkat@gmail.com");
                	
        tx.commit();
        session1.close();                     
    }
}
