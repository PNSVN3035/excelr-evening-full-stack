package com.excelr.evening_hibernate1;

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
	private List<Student> student;
		
	public Laptop() {
		super();		
	}

	public Laptop(int lid, String lname, List<Student> student) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.student = student;
	}
	
	public int getLid() {
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
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}		
}
