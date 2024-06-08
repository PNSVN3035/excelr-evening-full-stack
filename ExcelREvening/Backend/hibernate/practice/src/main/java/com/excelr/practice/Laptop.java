package com.excelr.practice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop 
{
	@Id
	private int lid;
	private String lname;	
		
	public Laptop() {
		super();		
	}
	
	public Laptop(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;		
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
}
