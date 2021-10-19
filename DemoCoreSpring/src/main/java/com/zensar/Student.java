package com.zensar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Student
{
	private int sid;;
	private String sname;
	private int per;
	private Course course;
	private List<String>hobbies;
	

	public List<String> getHobbies() {
		return hobbies;
	}



	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}



	public Student() {
		System.out.println("Default constructor of student");
	}



	public Student(int sid, String sname, int per, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.per = per;
		this.course = course;
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



	public int getPer() {
		return per;
	}



	public void setPer(int per) {
		this.per = per;
	}



	public Course getCourse() {
		return course;
	}


@Autowired
	public void setCourse(Course course) {
		this.course = course;
	}



	@Override
	public String toString() {
		return "Student has--> sid=" + sid + ", sname=" + sname + ", per=" + per + "\n course--> " + course + "\n hobbies-->"
				+ hobbies ;
	}



	
	
	

}
