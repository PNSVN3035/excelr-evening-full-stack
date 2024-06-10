package com.excelr.practice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop 
{
	@Id
	private int lid;
	private String lname;
	
	@ManyToMany
	private List<Student> stud;
		
	public Laptop() {
		super();		
	}
	
	public Laptop(int lid, String lname, List<Student> stud) {
		super();
		this.lid = lid;
		this.lname = lname;		
		this.stud = stud;
	}

	public int getlid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	public List<Student> getStud() {
		return stud;
	}

	public void setStud(List<Student> stud) {
		this.stud = stud;
	}
	
}
