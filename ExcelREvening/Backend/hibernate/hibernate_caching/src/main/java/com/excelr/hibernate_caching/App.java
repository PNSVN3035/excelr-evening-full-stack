package com.excelr.hibernate_caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
        
        Student std1 = session1.get(Student.class, 1);
        System.out.println(std1);
        
        
        
        tx.commit();
        session1.close();
        
        Session session2 = sf.openSession();
        Transaction tx2 = session2.beginTransaction();
        
        Student std2 = session2.get(Student.class, 1);
        System.out.println(std2);
        
        tx2.commit();
        session2.close();                      
    }
}
