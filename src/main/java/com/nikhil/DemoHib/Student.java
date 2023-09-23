package com.nikhil.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	@Column(name="student_name")
	private Student_name sname;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sTech=" + sTech + "]";
	}
	private String sTech;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public Student_name getSname() {
		return sname;
	}
	public void setSname(Student_name sname) {
		this.sname = sname;
	}
	public String getsTech() {
		return sTech;
	}
	public void setsTech(String sTech) {
		this.sTech = sTech;
	}
	
	

}
