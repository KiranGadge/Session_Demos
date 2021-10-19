package com.zensar;

public class Course {
private int cid;
private String coursename;
private String trainer;

public Course() {
	super();
	// TODO Auto-generated constructor stub
}

public Course(int cid, String coursename, String trainer) {
	super();
	this.cid = cid;
	this.coursename = coursename;
	this.trainer = trainer;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCoursename() {
	return coursename;
}

public void setCoursename(String coursename) {
	this.coursename = coursename;
}

public String getTrainer() {
	return trainer;
}

public void setTrainer(String trainer) {
	this.trainer = trainer;
}

@Override
public String toString() {
	return "Course has--> cid=" + cid + ", coursename=" + coursename + ", trainer=" + trainer;
}


}
