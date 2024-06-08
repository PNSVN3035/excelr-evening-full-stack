package com.excelr.practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="std_table")
public class Student 
{
	@Id
	@Column(name="std_id")
	private int sid;
	private String sname;
	private int smarks;
	
	@OneToOne
	@JoinColumn(name="lap_id")
	private Laptop laptop;
		
	public Student() {
		super();		
	}
	
	public Student(int sid, String sname, int smarks, Laptop laptop) {
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
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop; 
	}
}
