package com.excelr.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cf = new Configuration();
        cf.configure("work.cfg.xml");
        cf.addAnnotatedClass(Student.class);        
        
        SessionFactory sf = cf.buildSessionFactory();
        Session s1 = sf.openSession();
        Transaction tx = s1.beginTransaction();        
        
        Student std1 = s1.get(Student.class, 1);
        System.out.println(std1);
        tx.commit();
        s1.close();
        
        Session s2 = sf.openSession();
        Transaction tx2 = s2.beginTransaction();
        
        Student std2 = s2.get(Student.class, 1);
        System.out.println(std2);
        tx2.commit();
        s2.close();        
    }
}
