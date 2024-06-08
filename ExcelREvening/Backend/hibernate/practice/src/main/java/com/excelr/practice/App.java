package com.excelr.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Laptop l1 = new Laptop();
    	l1.setLid(1375);
    	l1.setLname("Mac");
    	
    	Laptop l2 = new Laptop(5798, "Hp");
    	
    	Laptop l3 = new Laptop();
    	l3.setLid(2309);
    	l3.setLname("Dell");
    	
    	Student s1 = new Student(35, "prem", 86, l1);
    	
    	Student s2 = new Student(83, "anu", 98, l3);    	
    	
    	Student s3 = new Student(84, "shiva", 98, l2);
    	
        Configuration cf = new Configuration();
        cf.configure("work.cfg.xml");
        cf.addAnnotatedClass(Student.class);
        cf.addAnnotatedClass(Laptop.class);
        
        SessionFactory sf = cf.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(l1);
        s.save(l2);
        s.save(l3);
        s.save(s1);
        s.save(s2);
        s.save(s3);
        tx.commit();
        s.close();
    }
}
