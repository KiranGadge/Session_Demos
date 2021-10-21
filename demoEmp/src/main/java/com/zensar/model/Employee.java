package com.zensar.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Employee implements Serializable {
      @Id
      	private int eid;
	private String ename;
	private int salary;
	private String city;
	
	
	public Employee() {
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee has--> eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", City=" +city ;
	}
	
	
	
	
}
