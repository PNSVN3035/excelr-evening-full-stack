package com.excelr.practice;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;


public class App 
{
    public static void main( String[] args )
    {
    	
        Configuration cf = new Configuration();
        cf.configure("work.cfg.xml");
        cf.addAnnotatedClass(Student.class);        
        
        SessionFactory sf = cf.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();        
        
        Student std = s.load(Student.class, 1);
        
        System.out.println(std);
        
        
        
        
        tx.commit();
        s.close();       
    }
}
