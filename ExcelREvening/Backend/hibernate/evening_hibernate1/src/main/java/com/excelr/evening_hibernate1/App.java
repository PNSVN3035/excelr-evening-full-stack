package com.excelr.evening_hibernate1;

import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
    	Laptop l1 = new Laptop();
    	l1.setLid(100);
    	l1.setLname("Dell");
    	Laptop l2 = new Laptop();
    	l2.setLid(101);
    	l2.setLname("Lenovo");
    	Laptop l3 = new Laptop();
    	l3.setLid(102);
    	l3.setLname("Mac");    	    
    	
    	Student s1 = new Student();
    	s1.setSid(1);
    	s1.setSname("prem");
    	s1.setMarks(90);
    	
    	List<Laptop> lap_list1 = new ArrayList();
    	lap_list1.add(l1);
    	lap_list1.add(l3);
    	
    	s1.setLaptop(lap_list1);
    	
    	Student s2 = new Student();
    	s2.setSid(2);
    	s2.setSname("anu");
    	s2.setMarks(95);
    	
    	List<Laptop> lap_list2 = new ArrayList();
    	lap_list2.add(l2);
    	lap_list2.add(l3);
    	
    	s2.setLaptop(lap_list2);    	
    	
    	List<Student> list_std1 = new ArrayList();
    	list_std1.add(s1);
    	
    	l1.setStudent(list_std1);
    	
    	List<Student> list_std2 = new ArrayList();
    	list_std2.add(s2);
    	
    	l2.setStudent(list_std2);
    	
    	List<Student> list_std3 = new ArrayList();
    	list_std3.add(s1);
    	list_std3.add(s2);
    	
    	l3.setStudent(list_std3);
    	    	
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student.class);
        cfg.addAnnotatedClass(Laptop.class);
        
        SessionFactory sf = cfg.buildSessionFactory(); //this method is return to sessionfactory object
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(l1);
        s.save(l2);
        s.save(l3);
        s.save(s1);
        s.save(s2);
        tx.commit();
        s.close();        
    }
}
