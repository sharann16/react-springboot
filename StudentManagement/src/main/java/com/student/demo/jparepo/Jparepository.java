package com.student.demo.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.model.Student;

public interface Jparepository  extends JpaRepository<Student, String>{

}
