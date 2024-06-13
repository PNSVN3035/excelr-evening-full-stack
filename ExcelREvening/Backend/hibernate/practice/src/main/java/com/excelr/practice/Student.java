package com.excelr.practice;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
public class Student 
{
	@Id
	private int sid;
	private String sname;
	private String semail;
		
	public Student() {
		super();		
	}
	
	public Student(int sid, String sname, String semail) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
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
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	
	@Override
	public String toString()
	{
		return "Student{" + "sid=" + sid + ", sname=" + sname + ", semail=" + semail + "}";
	}
}
