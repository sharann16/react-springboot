package com.student.demo.service;

import java.util.List;

import com.student.demo.model.Student;

public interface UserService {
	 void getstudent(Student student);
	 List<Student> allstudent();
	 void update(String id,Student student);
	 Student getone(String id);
	

}
