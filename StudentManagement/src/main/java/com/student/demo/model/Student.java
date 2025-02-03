package com.student.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_detail")
public class Student {
	
	@Id
	@Column
	private String rollno;
	@Column
	private String name;
	@Column
	private String drpartment;
	@Column
	private String city;
	
	public Student() {
		
	}
	public Student(String rollno, String name, String drpartment, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.drpartment = drpartment;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", drpartment=" + drpartment + ", city=" + city + "]";
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDrpartment() {
		return drpartment;
	}
	public void setDrpartment(String drpartment) {
		this.drpartment = drpartment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
