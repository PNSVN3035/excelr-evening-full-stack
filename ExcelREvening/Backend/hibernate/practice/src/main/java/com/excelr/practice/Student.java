package com.excelr.practice;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Student 
{
	@Id
	private int sid;
	private String sname;
	private int smarks;
	
	@ManyToMany(mappedBy = "stud")
	private List<Laptop> laptop;
		
	public Student() {
		super();		
	}
	
	public Student(int sid, String sname, int smarks, List<Laptop> laptop) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.laptop = laptop;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String Sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop; 
	}
}
