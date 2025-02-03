package com.student.demo.serviceimplementation;

import java.util.List;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.jparepo.Jparepository;
import com.student.demo.model.Student;
import com.student.demo.service.UserService;

@Service
public class ServiceImplementation implements UserService{
	@Autowired
	private Jparepository repo;
	
	@Override
	public void getstudent(Student student) {
		repo.save(student);
	}
	
	
	@Override
	public List<Student> allstudent(){
		List<Student> allstudent=repo.findAll();
		return allstudent;
		
	}
	
	@Override
	public Student getone(String id) {
		
		Student stu=repo.findById(id).get();
		return stu;
		
	}
	
	@Override
	public void update(String id,Student stu) {
		Student student=repo.findById(id).get();
		student.setName(stu.getName());
		student.setCity(stu.getCity());
		student.setDrpartment(stu.getDrpartment());
		repo.save(student);
	}
	
	
	

}
