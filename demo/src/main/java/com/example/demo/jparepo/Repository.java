package com.example.demo.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface Repository extends JpaRepository<User, Integer>{

}
