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
        
        NativeQuery qry = session1.createSQLQuery("select * from Student"); 
        qry.addEntity(Student.class);
        List list = qry.list();
        for(Object std : list)
        {
        	System.out.println(std);
        }                               
                	
        tx.commit();
        session1.close();                     
    }
}
