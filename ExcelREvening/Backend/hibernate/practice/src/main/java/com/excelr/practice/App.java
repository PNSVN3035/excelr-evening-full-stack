package com.excelr.practice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Laptop l1 = new Laptop();
    	l1.setLid(100);
    	l1.setLname("Mac");
        	
    	Laptop l2 = new Laptop();
    	l2.setLid(101);
    	l2.setLname("Hp");
    	
    	Laptop l3 = new Laptop();
    	l3.setLid(102);
    	l3.setLname("Dell");
    	
    	Student s1 = new Student();
    	s1.setSid(1);
    	s1.setSname("anu");
    	s1.setSmarks(90);
    	List<Laptop> lap_list1 = new ArrayList();
    	lap_list1.add(l1);
    	lap_list1.add(l3);
    	
    	s1.setLaptop(lap_list1);
    	
    	Student s2 = new Student();
    	s2.setSid(2);
    	s2.setSname("prem");
    	s2.setSmarks(85);
    	List<Laptop> lap_list2 = new ArrayList();
    	lap_list2.add(l2);
    	lap_list2.add(l3);
    	
    	s2.setLaptop(lap_list2);
    	
    	List<Student> stud1 = new ArrayList();
    	stud1.add(s1);
    	
    	l1.setStud(stud1);
    	
    	List<Student> stud2 = new ArrayList();
    	stud2.add(s2);
    	
    	l2.setStud(stud2);
    	
    	List<Student> stud3 = new ArrayList();
    	stud3.add(s1);
    	stud3.add(s2);
    	
    	l3.setStud(stud3);
    	
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
        
        tx.commit();
        s.close();
    }
}
