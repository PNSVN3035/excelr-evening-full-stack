package com.excelr.evening_hibernate1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student //POJO - plain old java object
{
	@Id
	private int sid;
	private String sname;
	private int marks;
	
	@ManyToMany(mappedBy = "student")
	private List<Laptop> laptop;
	
	public Student() 
	{
		super();
	}

	public Student(int sid, String sname, int marks, List<Laptop> laptop) 
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
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
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}			
}
