package com.student.demo.controller;

import java.util.List;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.model.Student;
import com.student.demo.service.UserService;

import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {
	
	
	@Autowired
	public UserService service;
	
	
	@PostMapping("/student")
	public void getMethodName(@RequestBody Student student) {
		service.getstudent(student);
	}
	
	@GetMapping("/student/all")
	public List<Student> getall() {
		return 	service.allstudent();
	}
	
	@GetMapping("student/{id}")
	public Student geton(@PathVariable String id) {
		
		return service.getone(id);
	}
	
	
	@PutMapping("/student/update/{id}")
	public void putMethodName(@PathVariable String id, @RequestBody Student student) {
		//TODO: process PUT request
		service.update(id,student);
	}
	
	
	

}
