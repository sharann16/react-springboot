package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column
	private Long mobileno;
	@Column
	private String email;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", mobileno=" + mobileno + ", email=" + email + "]";
	}
	public User(Long mobileno, String email) {
		super();
		this.mobileno = mobileno;
		this.email = email;
	}
	public User() {
		
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
